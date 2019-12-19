package Service.Participation;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.DTO.AuthInfo;
import Model.DTO.ParticipationDTO;
import Repository.Particitpation.ParticipationRepository;

@Service
public class MemNumCheckService {
	@Autowired
	ParticipationRepository repository;
	public Integer memNumCheck(HttpSession session, String contestNum) {
		ParticipationDTO dto = new ParticipationDTO();
		String sessionMemNum = ((AuthInfo)session.getAttribute("authInfo")).getNum();
		dto.setMemNum(sessionMemNum);
		dto.setContestNum(Integer.parseInt(contestNum));
		Integer result = repository.memNumCheck(dto);
		
//		System.out.println("결과값2" + result);
		return result;
	}

}
