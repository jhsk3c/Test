package Service.ComManagement;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import DTO.Activity.ActivityStoreDTO;
import Repository.Admin.AdminRepository;


@Service
public class ActivityWhichStoreService {
	@Autowired
	private AdminRepository adminRepository;
	
	
	public ActivityStoreDTO AddProduct(String storeNum, HttpSession session, Model model) {
		ActivityStoreDTO storeDTO = new ActivityStoreDTO();
			storeDTO.setStoreNum(storeNum);
				System.out.println("상점 번호: " + storeNum);
		
		ActivityStoreDTO result = adminRepository.storeNameForInsertProduct(storeDTO);
			
		 	System.out.println("상점이름" + result);
	return result;
	}

}
