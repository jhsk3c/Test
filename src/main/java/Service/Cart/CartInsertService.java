package Service.Cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.DTO.CartDTO;
import Repository.Cart.CartRepository;

@Service
public class CartInsertService {
	@Autowired
	CartRepository cartRepository;

	public Integer countCart(String goodsNum, String memId) {
		CartDTO dto = new CartDTO();
		dto.setGoodsNum(Integer.parseInt(goodsNum));
		dto.setMemId(memId);
		Integer result = cartRepository.countCart(dto);
		return result;
	}

	public void InsertCart(CartDTO cart) {
		cartRepository.insertCart(cart);
	}

	public void updateCart(CartDTO cart) {
		cartRepository.updateCart(cart);
	}

}
