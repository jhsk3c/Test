package Controller.Activity;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import DTO.Activity.ActivityDTO;
import Service.Activity.ActivityListService;

@Controller
/* get이랑 post랑 나눌때 */
public class ActivityListController { //휴양지 컨트롤
	
	@Autowired 
	private ActivityListService activityListService;
	
	
	@RequestMapping("Activity/ActivityList")
	public String recreation(Model model, HttpServletRequest request){// 휴양지 

		
		return activityListService.actiList(model, request);
	}
	
	
}
