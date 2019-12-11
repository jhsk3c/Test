package Controller.ComManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.ComManagement.ComFalseService;
import Service.ComManagement.ComManaService;
import Service.ComManagement.ComTrueService;

@Controller
public class ComManagementController {
	
	@Autowired
	private ComManaService comManaService;
	
	@Autowired
	private ComTrueService comTrueService;
	
	@Autowired
	private ComFalseService comFalseService;
	
	@RequestMapping("admin/comMana") //리스트를 뽑는 내용
	public String comMana(@RequestParam(value = "page", defaultValue = "1")	Integer page, Model model) {
		
		return comManaService.comList(page, model);
	}
	
	@RequestMapping("admin/listTrue") // 승인을 눌렀을 시 LEV이 상승과 함께 리스트 출력
	public String True(Model model, @RequestParam(value = "num") String comNum, @RequestParam(value = "page", defaultValue = "1") Integer page)  {
		System.out.println(comNum);
		Integer result = comTrueService.comTrue(comNum);
		
		if(result != null) {
			return comManaService.comList(page, model);
		} else {
			return "redirect:/main";
		}
		
	}
	
	@RequestMapping("admin/listFalse") // 미승은을 눌렀을 시 삭제와 함께 리스트 출력
	public String False(Model model, @RequestParam(value = "num") String comNum, @RequestParam(value = "page", defaultValue = "1") Integer page)  {
		System.out.println(comNum);
		Integer result = comFalseService.comFalse(comNum);
		
		if(result != null) {
			return comManaService.comList(page, model);
		} else {
			return "redirect:/main";
		}
		
	}

}
