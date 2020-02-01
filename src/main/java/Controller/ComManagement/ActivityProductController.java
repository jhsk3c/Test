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
import DTO.Activity.ActivityStoreDTO;
import Service.ComManagement.ActivityProductInsertService;
import Service.ComManagement.ActivityWhichStoreService;



@Controller
public class ActivityProductController {
	
	@Autowired
	private ActivityProductInsertService activityProductInsertService;
	@Autowired
	private ActivityWhichStoreService activityWhichStoreService;
	
	
	
	@RequestMapping("/activityProductInsert")
	public String activityProductInsert(@RequestParam(value = "stNum") String storeNum,HttpSession session,  ActivityProductCommand activityProductCommand, Model model) {
				System.out.println(storeNum);
			
		ActivityStoreDTO list = activityProductInsertService.pr(storeNum, model);		
			model.addAttribute("list", list);
		
		ActivityStoreDTO result = activityWhichStoreService.AddProduct(storeNum, session, model);
				String storeName = result.getStoreName();
			model.addAttribute("storeName", storeName);
			
			
	return "Admin/ActivityProductInsertForm";
	}
	
	
	@RequestMapping("/activityProductInsertPro")
	public String ActivityProductInsertPro(@RequestParam(value = "stNum") String storeNum, ActivityProductCommand activityProductCommand, Errors errors,Model model, HttpServletRequest request, HttpSession session) {
				System.out.println(storeNum);
				System.out.println(activityProductCommand.getProductName());
				System.out.println("접근Controller_Product_Insert");
				System.out.println("접근");
				System.out.println("접근");
		activityProductInsertService.ProductInsert(storeNum ,activityProductCommand, session, errors, request);
				System.out.println("접근_Service_productInsert끝났어요");	
		
			
		
	return "redirect:/ActivityStoreList";
	}
}
