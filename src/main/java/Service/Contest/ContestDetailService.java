package Service.Contest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.ContestDTO;
import Repository.Contest.ContestRepository;

@Service
public class ContestDetailService {
	@Autowired
	ContestRepository contestRepository;
	
	public void contestDetail(String contestNum, Model model) {
		ContestDTO contest = new ContestDTO();
		contest.setContestNum(contestNum);
		 contest = contestRepository.detail(contest);
//		 System.out.println("cccccccccccccccccccccccccc1 :: "+contest.getContestName());
		model.addAttribute("contest", contest);
	}
}
