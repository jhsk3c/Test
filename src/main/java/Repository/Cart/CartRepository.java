package Repository.Cart;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.CartDTO;
import Model.DTO.CartJoinDTO;

@Repository
public class CartRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "Repository.Cart.CartMapper";

	public Integer countCart(CartDTO dto) { // 장바구니에 동일한 상품 확인
		String statement = namespace + ".countCart";
		return sqlSession.selectOne(statement, dto);
	}

	public void insertCart(CartDTO cart) {
		String statement = namespace + ".insertCart";
		sqlSession.insert(statement,cart);
	}

	public List<CartJoinDTO> cartList(CartJoinDTO dto) {
		String statement = namespace + ".cartList";
		return sqlSession.selectList(statement, dto);
	}

	public int sumMoney(String memId) {
		String statement = namespace + ".sumMoney";
		return sqlSession.selectOne(statement, memId);
	}

	public void updateCart(CartDTO cart) {
		String statement = namespace + ".updateCart";
		sqlSession.update(statement, cart);
	}

}
