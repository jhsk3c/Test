package Repository.Admin;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DTO.Activity.ActivityDTO;
import DTO.Activity.ActivityProductDTO;
import DTO.Activity.ActivityStoreDTO;
import Model.DTO.ComMemberDTO;
import Model.DTO.MemberDTO;
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

	
	
	
	
	
	
	//활동이야 활동 
	public List<ActivityDTO> ActivityListADMIN(int page, int limit) {		
		Long startRow = ((long)page -1 ) * 10 +1;
		Long endRow = startRow + limit -1;
		StartEndPageDTO spage = new StartEndPageDTO(startRow, endRow);  //페이지
		String statement = namespace + ".activityListADMIN";
		return sqlSession.selectList(statement,spage);		
	}

	public Integer ActivityCount() { //회원이 휴양지 등록 신청한 개수
		String statement = namespace + ".ActivityCount";
		return sqlSession.selectOne(statement);
	}
	
	
	
	
	
	
	
	public Integer activityTrue(String activityNum) {	//활동 승인
		System.out.println(activityNum);
		ActivityDTO actiDTO = new ActivityDTO();
		actiDTO.setActivityNum(activityNum);
		String statement = namespace + ".activityTrue";
		return sqlSession.update(statement, actiDTO);
	}

	public Integer activityFalse(String activityNum) {	//활동 미승인
		System.out.println(activityNum);
		ActivityDTO actiDTO = new ActivityDTO();
		actiDTO.setActivityNum(activityNum);
		String statement = namespace + ".activityFalse";
		return sqlSession.delete(statement, actiDTO);
	}
	
	public ActivityDTO actFileDelete(String activityNum) { // 리스트에서 미승인을 누를 시 업로드 된 파일이 삭제되기 위해서 
		System.out.println(activityNum);
		ActivityDTO actiDTO = new ActivityDTO();
		actiDTO.setActivityNum(activityNum);
		String statement = namespace + ".actFileDelete";
		return sqlSession.selectOne(statement, actiDTO);
		
	}

	
	public Integer activityStoreInsert(ActivityStoreDTO actiStoreDTO) {		//활동 상점 등록
		String statement = namespace + ".activityStoreInsert";
		return sqlSession.insert(statement, actiStoreDTO);
	}
	
	
	public List<ActivityStoreDTO> storeList(int page, int limit) {								//상점 목록
		Long startRow = ((long)page -1 ) * 10 +1;
		Long endRow = startRow + limit -1;
		StartEndPageDTO spage = new StartEndPageDTO(startRow, endRow);  //페이지
		String statement = namespace + ".activityStoreList";
		return sqlSession.selectList(statement, spage);
	}

	public Integer ActivityListCount() { 										// 상점 수
		String statement = namespace + ".ActiStoreCount";
		return sqlSession.selectOne(statement);
	}
	
	public ActivityStoreDTO prpr(String storeNum) {		//stNum값 찾는 것 >> 물품 등록에 필요
		System.out.println(storeNum);
		ActivityStoreDTO actiDTO = new ActivityStoreDTO();
		actiDTO.setStoreNum(storeNum);
		String statement = namespace + ".prpr";
		return sqlSession.selectOne(statement, actiDTO);
	}
	
	public Integer productInsert(ActivityProductDTO actiProductDTO) {		//활동 물품 등록
		String statement = namespace + ".activityProductInsert";
		System.out.println((actiProductDTO.getStoreNum()));
		System.out.println(actiProductDTO.getProductPrice());
		System.out.println(actiProductDTO.getProductOption());
		System.out.println(actiProductDTO.getProductName());
		System.out.println(actiProductDTO.getProductPrice());
		System.out.println(actiProductDTO.getStoreFilename());
		System.out.println(actiProductDTO.getOriginalFilename());
		
		return sqlSession.insert(statement, actiProductDTO);
	}

	public ActivityStoreDTO StoreDetail(ActivityStoreDTO storeDTO) {
		String statement = namespace + ".storeDetail";
	return sqlSession.selectOne(statement, storeDTO);
	}

	public List<ActivityProductDTO> ProductListInStoreDetail(ActivityProductDTO productDTO) {
		String statement = namespace + ".productInStoreDetail";
		return sqlSession.selectList(statement, productDTO);
	}






	
	
	

}