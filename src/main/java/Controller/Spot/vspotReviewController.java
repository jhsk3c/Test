package Controller.Spot;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Spot.VspotReviewCommand;
import Service.Vspot.ReviewInsertService;

@Controller
public class vspotReviewController {
	
	@Autowired
	private ReviewInsertService  reviewInsertService;
	
	@RequestMapping("/vspotReview")
	public String ReviewInsert(@RequestParam(value = "num") String vspotNum, Model model, VspotReviewCommand vspotReviewCommand) { //커맨드. (Insert)되는거니까. 
		
		reviewInsertService.insertList(vspotNum, model);
		
		return "Spot/vspotReview";
	}
	
	@RequestMapping("/vspotReviewPro")
	public String ReviewInsertPro(@RequestParam(value = "num") String vspotNum, Model model, VspotReviewCommand vspotReviewCommand, HttpSession session) { //커맨드. (Insert)되는거니까. 
		
		 reviewInsertService.insert(vspotNum, vspotReviewCommand, model, session); 
		
		return "redirect:/main"; //상세 페이지로 가게...?? => insert를 하고 바로 select를 해서 상세보기로 가야하나?
	}
	
	
	
	
}

