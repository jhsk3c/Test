package Controller.Shop;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Shop.ShopReservationCommand;
import Model.DTO.ShopReservationDTO;
import Service.Activity.MemberProfileService;
import Service.Shop.ShopDetailService;

@Controller
public class ShopDetailController {

	@Autowired
	private ShopDetailService shopDetailService;
	
	@Autowired
	private MemberProfileService memberProfileService;
	
	
	@RequestMapping("shopDetail")
	public String shopDetail(@RequestParam(value = "num") String shopNum, @RequestParam(value = "page", defaultValue = "1") Integer page,  Model model, HttpSession session, @RequestParam(value = "num2") String vspotNum) {
		
		shopDetailService.shopDetail(shopNum, model, page, session,vspotNum);
		
		return "Spot/shopDetail";
	}
	
	@RequestMapping("/shopListDetailTwo")
	public String DetailTwo(@RequestParam(value = "num") String shopNum, Model model, @RequestParam(value = "page", defaultValue = "1") Integer page,  HttpSession session, @RequestParam(value = "num2") String vspotNum) {
		
		shopDetailService.shopDetail(shopNum, model, page, session, vspotNum);
		
		return "Spot/shopListDetailTwo";
	}
	
	@RequestMapping("/shopReservationPro")
	public String shopReservation(@RequestParam(value = "num") String shopNum, @RequestParam(value = "num2") String vspotNum, HttpSession session, ShopReservationCommand shopReservationCommand, Model model, @RequestParam(value = "page", defaultValue = "1") Integer page) {
		
		shopDetailService.ReservationPro(shopNum, vspotNum, session, shopReservationCommand);
		
		return  memberProfileService.ActivitySelect(model, session, page);
	}
	
	@RequestMapping("/shopDelete")
	public String shopDelete(@RequestParam(value = "num") String shopReservationNum, Model model, HttpSession session , @RequestParam(value = "page", defaultValue = "1") Integer page) {
		
		ShopReservationDTO shopre = new ShopReservationDTO();
		shopre.setShopReservationNum(Integer.parseInt(shopReservationNum));
		
		shopDetailService.shopDelete(shopre);
		
		return memberProfileService.ActivitySelect(model, session, page);
	}
	
	
	
}
