package Controller.ComManagement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Shop.ShopCommand;
import Service.Shop.AdminshopInsertService;

@Controller
public class AdminShopController {
	
	@Autowired
	private AdminshopInsertService adminshopInsertService;

	@RequestMapping("/adminshop")
	public String Adminshop(@RequestParam(value = "num") String vspotNum, ShopCommand shopCommand, Model model) {
		//생각을 해보자 어케해야할까요..상점을 보통 지역으로 구분을 해서 나타내야 하잖아.. 결국 ??? => 값을 지역으로 해서 리스트를 뽑아야하고
		//휴양지 등록번호가 필요가 어디에 있을까
		System.out.println("첫번째접근 : " + vspotNum);
		return adminshopInsertService.shopNumList(vspotNum, model);	
	}
	
	@RequestMapping("/adminshopPro")
	public String AdminshopPro(@RequestParam(value = "num") String vspotNum, ShopCommand shopCommand, HttpServletRequest request, HttpSession session) {
		System.out.println("두번째접근 : " + vspotNum);
		adminshopInsertService.shopInsert(vspotNum, shopCommand, request, session);
		return "redirect:/main";
	}
	// 윗부분 사실 회원이 등록하는거 모르고 잘못 이름이랑 해버림..
	
	
	@RequestMapping("/adminshopInsert")
	public String AdminshopIn(@RequestParam(value = "num") String vspotNum, ShopCommand shopCommand, Model model) {
		//생각을 해보자 어케해야할까요..상점을 보통 지역으로 구분을 해서 나타내야 하잖아.. 결국 ??? => 값을 지역으로 해서 리스트를 뽑아야하고
		//휴양지 등록번호가 필요가 어디에 있을까
		System.out.println("첫번째접근 : " + vspotNum);
		return adminshopInsertService.shopNumList(vspotNum, model);	
	}
	
	@RequestMapping("/adminshopInsertPro")
	public String AdminshopInPro(@RequestParam(value = "num") String vspotNum, ShopCommand shopCommand, HttpServletRequest request, HttpSession session) {
		System.out.println("두번째접근 : " + vspotNum);
		adminshopInsertService.adminshopInsert(vspotNum, shopCommand, request, session);
		return "redirect:/main";
	}
	
	
	

}
