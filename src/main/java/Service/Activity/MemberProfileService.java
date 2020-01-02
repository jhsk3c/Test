package Service.Activity;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import DTO.Activity.ActivityDTO;
import Model.DTO.AuthInfo;
import Repository.Activity.ActivityRepository;


@Service
public class MemberProfileService {
	@Autowired
	private ActivityRepository activityRepository;
	
	public String ActivitySelect(Model model, HttpSession session) {
		ActivityDTO acti = new ActivityDTO();
		AuthInfo authInfo = (AuthInfo)session.getAttribute("authInfo");
			acti.setMemNum(authInfo.getNum());
			
			System.out.println("접근_SERVICE_MYprofile");
			 System.out.println("memNum 값"); System.out.println(acti.getMemNum());
			 System.out.println("memNum 값"); System.out.println(acti.getMemNum());
			 System.out.println("memNum 값"); System.out.println(acti.getMemNum());
			 System.out.println("memNum 값"); System.out.println(acti.getMemNum());
			 System.out.println("memNum 값"); System.out.println(acti.getMemNum());
			 
		ActivityDTO list = activityRepository.activityProfile(acti);
			System.out.println("활동 넘 값 : " + list.getActivityNum());
			System.out.println("레벨 값 : " + list.getActivityLev());
			System.out.println("레벨 값 : " + list.getActivityLev());
			System.out.println("레벨 값 : " + list.getActivityLev());
			System.out.println("레벨 값 : " + list.getActivityLev());
		model.addAttribute("list", list);
	return "Member/MyProfile";
	}
}
