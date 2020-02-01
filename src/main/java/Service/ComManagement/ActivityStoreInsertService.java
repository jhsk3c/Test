package Service.ComManagement;

import java.io.File;
import java.net.http.HttpRequest;
import java.util.UUID;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.web.multipart.MultipartFile;

import Command.Activity.ActivityStoreCommand;
import DTO.Activity.ActivityStoreDTO;
import Repository.Admin.AdminRepository;



@Service
public class ActivityStoreInsertService {

	@Autowired
	private AdminRepository adminRepository;
	
	String original = null;
	String originalFileExtension = null;
	String store = null;
	
	public Integer storeInsert(ActivityStoreCommand activityStoreCommand, HttpSession session, Errors errors, HttpServletRequest request) {
				
				
				
		ActivityStoreDTO actiStoreDTO = new ActivityStoreDTO();
			
		actiStoreDTO.setStoreName(activityStoreCommand.getStoreName());
		actiStoreDTO.setStoreLoc1(activityStoreCommand.getStoreLoc1());
		actiStoreDTO.setStoreLoc2(activityStoreCommand.getStoreLoc2());
		actiStoreDTO.setStoreTel(activityStoreCommand.getStoreTel());
		actiStoreDTO.setStoreBusinessNum(activityStoreCommand.getStoreBusinessNum());
		actiStoreDTO.setStoreOwner(activityStoreCommand.getStoreOwner());
		actiStoreDTO.setStoreMainProduct(activityStoreCommand.getStoreMainProduct());
		
		
		String originalTotal = "";
		String storeTotal = "";
		
		for(MultipartFile mf : activityStoreCommand.getStorePics()) {
			original =  mf.getOriginalFilename();
			originalFileExtension = original.substring(original.lastIndexOf(".")); // 확장자 가져오기 
			store =  UUID.randomUUID().toString().replaceAll("-","") + originalFileExtension;
			
			originalTotal += original +"-";
			storeTotal += store +"-";
			
			String path = request.getServletContext().getRealPath("/");
			path += "WEB-INF/view/Activity/upload/";
				System.out.println();
				System.out.println(path); 
				System.out.println();
			
			File file = new File(path + store);
			
			actiStoreDTO.setOriginalStoreFilename(originalTotal);
			actiStoreDTO.setStoreStoreFilename(storeTotal);
			
				System.out.println(originalTotal);
				System.out.println(storeTotal);
			try {
				mf.transferTo(file);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		for(MultipartFile mf : activityStoreCommand.getBusinessLicense()) {
			original =  mf.getOriginalFilename();
			originalFileExtension = original.substring(original.lastIndexOf(".")); // 확장자 가져오기 
			store =  UUID.randomUUID().toString().replaceAll("-","") + originalFileExtension;
			
			originalTotal += original +"-";
			storeTotal += store +"-";
			
			String path = request.getServletContext().getRealPath("/");
			path += "WEB-INF/view/Activity/upload/";
				System.out.println();
				System.out.println(path); 
				System.out.println();
			
			File file = new File(path + store);
			
			actiStoreDTO.setOriginalBusinessLicenseFilename(originalTotal);
			actiStoreDTO.setStoreBusinessLicenseFilename(storeTotal);
			
				System.out.println(originalTotal);
				System.out.println(storeTotal);
			try {
				mf.transferTo(file);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		Integer result = adminRepository.activityStoreInsert(actiStoreDTO);
		
		return result;
	}

}
