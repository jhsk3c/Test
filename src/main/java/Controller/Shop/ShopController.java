package Controller.Shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopController {

	@RequestMapping("/Shop/shopList")
	public String shopList() {
		
		return "Shop/shopList";
	}
}
