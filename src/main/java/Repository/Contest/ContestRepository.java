package Repository.Contest;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.ContestDTO;
import Model.DTO.ParticipationDTO;

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


	public ContestDTO detail(ContestDTO contest) {
		String statement = namespace + ".detailContest";
		return sqlSession.selectOne(statement, contest);
	}

	public Integer contestModify(ContestDTO contest) {
		String statement = namespace + ".modifyContest";
		return sqlSession.update(statement, contest);
	}

	public Integer delete(String contestNum) {
		String statement = namespace + ".deleteContest";
		return sqlSession.delete(statement, contestNum);
	}

	public Integer countPeople(ParticipationDTO dto) {
		String statement = namespace + ".countPeople";
		return sqlSession.selectOne(statement, dto);
	}

}
