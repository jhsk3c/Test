package Repository.Vspot;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.DTO.MemberDTO;
import Model.DTO.VspotDTO;

public class VspotRepository {

	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "spotMapper";

	public Integer vspotInsert(VspotDTO spot) { //휴양지 등록 
		String statement = namespace + ".vspotInsert";
		return sqlSession.insert(statement, spot);
	}
	
}
