package Repository.Admin;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.DTO.ComMemberDTO;

public class AdminRepository {

	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "adminMapper";

	public List<ComMemberDTO> comList() {
		String statement = namespace + ".comList";
		return sqlSession.selectList(statement);
		
	}

}
