package Service.Main;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import Model.DTO.VspotDTO;
import Repository.Vspot.VspotRepository;

@Service
public class MainService {

	@Autowired
	private VspotRepository vspotRepository;
	
	@Transactional
	public String memLiset(Model model) {

		List<VspotDTO> list = vspotRepository.memList();
		Collections.shuffle(list);
		model.addAttribute("list", list);
		return "Main/mainView";
	}
	
}
