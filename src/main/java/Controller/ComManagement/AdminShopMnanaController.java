package Controller.ComManagement;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Shop.AdminShopManaService;

@Controller
public class AdminShopMnanaController {
	
	@Autowired
	private AdminShopManaService adminShopMana;
	
	@RequestMapping("/shopMana")
	public String AdminShopMn(@RequestParam(value = "page", defaultValue = "1") Integer page, Model model) {
		
		return adminShopMana.list(page, model);
	}
	
	@RequestMapping("/shopManaTrue")
	public String AdminShopMn(@RequestParam(value = "num") String shopNum, @RequestParam(value = "page", defaultValue = "1") Integer page, Model model) {
		
		Integer result = adminShopMana.listTrue(shopNum);
		
		if(result != null) {
			return adminShopMana.list(page, model);
		} else {
			return "redirect:/main";
		}
	}
	
	@RequestMapping("/shopManaFalse") // 비승인을 눌렀을  삭제와 함께 리스트 출력
	public String False(Model model, @RequestParam(value = "num") String shopNum, @RequestParam(value = "page", defaultValue = "1") Integer page, HttpServletRequest request)  {
		System.out.println(shopNum);
		Integer result = adminShopMana.listFalse(shopNum, request);
		
		if(result != null) {
			return adminShopMana.list(page, model);
		} else {
			return "redirect:/main";
		}
		
	}

}
