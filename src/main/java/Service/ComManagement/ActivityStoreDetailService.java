package Service.ComManagement;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import DTO.Activity.ActivityStoreDTO;
import Model.DTO.AuthInfo;
import Model.DTO.MemberDTO;
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
			
		 MemberDTO memDTO = new MemberDTO();	
		AuthInfo authInfo = (AuthInfo)session.getAttribute("authInfo");
			memDTO.setMemNum(authInfo.getNum());
			System.out.println("현재 맴넘 값 : " + memDTO.getMemNum());
			System.out.println("현재 맴넘 값 : " + memDTO.getMemNum());
			System.out.println("현재 맴넘 값 : " + memDTO.getMemNum());
			System.out.println("현재 맴넘 값 : " + memDTO.getMemNum());
			System.out.println("현재 맴넘 값 : " + memDTO.getMemNum());
			
		 MemberDTO member = adminRepository.storeDetailMemLev(memDTO);
		 
		 ActivityStoreDTO list = adminRepository.StoreDetail(storeDTO);

		 model.addAttribute("member", member);
		 model.addAttribute("list", list);
	return list;
	}


	
	
	
	
	
	
}
