package Controller.ComManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.ComManagement.ActivityStoreListService;


@Controller
public class ActivityStoreListController {
	
	@Autowired
	private ActivityStoreListService activityStoreListService;
	
	
	@RequestMapping("/ActivityStoreList")	//상정 목록
	public String activityStoreList(@RequestParam(value = "page", defaultValue = "1") Integer page, Model model) {		//상점 목록
		
		return activityStoreListService.StoreList(page, model);
	}
}
