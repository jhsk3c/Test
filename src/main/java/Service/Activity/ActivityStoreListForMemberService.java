package Service.Activity;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import DTO.Activity.ActivityStoreDTO;
import Repository.Activity.StoreRepository;

@Service
public class ActivityStoreListForMemberService {
	@Autowired
	private StoreRepository storeRepository;
	
	
	public String storeList(Model model, HttpServletRequest request) {
		ActivityStoreDTO storeDTO = new ActivityStoreDTO();
		
		List<ActivityStoreDTO> list = storeRepository.storeList(storeDTO);
		
		model.addAttribute("list", list);
		
		return "Activity/MemberActivityStoreList";
	}

	


}
