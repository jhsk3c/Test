package Repository.Admin;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.ComMemberDTO;
import Model.DTO.StartEndPageDTO;
import Model.DTO.VspotDTO;

@Repository
public class AdminRepository {

	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "adminMapper";

	public List<ComMemberDTO> comList(int page, int limit, Integer su1) { // 승인 미승인을 기다리는 기업회원의 리스트(선생님 회원가입)
		
		
		Long startRow = ((long)page -1 ) * 10 +1;
		Long endRow = startRow + limit -1;
		StartEndPageDTO spage = new StartEndPageDTO(startRow, endRow, su1);
		
		String statement = namespace + ".comList";
		return sqlSession.selectList(statement, spage);
		
	}

	public Integer listCount(Integer su1) { // 리스트 카운트 수(선생님 회원가입)
		ComMemberDTO comMember = new ComMemberDTO();
		comMember.setComLev(su1);
		String statement = namespace + ".listCount";
		return sqlSession.selectOne(statement, comMember);
	}

	public Integer comTrue(String comNum) { // 리스트에서 승인을 누르면 레벨업(선생님 회원가입)
		System.out.println(comNum);
		ComMemberDTO comMember = new ComMemberDTO();
		comMember.setComNum(comNum);
		String statement = namespace + ".comTrue";
		return sqlSession.update(statement, comMember);
		
	}
	
	public Integer comFalse(String comNum) { // 리스트에서 미승인을 누르면 삭제(선생님 회원가입)
		System.out.println(comNum);
		ComMemberDTO comMember = new ComMemberDTO();
		comMember.setComNum(comNum);
		String statement = namespace + ".comFalse";
		return sqlSession.delete(statement, comMember);
		
	}

	public List<VspotDTO> vspotList(int page, int limit) { //회원이 휴양지 등록 신청을 하면  올라오는 List
		Long startRow = ((long)page -1 ) * 10 +1;
		Long endRow = startRow + limit -1;
		StartEndPageDTO spage = new StartEndPageDTO(startRow, endRow);
		String statement = namespace + ".vspotList";
		return sqlSession.selectList(statement, spage);
		
	}

	public Integer vspotListCount() { //회원이 휴양지 등록 신청한 개수
		String statement = namespace + ".vspotListCount";
		return sqlSession.selectOne(statement);
	}

	/*
	 * public VspotDTO vspotDetail(String count) { // 회원의 휴양지 등록을 상세보기
	 * 
	 * String statement = namespace + ".vspotDetail"; return
	 * sqlSession.selectOne(statement, count);
	 * 
	 * }
	 */

	public Integer vspotTrue(String vspotNum) { //리스트에서 승인을 누를시..(휴양지)
		System.out.println(vspotNum);
		VspotDTO vspot = new VspotDTO();
		vspot.setVspotNum(Integer.parseInt(vspotNum));
		String statement = namespace + ".vspotTrue";
		return sqlSession.update(statement, vspot);
	}

	public Integer vspotFalse(String vspotNum) { // 리스트에서 미승인을 누를시 (휴양지)
		System.out.println(vspotNum);
		VspotDTO vspot = new VspotDTO();
		vspot.setVspotNum(Integer.parseInt(vspotNum));
		String statement = namespace + ".vspotFalse";
		return sqlSession.delete(statement, vspot);
	}

	public VspotDTO FileDelete(String vspotNum) { // 리스트에서 미승인을 누를 시 업로드 된 파일이 삭제되기 위해서 
		System.out.println(vspotNum);
		VspotDTO vspot = new VspotDTO();
		vspot.setVspotNum(Integer.parseInt(vspotNum));
		String statement = namespace + ".FileDelete";
		return sqlSession.selectOne(statement, vspot);
		
	}

}
