package Service.ComManagement;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import DTO.Activity.ActivityDTO;
import DTO.Activity.ActivityStoreDTO;
import Model.DTO.AuthInfo;
import Model.DTO.MemberDTO;
import Repository.Admin.AdminRepository;


@Service
public class ActivityStoreDetailService {
	
	@Autowired
	private AdminRepository adminRepository;

	
	
	
	public  ActivityStoreDTO StoreDetail(String StoreNum, Model model, HttpSession session) {
								System.out.println("접근_Service_ActivityDetail");
								System.out.println("storenum : " + StoreNum);
		
		ActivityStoreDTO storeDTO = new ActivityStoreDTO();
			storeDTO.setStoreNum(StoreNum);
								System.out.println("storenum : " + storeDTO.getStoreNum());
			
		
		/*
		 * MemberDTO memDTO = new MemberDTO(); AuthInfo authInfo =
		 * (AuthInfo)session.getAttribute("authInfo");
		 * memDTO.setMemNum(authInfo.getNum()); 
		 *  MemberDTO member = adminRepository.storeDetailMemLev(memDTO);
		 */
		 
		
					
	
		ActivityStoreDTO list = adminRepository.StoreDetail(storeDTO);
		 		System.out.println("상점이름 :" + list.getStoreName());
		 		System.out.println("상점위치 : " + list.getStoreLoc1());
		 		System.out.println("등록일 : " + list.getRegistrationDate());
//사진뽑쟈
				if(list.getOriginalStoreFilename() != null) {
					String[] original = list.getOriginalStoreFilename().split("-");
					String[] store = list.getStoreStoreFilename().split("-");
					model.addAttribute("originalStore", original);
					model.addAttribute("storeStore", store);
				}
				if(list.getOriginalBusinessLicenseFilename() != null) {
					String[] original = list.getOriginalBusinessLicenseFilename().split("-");
					String[] store = list.getStoreBusinessLicenseFilename().split("-");
					model.addAttribute("originalBL", original);
					model.addAttribute("storeBL", store);
				}
		 		
		 		
		 		
//데이트타입
			Date registrationDate = new Date();
			SimpleDateFormat trf = new SimpleDateFormat("yyyy-MM-dd");
				registrationDate = list.getRegistrationDate();
				String rDate = trf.format(registrationDate);
						System.out.println("등록일: " + rDate);
						
		 
		 
			if(list.getOriginalStoreFilename() != null) {
				String[] original = list.getOriginalStoreFilename().split("-");
				String[] store = list.getOriginalStoreFilename().split("-");
				
			model.addAttribute("original", original);
			model.addAttribute("store", store);
			}
			
		model.addAttribute("rDate", rDate);
		model.addAttribute("list", list);
	return list;
	}


	
	
	
	
	
	
}
