package Repository.Particitpation;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.ParticipationDTO;

@Repository
public class ParticipationRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "Repository.Particitpation.ParticitpationMapper";

	public Integer memNumCheck(ParticipationDTO dto) { // 참가시 중복검사
		String statement = namespace + ".memNumCheck";
		return sqlSession.selectOne(statement, dto);
	}

	public Integer writeInsert(ParticipationDTO dto) { // 참가등록
		String statement = namespace + ".insertParticitpation";
		return sqlSession.insert(statement, dto);
	}

	public List<ParticipationDTO> peopleList(ParticipationDTO dto) {
		String statement = namespace + ".selectPeople";
		System.out.println("dto안에 넘버 ::: " + dto.getParticipationNum());
		return sqlSession.selectList(statement, dto);
	}

	public ParticipationDTO participationDetail(ParticipationDTO dto) {
		String statement = namespace + ".detailParticipation";
		return sqlSession.selectOne(statement, dto);
	}

	public List<ParticipationDTO> list(String memId) { // 회원 자신의 참가내역 리스트
		ParticipationDTO dto = new ParticipationDTO();
		dto.setMemId(memId);
		String statement = namespace + ".selectList";
		return sqlSession.selectList(statement, dto);
	}

//	public List<ParticipationDTO> memIdList(String contestNum) { // memId 리스트로 받아오기
//		String statement = namespace + ".selectUserId";
//		return sqlSession.selectList(statement, contestNum);
//	}
//
//	public String contestNameList(String contestNum) { // contestName 리스트로 받아오기
//		String statement = namespace + ".selectContestName";
//		ParticipationDTO dto = new ParticipationDTO();
//		dto.setContestNum(Integer.parseInt(contestNum));
//		return sqlSession.selectOne(statement, dto);
//	}

}
