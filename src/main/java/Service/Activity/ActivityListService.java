package Service.Activity;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Repository.Activity.ActivityRepository;

@Service
public class ActivityListService {
	
	@Autowired
	private ActivityRepository activityRepository;
	
	public String actiList(Model model, HttpServletRequest request) {
		activityRepository.activityList();
		
		return "Activity/ActivityList";
	}
	
}
