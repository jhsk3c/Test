package Service.Participation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.ParticipationDTO;
import Repository.Particitpation.ParticipationRepository;

@Service
public class ParticipationListService {
	@Autowired
	ParticipationRepository participationRepository;

	public void list(String memId, Model model) {
		List<ParticipationDTO> dto = participationRepository.list(memId);
		model.addAttribute("participation", dto);
	}

}
