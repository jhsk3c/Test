package Repository.Vspot;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.VspotDTO;

@Repository
public class VspotRepository {

	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "spotMapper";

	
	public Integer vspotInsert(VspotDTO spot) { //휴양지 등록 
		String statement = namespace + ".vspotInsert";
		return sqlSession.insert(statement, spot);
	}


	public List<VspotDTO> memList() { //휴양지 리스틑 뽑기.
		String statement = namespace + ".memList";
		return sqlSession.selectList(statement);
	}
	
}
