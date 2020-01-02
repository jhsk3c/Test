package Controller.Shop;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Shop.ShopReviewCommand;
import Service.Shop.ShopReviewInsertService;


@Controller
public class ShopReviewController {
	
	@Autowired
	private ShopReviewInsertService shopReviewInsertService;
	
	@RequestMapping("/shopReview")
	public String ReviewInsert(@RequestParam(value = "num") String shopNum, Model model, ShopReviewCommand shopReviewCommand, HttpSession session) { //커맨드. (Insert)되는거니까. 
		
		shopReviewInsertService.listNum(shopNum, model, session);
		
		return "Spot/shopReview";
	}
	
	@RequestMapping("/shopReviewPro")
	public String ReviewInsertPro(@RequestParam(value = "num") String shopNum, Model model, ShopReviewCommand shopReviewCommand, HttpSession session) { //커맨드. (Insert)되는거니까. 
		
		shopReviewInsertService.insert(shopNum, shopReviewCommand, model, session); 
		
		return "redirect:/main"; //상세 페이지로 가게...?? => insert를 하고 바로 select를 해서 상세보기로 가야하나?
	}

}
