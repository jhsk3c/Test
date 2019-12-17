package Repository.Particitpation;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.ParticipationDTO;

@Repository
public class ParticipationRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "Repository.Particitpation.ParticitpationMapper";

	public Integer writeInsert(ParticipationDTO dto) {
		String statement = namespace + ".insertParticitpation";
		return sqlSession.insert(statement, dto);
	}

}
