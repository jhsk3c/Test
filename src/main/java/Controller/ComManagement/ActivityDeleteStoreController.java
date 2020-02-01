package Controller.ComManagement;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.ComManagement.ActivityDeleteStoreProductService;
import Service.ComManagement.ActivityDeleteStoreService;



@Controller
public class ActivityDeleteStoreController {
	
	@Autowired
	private ActivityDeleteStoreService activityDeleteStoreService;
	@Autowired
	private ActivityDeleteStoreProductService activityDeleteStoreProductService;
	
	
	
	@RequestMapping("/deleteStore")
	public String deleteStore(@RequestParam(value="stNum")String stNum) {
		activityDeleteStoreService.deleteStore(stNum);
		activityDeleteStoreProductService.deleteProduct(stNum);
	return "Admin/ActivityStoreList";
	}
	
	
}
