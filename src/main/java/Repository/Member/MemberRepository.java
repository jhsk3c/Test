package Repository.Member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DTO.Activity.ActivityDTO;
import Model.DTO.ComMemberDTO;
import Model.DTO.MemberDTO;

@Repository
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
	public Integer ComCheck(String comId) {
		String statement = namespace + ".ComCheck";
		return sqlSession.selectOne(statement, comId);
	}
	
	// 일반회원 로그인
	public MemberDTO memLogin(MemberDTO member) {
		String statement = namespace + ".memLogin";
		return sqlSession.selectOne(statement, member);
	}
	
	// 일반회원 로그인 체크
	public Integer LevCheck(String Lev) {
		String statement = namespace + ".LevCheck";
		return sqlSession.selectOne(statement, Lev);
	}
	
	// 기업회원 로그인 체크
	public Integer LevComCheck(String Lev) {
		String statement = namespace + ".LevComCheck";
		return sqlSession.selectOne(statement, Lev);
	}
	
	// 기업회원 로그인
	public ComMemberDTO comLogin(ComMemberDTO comMember) {
		String statement = namespace + ".comLogin";
		return sqlSession.selectOne(statement, comMember);
	}

	public MemberDTO memberSele(MemberDTO member) {
		String statement = namespace + ".memberSele";
		return sqlSession.selectOne(statement, member);
		
	}

	
	

}
