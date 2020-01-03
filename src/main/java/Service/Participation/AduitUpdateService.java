package Service.Participation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Model.DTO.ParticipationDTO;
import Repository.Particitpation.ParticipationRepository;

@Service
public class AduitUpdateService {
	@Autowired
	ParticipationRepository participationRepository;

	@Transactional
	public void auditUpdate(String pNum, String memId) {
		String aduitStatus = "평가완료";
//		System.out.println("피넘피넘" + pNum);
//		System.out.println("유저아이디" + memId);
		ParticipationDTO dto = new ParticipationDTO();
		dto.setParticipationNum(Integer.parseInt(pNum));
		dto.setAduitStatus(aduitStatus);
		participationRepository.updateAduitStatus(dto);
	}

}
