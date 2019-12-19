package Controller.Activity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import DTO.Activity.ActivityDTO;
import Service.Activity.ActivityInsertService;

@Controller
/* get이랑 post랑 나눌때 */
public class ActivityListController { //휴양지 컨트롤
	
	/*
	 * @Autowired ActivityInsertService activityInsertService;
	 */
	
	@RequestMapping("Activity/ActivityList")
	public String recreation(){// 휴양지 
		System.out.println("접근접근");
		System.out.println("접근접근");
		System.out.println("접근접근");
		System.out.println("접근접근");
		System.out.println("접근접근");
		System.out.println("접근접근");
		System.out.println("접근접근");
		/* List<ActivityDTO> list = recreationService.actiList(); */
		return "Activity/ActivityList";
	}
	
	
}
