package Service.Activity;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.Activity.ActivityStoreCommand;
import DTO.Activity.ActivityStoreDTO;
import Repository.Activity.StoreRepository;


@Service
public class ActivityStoreSearchService {
	@Autowired
	private StoreRepository storeRepository;

	
	
	public String storeSearch(ActivityStoreCommand activityStoreCommand, Model model, HttpServletRequest request) {
		ActivityStoreDTO storeDTO = new ActivityStoreDTO();
			storeDTO.setStoreLoc1(activityStoreCommand.getStoreLoc1());
			
				System.out.println(activityStoreCommand.getStoreLoc1());
			
			List<ActivityStoreDTO> list2 = storeRepository.searchCity(storeDTO);
			
			model.addAttribute("search", list2);
			
	return "Activity/MemberActivityStoreSearch";
	}
	
	
	
	
}
