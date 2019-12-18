package Controller.Activity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.Activity.ActivityInsertCommand1;
import Command.Activity.ActivityInsertCommand2;
import Service.Activity.ActivityInsertService;
import Service.Activity.ActivityInsertService2;

@Controller
public class ActivityInsertController {
	
	@Autowired
	private ActivityInsertService activityInsertService;
	private ActivityInsertService2 activityInsertService2;
	
	@RequestMapping("/Activity/ActivityInsert")
	public String ActivityForm(Model model) {
		System.out.println("aaaaaa");
		System.out.println("aaaaaa");
		System.out.println("aaaaaa");
		System.out.println("aaaaaa");
		System.out.println("aaaaaa");
		model.addAttribute("activityCommand1", new ActivityInsertCommand1());
		return "Activity/ActivityInsertForm1";
	}
	
	@RequestMapping("/Activity/ActivityInsertPro")
	public String ActivityInsertPro(ActivityInsertCommand1 activityCommand1, HttpServletRequest request, HttpSession session, Errors errors) {
		activityInsertService.activityPro(activityCommand1, request, session, errors);
		
		return "redirect:/main";
	}
	
		
	
	@RequestMapping("/Activity/ActivityInsert2")
	public String ActivityForm2(Model model) {
		model.addAttribute("activityCommand1", new ActivityInsertCommand1());
		
		return "Activity/ActivityInsertForm2";
	}
	
	@RequestMapping("/Activity/ActivityInsertPro2")
	public String ActivityInsertPro2(ActivityInsertCommand2 activityCommand2, HttpServletRequest request, HttpSession session, Errors errors) {
			activityInsertService2.activityPro(activityCommand2, request, session, errors);
		
		return "redirect:/main";
	}
	
	
	
}
