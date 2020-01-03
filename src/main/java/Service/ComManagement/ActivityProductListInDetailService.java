package Service.ComManagement;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import DTO.Activity.ActivityProductDTO;
import Repository.Admin.AdminRepository;


@Service
public class ActivityProductListInDetailService {

	@Autowired
	private AdminRepository adminRepository;
	
	public List<ActivityProductDTO> ProductList(String storeNum, Model model, HttpSession session) {
		ActivityProductDTO productDTO = new ActivityProductDTO();
			productDTO.setStoreNum(storeNum);
			
			System.out.println("접근_serivice_productList");
			System.out.println(productDTO.getStoreNum());
			System.out.println(productDTO.getProductName());
			System.out.println(productDTO.getProductPrice());
			System.out.println(productDTO.getProductContent());
			System.out.println(productDTO.getProductOption());
			System.out.println(productDTO.getOriginalFilename());
			System.out.println(productDTO.getStoreFilename());
			
			System.out.println("storenum : " + productDTO.getStoreNum());
			
		List<ActivityProductDTO> list = adminRepository.ProductListInStoreDetail(productDTO);
			
		//사진뽑아요~
				if(list.get(0).getOriginalFilename() != null) {
					String[] original = list.get(0).getOriginalFilename().split("-");
					String[] store = list.get(0).getStoreFilename().split("-");
					model.addAttribute("original", original);
					model.addAttribute("store", store);
				}
		
		model.addAttribute("product", list);
	return list;
	}
	
	
}
