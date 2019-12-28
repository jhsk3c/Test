package Service.Participation;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.AuthInfo;
import Model.DTO.ParticipationDTO;
import Repository.Particitpation.ParticipationRepository;

@Service
public class PeopleSelectService {
	@Autowired
	ParticipationRepository participationRepository;

	public void selectPeople(String contestNum, Model model,HttpSession session) {
		ParticipationDTO dto = new ParticipationDTO();
		dto.setContestNum(Integer.parseInt(contestNum));
		String memId = ((AuthInfo)session.getAttribute("authInfo")).getId();
		dto.setMemId(memId);
		List<ParticipationDTO> list = participationRepository.peopleList(dto);

		model.addAttribute("participation", list);
		
	}

}
