package Controller.Shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Shop.AdminShopDetailService;

@Controller
public class ShopListDetailController {
	
	@Autowired
	private AdminShopDetailService adminShopDetailService;
	
	@RequestMapping("/ShopDetail")
	public String ListDetail(@RequestParam(value = "num") String shopNum ,Model model) {
		
		adminShopDetailService.shopDetail(shopNum, model);
		
		return "Spot/shopListDetail";
	}

}
