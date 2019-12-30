package Controller.Shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		
		return "Spot/vspotListDetailTwo";
	}
	
}
