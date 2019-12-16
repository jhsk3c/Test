package Controller.Activity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.Activity.ActivityInsertCommand1;
import Service.Activity.ActivityInsertService;

@Controller
public class ActivityInsertController {
	
	@Autowired
	private ActivityInsertService activityInsertService;
	
	
	
	@RequestMapping("/Activity/ActivityInsert")
	public String ActivityForm(Model model) {
		System.out.println("aaaaaa");
		model.addAttribute("activityCommand1", new ActivityInsertCommand1());
		return "Activity/ActivityInsertForm1";
	}
	
	
	@RequestMapping("/Activity/ActivityInsertPro")
	public String ActivityInsertPro(ActivityInsertCommand1 activityCommand1, HttpServletRequest request, HttpSession session, Errors errors) {
		System.out.println("커멘드가요커멘드 ");System.out.println("커멘드가요커멘드 ");
		System.out.println("커멘드가요커멘드 ");
		System.out.println("커멘드가요커멘드 ");
		System.out.println("커멘드가요커멘드 ");
		System.out.println("커멘드가요커멘드 ");
		System.out.println("커멘드가요커멘드 ");
		System.out.println("커멘드가요커멘드 ");
		System.out.println("커멘드가요커멘드 ");
		System.out.println("커멘드가요커멘드 ");
		System.out.println("커멘드가요커멘드 ");
		System.out.println("커멘드가요커멘드 ");
		System.out.println("커멘드가요커멘드 ");
		System.out.println("커멘드가요커멘드 ");
		System.out.println("커멘드가요커멘드 "); 
		System.out.println("커멘드가요커멘드 ");
		System.out.println("커멘드가요커멘드 ");
		System.out.println("커멘드가요커멘드 ");
		
		
		activityInsertService.activityPro(activityCommand1, request, session, errors);
		
		
		return "redirect:/main";
	}
}
