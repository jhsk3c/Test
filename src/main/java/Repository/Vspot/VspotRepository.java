package Repository.Vspot;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.SpotReviewDTO;
import Model.DTO.StartEndPageDTO;
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


	public VspotDTO listDetail(VspotDTO vspot) { //휴양지 디테일(리스트에서 누르면)
		String statement = namespace + ".listDetail";
		return sqlSession.selectOne(statement, vspot);
		
	}


	public VspotDTO insertList(VspotDTO vdto) { //후기 작성을 위한 num값 찾기.
		String statement = namespace + ".insertList";
		return sqlSession.selectOne(statement, vdto);
		
	}


	public Integer insert(SpotReviewDTO srdto) { //후기 등록.
		String statement = namespace + ".insert";
		return sqlSession.insert(statement, srdto);
		
	}


	public List<SpotReviewDTO> listReview(String vspotNum, int page, int limit) { // 후기 내용을 디테일에 출력하기 (페이징은 일단 뽑고 => 그다음 페이징 => 그다음 평점 )
		Long startRow = ((long)page -1 ) * 10 +1;
		Long endRow = startRow + limit -1;
		Integer su1 = Integer.parseInt(vspotNum);
		StartEndPageDTO spage = new StartEndPageDTO(startRow, endRow, su1);
		String statement = namespace + ".listReview";
		return sqlSession.selectList(statement, spage);
	}


	public Integer listReviewCount(SpotReviewDTO srto) {
		String statement = namespace + ".listReviewCount";
		return sqlSession.selectOne(statement, srto);
	}


	public VspotDTO jointest(VspotDTO vdto) {
		String statement = namespace + ".jointest";
		return sqlSession.selectOne(statement, vdto);
		
	}
	
}
