package Repository.Member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.DTO.MemberDTO;

public class MemberRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "memberMapper";

	public Integer JoinInsert(MemberDTO member) {
		String statement = namespace + ".JoinInsert";
		return sqlSession.insert(statement, member);
	}

	public MemberDTO UserCheck(MemberDTO member) {
		
		String statement = namespace + ".UserCheck";
		return sqlSession.selectOne(statement, member);
	}
	

}
