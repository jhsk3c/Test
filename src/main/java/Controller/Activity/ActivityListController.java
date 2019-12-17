package Controller.Activity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import DTO.Activity.ActivityDTO;
import Service.Activity.ActivityListService;

@Controller
/* get이랑 post랑 나눌때 */
public class ActivityListController { //휴양지 컨트롤
	
	@Autowired 
	private ActivityListService activityListService;
	
	
	@RequestMapping("Activity/ActivityList")
	public String recreation(){// 휴양지 

		
		return "activityListService.actiList()";
	}
	
	
}
