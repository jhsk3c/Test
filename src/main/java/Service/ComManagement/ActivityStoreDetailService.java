package Service.ComManagement;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import DTO.Activity.ActivityStoreDTO;
import Repository.Admin.AdminRepository;


@Service
public class ActivityStoreDetailService {
	
	@Autowired
	private AdminRepository adminRepository;

	
	public  ActivityStoreDTO StoreDetail(String StoreNum, Model model, HttpSession session) {
		ActivityStoreDTO storeDTO = new ActivityStoreDTO();
			System.out.println("접근_Service_ActivityDetail");
			System.out.println("접근");
			System.out.println("접근");
			System.out.println("접근");
			System.out.println("접근");
			System.out.println("storenum : " + StoreNum);
			
			storeDTO.setStoreNum(StoreNum);
			
			System.out.println("storenum : " + storeDTO.getStoreNum());
			
		 ActivityStoreDTO list = adminRepository.StoreDetail(storeDTO);
		 
		 model.addAttribute("list", list);
	return list;
	}


	
	
	
	
	
	
}
