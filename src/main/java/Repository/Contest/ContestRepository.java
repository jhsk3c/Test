package Repository.Contest;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.ContestDTO;

@Repository
public class ContestRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "Repository.Contest.ContestMapper";
	
	public Integer contestInsert(ContestDTO dto) { // 공모전등록
		Integer reslut = null;
		String statement = namespace + ".insertContest";
		reslut = sqlSession.insert(statement, dto);
		return reslut;
	}

	public List<ContestDTO> contestList() { // 공모전 리스트
		String statement = namespace + ".listContest";
		List<ContestDTO> list = sqlSession.selectList(statement);
		return list;
	}

}
