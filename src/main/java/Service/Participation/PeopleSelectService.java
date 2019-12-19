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
		System.out.println("dto안에 넘버 ::: " + dto.getParticipationNum());
		List<ParticipationDTO> list = participationRepository.peopleList(dto);

//		참가등록한 회원의 아이디를 찾아봅시다
//		List<ParticipationDTO> memIdList = participationRepository.memIdList(contestNum);
//		String contestNameList = participationRepository.contestNameList(contestNum);

		model.addAttribute("participation", list);
		
	}

}
