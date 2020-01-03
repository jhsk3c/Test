package Repository.Goods;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.AduitDTO;
import Model.DTO.GoodsDTO;

@Repository
public class GoodsRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "Repository.Goods.GoodsMapper";

	public Integer goodsInsert(GoodsDTO goods) {
		String statement = namespace + ".goodsInsert";
		return sqlSession.insert(statement, goods);
	}

	public Integer findAuditNum(AduitDTO dto) { // memId로 auditNum을 찾는당
		String statement = namespace + ".findANum";
		return sqlSession.selectOne(statement, dto);
	}

	public Integer findParticipationNum(Integer auditNum) {
		String statement = namespace + ".findPNum";
		return sqlSession.selectOne(statement, auditNum);
	}

	public List<GoodsDTO> goodsList() {
		String statement = namespace + ".goodsList";
		List<GoodsDTO> list = sqlSession.selectList(statement);
		return list;
	}

	public GoodsDTO goodsDetail(GoodsDTO dto) {
		String statement = namespace + ".goodsDetail";
		return sqlSession.selectOne(statement, dto);
	}

	public Integer goodsDelete(GoodsDTO dto) {
		String statement = namespace + ".goodsDelete";
		return sqlSession.delete(statement, dto);
	}

	public Integer goodsModify(GoodsDTO dto) {
		String statement = namespace + ".goodsModify";
		return sqlSession.update(statement, dto);
	}

}
