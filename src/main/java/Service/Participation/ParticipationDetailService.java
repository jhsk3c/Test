package Service.Participation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.ParticipationDTO;
import Repository.Particitpation.ParticipationRepository;
import oracle.net.aso.d;

@Service
public class ParticipationDetailService {
	@Autowired
	ParticipationRepository participationRepository;

	public void detail(String memId, String pNum, Model model) {
		ParticipationDTO dto = new ParticipationDTO();
		dto.setParticipationNum(Integer.parseInt(pNum));
		dto.setMemId(memId);
		dto = participationRepository.participationDetail(dto);
		model.addAttribute("participation", dto);
	}

}
