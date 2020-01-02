package Controller.Activity;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Activity.ActivityDetailService;


@Controller
public class ActivityDetailController {
	
	@Autowired
	private ActivityDetailService activityDetailService;
	
	
	@RequestMapping("/ActivityDetail")
	public String activityDetail(@RequestParam(value="actiNum") String acticityNum, Model model, HttpSession session ) {
		
		System.out.println("활동 넘값 : " + acticityNum);
		System.out.println("접근");
		System.out.println("접근_Controller_ActivityDetail");
		System.out.println("접근");
		System.out.println("접근");
		System.out.println("접근");
		System.out.println("접근");
		
		activityDetailService.activityDetail(model, acticityNum, session);
	return "Activity/ActivityDetail";
	}
	
	
	
}
