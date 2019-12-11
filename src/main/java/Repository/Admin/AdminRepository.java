package Repository.Admin;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.DTO.ComMemberDTO;
import Model.DTO.StartEndPageDTO;

public class AdminRepository {

	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "adminMapper";

	public List<ComMemberDTO> comList(int page, int limit, Integer su1) { // 승인 미승인을 기다리는 기업회원의 리스트
		
		
		Long startRow = ((long)page -1 ) * 10 +1;
		Long endRow = startRow + limit -1;
		StartEndPageDTO spage = new StartEndPageDTO(startRow, endRow, su1);
		
		String statement = namespace + ".comList";
		return sqlSession.selectList(statement, spage);
		
	}

	public Integer listCount(Integer su1) { // 리스트 카운트 수
		ComMemberDTO comMember = new ComMemberDTO();
		comMember.setComLev(su1);
		String statement = namespace + ".listCount";
		return sqlSession.selectOne(statement, comMember);
	}

	public Integer comTrue(String comNum) { // 리스트에서 승인을 누르면 레벨업
		System.out.println(comNum);
		ComMemberDTO comMember = new ComMemberDTO();
		comMember.setComNum(comNum);
		String statement = namespace + ".comTrue";
		return sqlSession.update(statement, comMember);
		
	}
	
	public Integer comFalse(String comNum) { // 리스트에서 미승인을 누르면 삭제
		System.out.println(comNum);
		ComMemberDTO comMember = new ComMemberDTO();
		comMember.setComNum(comNum);
		String statement = namespace + ".comFalse";
		return sqlSession.delete(statement, comMember);
		
	}

}
