package Controller.ComManagement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.ComManagement.ActivityAcceptService;
import Service.ComManagement.ActivityListFalseService;
import Service.ComManagement.ActivityListTrueService;
import Service.ComManagement.FileSerivce;

@Controller
public class ActivityManagementController {
	@Autowired
	private ActivityAcceptService activityAcceptService;
	@Autowired
	private ActivityListTrueService activityListTrueService;
	@Autowired
	private ActivityListFalseService activityListFalseService;
	
	
	
	
	
	@RequestMapping("/activity")
	public String memvspot(@RequestParam(value = "page", defaultValue = "1") Integer page, Model model) {		//활동 승인 미승인 페이지 ,셀렉트로 불러오는 거면 service에서 경로 불러오는거야 여기서는 return에선 service메소드 불러오면 돼
		
		return activityAcceptService.activityAcceptList(page, model);
	}
	
	
	
	@RequestMapping("/activityListTrue") // 승인 눌렀을 때
	public String True(Model model, @RequestParam(value = "num") String activityNum, @RequestParam(value = "page", defaultValue = "1") Integer page)  {
		Integer result = activityListTrueService.True(activityNum);
		
		System.out.println(activityNum);
		System.out.println("접근AdminController");
		System.out.println("접근True");
		System.out.println("접근");
		System.out.println("접근");
		System.out.println("접근");
		System.out.println("접근");
		System.out.println("접근");
		System.out.println("접근");
		System.out.println("접근");
		
		if(result != null) {
			return activityAcceptService.activityAcceptList(page, model);
		} else {
			return "redirect:/main";
		}
	}
	
	
	@RequestMapping("/activityListFalse") // 미승인 목록에서 삭제
	public String False(Model model, @RequestParam(value = "num") String activityNum, @RequestParam(value = "page", defaultValue = "1") Integer page, HttpServletRequest request)  {
		Integer result = activityListFalseService.activityFalse(activityNum, request);
		
		
		
		if(result != null) {
			return activityAcceptService.activityAcceptList(page, model);
		} else {
			return "redirect:/main";
		}
		
	}
	
	

	
	
}
