package Controller.Activity;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.Activity.ActivityListService;

@Controller
/* get이랑 post랑 나눌때 */
public class ActivityListController {
	@Autowired 
	private ActivityListService activityListService;

	
	
	@RequestMapping("/ActivityList")
	public String recreation(Model model, HttpServletRequest request, HttpSession session){ //활동 리스트		
		
		activityListService.actiList(model, request, session);
		 
		return "Activity/ActivityList";
	}
	
	
}
