package Service.Activity;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import DTO.Activity.ActivityDTO;
import Repository.Activity.ActivityRepository;


@Service
public class ActivityDetailService {

	@Autowired       
	private ActivityRepository activityRepository;
	
	public ActivityDTO activityDetail(Model model, String acticityNum, HttpSession session) {
		ActivityDTO actiDTO =  new ActivityDTO();
		actiDTO.setActivityNum(acticityNum);
		
		System.out.println("활동 넘 : " + actiDTO.getActivityNum());
		System.out.println("활동 넘 : " + actiDTO.getActivityNum());
		System.out.println("접근");
		System.out.println("접근_Service_ActivityDetail");
		System.out.println("접근");
		System.out.println("접근");
		System.out.println("접근");
		System.out.println("접근");
//사진뽑아요~
		ActivityDTO result = activityRepository.activityDetail(actiDTO);
		if(result.getOriginalFilename() != null) {
			String[] original = result.getOriginalFilename().split("-");
			String[] store = result.getStoreFilename().split("-");
			model.addAttribute("original", original);
			model.addAttribute("store", store);
		}
		model.addAttribute("result", result );
	return result;
	}

	
	
}
