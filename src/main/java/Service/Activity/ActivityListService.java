package Service.Activity;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import DTO.Activity.ActivityDTO;
import Model.DTO.AuthInfo;
import Repository.Activity.ActivityRepository;

@Service
public class ActivityListService {	
	@Autowired
	private ActivityRepository activityRepository;
	
	
	public String actiList(Model model, HttpServletRequest request ,HttpSession session) {
		
		ActivityDTO acti= new ActivityDTO();
		AuthInfo authInfo = (AuthInfo)session.getAttribute("authInfo");
		acti.setMemNum(authInfo.getNum());	 // 세션
		
		List<ActivityDTO> list = activityRepository.activityList();
		ActivityDTO forToCheck = activityRepository.forToCheck(acti);
		
		//model.addAttribute("aa", authInfo.getNum()); 저장된 회원 값 가져오기
		
		model.addAttribute("list", list);
		model.addAttribute("forToCheck", forToCheck);
		
		return "Activity/ActivityList";
	}

	
}
