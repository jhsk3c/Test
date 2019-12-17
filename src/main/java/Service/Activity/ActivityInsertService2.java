package Service.Activity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import Command.Activity.ActivityInsertCommand2;
import DTO.Activity.ActivityDTO;
import Model.DTO.AuthInfo;
import Repository.Activity.ActivityRepository;

@Service
public class ActivityInsertService2 {
	@Autowired
	private ActivityRepository activityRepository;
	
	public void activityPro(ActivityInsertCommand2 activityCommand2, HttpServletRequest request, HttpSession session, Errors errors) {
		ActivityDTO acti = new ActivityDTO();
		
		AuthInfo authInfo = (AuthInfo)session.getAttribute("authInfo");
		
		acti.setMemNum(authInfo.getNum());
		
		acti.setActivityCost(Integer.parseInt(activityCommand2.getActivityCost()));
		acti.setActivityProduct(activityCommand2.getActivityProduct());
		
		Integer result = activityRepository.activityInsert2(acti);
	}
	
	
}
