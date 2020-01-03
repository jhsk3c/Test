package Controller.Cart;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Model.DTO.AuthInfo;
import Model.DTO.CartJoinDTO;
import Service.Cart.CartListService;

@Controller
public class CartListController {
	@Autowired
	CartListService cartListService;

	@RequestMapping("cartList")
	public String cartList(HttpSession session, Model model) {
		String memId = ((AuthInfo) session.getAttribute("authInfo")).getId();
		Map<String, Object> map = new HashMap<String, Object>();
		List<CartJoinDTO> list = cartListService.cartList(memId, model); // 장바구니 정보
		int totalMoney = cartListService.totalMoney(memId); // 장바구니 전체 금액 호출
		int deliveryPrize = totalMoney >= 30000 ? 0 : 2500; // 배송비는 3만원 이상 결제시 무료, 아니면 2500원
		map.put("list", list); // 장바구니정보 저장
		map.put("count", list.size()); // 장바구니 상품의 유무
		map.put("totalMoney", totalMoney); // 장바구니 전체 금액
		map.put("deliveryPrize", deliveryPrize); // 배송금액
		map.put("allTotalMoney", totalMoney + deliveryPrize); // 상품 전체금액 + 배송금액
		model.addAttribute("map", map);
//		model.addAttribute("list", list);
		return "Cart/cartList";
	}
}
