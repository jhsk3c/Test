package Service.Main;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import DTO.Activity.ActivityDTO;
import Model.DTO.VspotDTO;
import Repository.Activity.ActivityRepository;
import Repository.Vspot.VspotRepository;

@Service
public class MainService {

	@Autowired
	private VspotRepository vspotRepository;
	@Autowired
	private ActivityRepository activityRepository;
	
	
	
	
	@Transactional
	public String memLiset(Model model) {

		List<VspotDTO> list = vspotRepository.memList();
		Collections.shuffle(list);
		model.addAttribute("list", list);
		
		ActivityDTO acti = new ActivityDTO();
		List<ActivityDTO> list2 = activityRepository.actiList(acti);
		Collections.shuffle(list2);
		model.addAttribute("list2", list2);
		return "Main/mainView";
	}
	
}
