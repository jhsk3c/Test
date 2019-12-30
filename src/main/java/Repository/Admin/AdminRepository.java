package Repository.Admin;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.ComMemberDTO;
import Model.DTO.ShopDTO;
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

	public VspotDTO FileDelete(String vspotNum) { // 리스트에서 미승인을 누를 시 업로드 된 파일이 삭제되기 위해서 (상세보기와 상점 등록 하기위해 num 찾기)
		VspotDTO vspot = new VspotDTO();
		vspot.setVspotNum(Integer.parseInt(vspotNum));
		String statement = namespace + ".FileDelete";
		return sqlSession.selectOne(statement, vspot);
		
	}

	public Integer adminvspotInsert(VspotDTO spot) { // 관리자가 휴양지 등록하는것
		String statement = namespace + ".adminvspotInsert";
		return sqlSession.insert(statement, spot);
	}

	public Integer shopInsert(ShopDTO sdto) { //관리자가 상점 등록하는
		String statement = namespace + ".shopInsert";
		return sqlSession.insert(statement, sdto);
	}

	public List<ShopDTO> list(int page, int limit) { //관리자가 상점 승인 미승인 리스트
		Long startRow = ((long)page -1 ) * 10 +1;
		Long endRow = startRow + limit -1;
		StartEndPageDTO spage = new StartEndPageDTO(startRow, endRow);
		String statement = namespace + ".list";
		return sqlSession.selectList(statement, spage);
		
	}
	
	public Integer listmanaCount() { //관리자 상점 등록 신청한 개수
		String statement = namespace + ".listmanaCount";
		return sqlSession.selectOne(statement);
	}

	public Integer listTrue(String shopNum) { // 상점 리스트에서 승인버튼을 클릭했을 때 
		System.out.println(shopNum);
		ShopDTO sdto = new ShopDTO();
		sdto.setShopNum(Integer.parseInt(shopNum));
		String statement = namespace + ".listTrue";
		return sqlSession.update(statement, sdto);
	}

	public Integer listFalse(String shopNum) {
		System.out.println(shopNum);
		ShopDTO sdto = new ShopDTO();
		sdto.setShopNum(Integer.parseInt(shopNum));
		String statement = namespace + ".listFalse";
		return sqlSession.delete(statement, sdto);
	}
	
	public ShopDTO FileDelete2(String shopNum) { // 리스트에서 미승인을 누를 시 업로드 된 파일이 삭제되기 위해서 (상세보기와 상점 등록 하기위해 num 찾기)
		ShopDTO sdto = new ShopDTO();
		sdto.setShopNum(Integer.parseInt(shopNum));
		String statement = namespace + ".FileDelete2";
		return sqlSession.selectOne(statement, sdto);
		
	}

}
