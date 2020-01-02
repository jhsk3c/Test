package Repository.Aduit;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.AduitDTO;
import Model.DTO.MemberDTO;
import Model.DTO.ParticipationDTO;

@Repository
public class AduitRepository {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "Repository.Aduit.AduitMapper";

	public String findContestNum(String pNum) { // 평가를 받는 회원이 참가한 공모전의 contestNum을 찾기
		String statement = namespace + ".findContestNum";
		String contestNum = sqlSession.selectOne(statement, pNum);
//		System.out.println("찾아온 contestNum ::: " + contestNum);
		return contestNum;
	}

	public Integer aduitInsert(AduitDTO dto) { // 평가항목 insert
		String statement = namespace + ".insertAduit";
		return sqlSession.insert(statement, dto);
	}

	public String findMemEmail(MemberDTO member) { // 합격한 회원의 email을 찾아서 상품화 여부 묻기
//		System.out.println("findMemEmail : " + member.getMemId());
		String statement = namespace + ".selectMemEmail";
		MemberDTO mem = sqlSession.selectOne(statement, member);
		String userEmail = mem.getMemEmail();
//		System.out.println("findMemEmail " + userEmail);
		return userEmail;
	}

}
