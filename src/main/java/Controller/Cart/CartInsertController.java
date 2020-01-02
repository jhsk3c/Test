package Controller.Cart;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Model.DTO.AuthInfo;
import Model.DTO.CartDTO;
import Service.Cart.CartInsertService;

@Controller
public class CartInsertController {
	@Autowired
	CartInsertService cartInsertService;

	@RequestMapping("cartInsert")
	public String cartInsert(@RequestParam(value = "goodsNum") String goodsNum, @RequestParam(value = "qty") String qty,
			@RequestParam(value = "pNum") String pNum, @RequestParam(value = "aNum") String aNum, HttpSession session) {
		String memId = ((AuthInfo) session.getAttribute("authInfo")).getId();
		// 장바구니에 기존 상품이 있는지 검사
		Integer count = cartInsertService.countCart(goodsNum, memId);

		CartDTO cart = new CartDTO();
		cart.setMemId(memId);
		cart.setGoodsNum(Integer.parseInt(goodsNum));
		cart.setAduitNum(Integer.parseInt(aNum));
		cart.setParticipationNum(Integer.parseInt(pNum));
		cart.setQty(Integer.parseInt(qty));
		if (count == 0) {
			cartInsertService.InsertCart(cart);
		} else {
			cartInsertService.updateCart(cart);
		}
		return "redirect:/cartList";
	}
}
