package Controller.ComManagement;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.ComManagement.ActivityProductListInDetailService;
import Service.ComManagement.ActivityStoreDetailService;


@Controller
public class ActivityStoreDetailController {
	
	@Autowired
	private ActivityStoreDetailService activityStoreDetailService;
	@Autowired
	private ActivityProductListInDetailService activityProductListInDetailService;
	
	
	@RequestMapping("/StoreDetail")
	public String StoreDetail(@RequestParam(value="stNum") String StoreNum, Model model, HttpSession session) {
			System.out.println("접근_Controller_StoreDetail");
			System.out.println("상점 넘값 : " + StoreNum);
			System.out.println(StoreNum);
			System.out.println(StoreNum);
			System.out.println(StoreNum);
			System.out.println(StoreNum);
			
		activityStoreDetailService.StoreDetail(StoreNum, model, session);
		activityProductListInDetailService.ProductList(StoreNum, model, session);
		
	return "Admin/ActivityStoreDetail";
	}
}
