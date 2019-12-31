package Controller.Shop;

import java.lang.ProcessBuilder.Redirect;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Shop.ShopReservationCommand;
import Service.Shop.ShopDetailService;

@Controller
public class ShopDetailController {

	@Autowired
	private ShopDetailService shopDetailService;
	
	@RequestMapping("shopDetail")
	public String shopDetail(@RequestParam(value = "num") String shopNum, @RequestParam(value = "page", defaultValue = "1") Integer page,  Model model) {
		
		shopDetailService.shopDetail(shopNum, model, page);
		
		return "Spot/shopDetail";
	}
	
	@RequestMapping("/shopListDetailTwo")
	public String DetailTwo(@RequestParam(value = "num") String shopNum, Model model, @RequestParam(value = "page", defaultValue = "1") Integer page) {
		
		shopDetailService.shopDetail(shopNum, model, page);
		
		return "Spot/shopListDetailTwo";
	}
	
	@RequestMapping("/shopReservationPro")
	public String shopReservation(@RequestParam(value = "num") String shopNum, @RequestParam(value = "num2") String vspotNum, HttpSession session, ShopReservationCommand shopReservationCommand ) {
		
		shopDetailService.ReservationPro(shopNum, vspotNum, session, shopReservationCommand);
		
		return "redirect:/main";
	}
	
	
	
}
