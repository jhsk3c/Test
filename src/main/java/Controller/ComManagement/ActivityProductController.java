package Controller.ComManagement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Activity.ActivityProductCommand;
import Service.ComManagement.ActivityProductInsertService;



@Controller
public class ActivityProductController {
	
	@Autowired
	private ActivityProductInsertService activityProductInsertService;
	
	
	
	
	@RequestMapping("/activityProductInsert")
	public String activityProductInsert(@RequestParam(value = "stNum") String storeNum, ActivityProductCommand activityProductCommand, Model model) {
		System.out.println(storeNum);
	return activityProductInsertService.pr(storeNum, model);
	}
	
	
	@RequestMapping("/activityProductInsertPro")
	public String ActivityProductInsertPro(@RequestParam(value = "stNum") String storeNum, ActivityProductCommand activityProductCommand, Errors errors, HttpServletRequest request, HttpSession session) {
		System.out.println(storeNum);
		System.out.println(activityProductCommand.getProductName());
		System.out.println("접근Controller_Product_Insert");
		System.out.println("접근");
		System.out.println("접근");
		System.out.println("접근");
		System.out.println("접근");
		System.out.println("접근");
		System.out.println("접근");
		
		activityProductInsertService.ProductInsert(storeNum ,activityProductCommand, session, errors, request);
		
		System.out.println("접근_Controller_productInsert끝났어요");		
		System.out.println("접근_Controller_productInsert끝났어요");	
		System.out.println("접근_Controller_productInsert끝났어요");	
		System.out.println("접근_Controller_productInsert끝났어요");	
		System.out.println("접근_Controller_productInsert끝났어요");	
		
		return "redirect:/main";
	}
}
