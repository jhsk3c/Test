package Service.ComManagement;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.multipart.MultipartFile;

import Command.Activity.ActivityProductCommand;
import DTO.Activity.ActivityProductDTO;
import DTO.Activity.ActivityStoreDTO;
import Repository.Admin.AdminRepository;



@Service
public class ActivityProductInsertService {

	
	@Autowired
	private AdminRepository adminReository;	
	
	
	String original = null;
	String originalFileExtension = null;
	String store = null;
	
	
	public Integer ProductInsert(String storeNum, ActivityProductCommand activityProductCommand, HttpSession session, Errors errors, HttpServletRequest request) {
		
		ActivityProductDTO actiProductDTO = new ActivityProductDTO();
		
		System.out.println(storeNum);
		
		actiProductDTO.setStoreNum(storeNum);
		actiProductDTO.setProductOption(activityProductCommand.getProductOption());
		actiProductDTO.setProductName(activityProductCommand.getProductName());
		actiProductDTO.setProductPrice(Integer.parseInt(activityProductCommand.getProductPrice()));
		actiProductDTO.setProductContent(activityProductCommand.getProductContent());
		
		
		String originalTotal = "";
		String storeTotal = "";
		
		
			for(MultipartFile mf : activityProductCommand.getProductIamge()) {
				original =  mf.getOriginalFilename();
				originalFileExtension = original.substring(original.lastIndexOf(".")); // 확장자 가져오기 
				store =  UUID.randomUUID().toString().replaceAll("-","")
						+ originalFileExtension;
				
				originalTotal += original +"-";
				storeTotal += store +"-";
				
				String path = request.getServletContext().getRealPath("/");
				path += "WEB-INF/view/Activity/upload/";
				System.out.println();
				System.out.println(path);
				System.out.println();
				
				File file = new File(path + store);
				
				actiProductDTO.setOriginalFilename(originalTotal);
				actiProductDTO.setStoreFilename(storeTotal);
				
				System.out.println(originalTotal);
				System.out.println(storeTotal);
				
					try {
						mf.transferTo(file);
						
					} catch (Exception e) {
						e.printStackTrace();
					}
			}
			
			System.out.println((actiProductDTO.getStoreNum()));
			System.out.println(actiProductDTO.getProductPrice());
			System.out.println("넘어오는 옵션 : " + actiProductDTO.getProductOption());
			System.out.println(actiProductDTO.getProductName());
			System.out.println(actiProductDTO.getProductContent());
			System.out.println(actiProductDTO.getStoreFilename());
			System.out.println(actiProductDTO.getOriginalFilename());
			
			
			
		Integer result = adminReository.productInsert(actiProductDTO);
		
		return result;	
	}


	
	
	
	
	//form에서 stNum값 찾는 거 
	public String pr(String storeNum, Model model) {
		// TODO Auto-generated method stub
		
		System.out.println(storeNum);
		
		ActivityStoreDTO list = adminReository.prpr(storeNum);
		
		model.addAttribute("list", list);
		
		return "Admin/ActivityProductInsertForm";
		
	}


	

}
