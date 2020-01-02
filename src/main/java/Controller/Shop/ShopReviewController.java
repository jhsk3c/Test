package Controller.Shop;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Shop.ShopReviewCommand;
import Service.Shop.ShopDetailService;
import Service.Shop.ShopReviewInsertService;


@Controller
public class ShopReviewController {
	
	@Autowired
	private ShopReviewInsertService shopReviewInsertService;
	
	@Autowired
	private ShopDetailService shopDetailService;
	
	@RequestMapping("/shopReview")
	public String ReviewInsert(@RequestParam(value = "num") String shopNum, Model model, ShopReviewCommand shopReviewCommand, HttpSession session) { //커맨드. (Insert)되는거니까. 
		
		shopReviewInsertService.listNum(shopNum, model, session);
		
		return "Spot/shopReview";
	}
	
	@RequestMapping("/shopReviewPro")
	public String ReviewInsertPro(@RequestParam(value = "num") String shopNum, Model model, ShopReviewCommand shopReviewCommand, HttpSession session, @RequestParam(value = "page", defaultValue = "1") Integer page,  @RequestParam(value = "num2") String vspotNum) { //커맨드. (Insert)되는거니까. 
		 	
		shopReviewInsertService.insert(shopNum, shopReviewCommand, model, session); 
		
		shopDetailService.shopDetail(shopNum, model, page, session,vspotNum);
		
		return "Spot/shopDetail";
	}

}
