package Service.Contest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.Contest.ContestCommand;
import Model.DTO.ContestDTO;
import Model.DTO.ParticipationDTO;
import Repository.Contest.ContestRepository;

@Service
public class ContestDetailService {
	@Autowired
	ContestRepository contestRepository;

	public ContestDTO contestDetail(String contestNum, Model model) {
		ContestDTO contest = new ContestDTO();
		contest.setContestNum(contestNum);
		contest = contestRepository.detail(contest);
		
		
		ParticipationDTO dto = new ParticipationDTO();
		dto.setContestNum(Integer.parseInt(contestNum));
		Integer count = contestRepository.countPeople(dto); // 참가자수 조회
		model.addAttribute("count",count);
		model.addAttribute("contest", contest);
		return contest;
	}

}
