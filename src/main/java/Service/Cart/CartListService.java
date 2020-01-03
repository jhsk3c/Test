package Service.Cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import Model.DTO.CartDTO;
import Model.DTO.CartJoinDTO;
import Repository.Cart.CartRepository;

@Service
public class CartListService {
	@Autowired
	CartRepository cartRepository;

	@Transactional
	public List<CartJoinDTO> cartList(String memId, Model model) {
		CartJoinDTO dto = new CartJoinDTO();
		CartDTO cart = new CartDTO();
		cart.setMemId(memId);
		dto.setCartDTO(cart);
		List<CartJoinDTO> cartList = cartRepository.cartList(dto);
//		for (CartJoinDTO c : cartList) {
//			System.out.println("장바구니 리스트 이름 :: " + c.getGoodsDTO().getGoodsName());
//			System.out.println("장바구니 리스트 가격 :: " + c.getGoodsDTO().getGoodsPrice());
//			System.out.println("장바구니 리스트 개수 :: " + c.getCartDTO().getQty());
//		}
		model.addAttribute("list", cartList);
		return cartList;
	}

	@Transactional
	public int totalMoney(String memId) {
		int result = cartRepository.sumMoney(memId);
		return result;
	}

}
