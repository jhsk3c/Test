package Service.Contest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.ContestDTO;
import Repository.Contest.ContestRepository;

@Service
public class ContestListService {
	@Autowired
	ContestRepository contestRepository;

	public void contestList(Model model) {
		List<ContestDTO> list = contestRepository.contestList();
		for(ContestDTO str : list) {
			System.out.println("리스트" + str);
		}
		model.addAttribute("contest", list);
	}

}
