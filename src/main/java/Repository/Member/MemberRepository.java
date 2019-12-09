package Repository.Member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.DTO.ComMemberDTO;
import Model.DTO.MemberDTO;

public class MemberRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "memberMapper";

	// 회원가입을 위한 Insert (일반 회원)
	public Integer JoinInsert(MemberDTO member) {
		String statement = namespace + ".JoinInsert";
		return sqlSession.insert(statement, member);
	}
	//회원가입 시 아이디 중복체크  (일반 회원)
	public Integer MemCheck(String memId) {	
		String statement = namespace + ".memCheck";
		return sqlSession.selectOne(statement, memId);
	}
	
	// 회원가입을 위한 Insert(기업 회원)***
	public Integer InfoInsert(ComMemberDTO comMember) {
		String statement = namespace + ".InfoInsert";
		return sqlSession.insert(statement, comMember);
		
	}
	
	//회원가입 시 아이디 중복체크 (기업 회원)
	public int ComCheck(String comId) {
		String statement = namespace + ".ComCheck";
		return sqlSession.selectOne(statement, comId);
	}
	

}
