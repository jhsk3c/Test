package Service.Activity;


import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import DTO.Activity.ActivityDTO;
import Repository.Activity.ActivityRepository;

@Service
public class ActivityInsert2ShowService {

	@Autowired
	private ActivityRepository activityRepository;

	public ActivityDTO ShowInfo1to2(String memNum, Model model, HttpSession session) {
			
			System.out.println("접근_service_showInfo1_TO_2");
			System.out.println("접근");
			System.out.println("접근");
			System.out.println("접근");
			System.out.println("접근");
		
		ActivityDTO actiDTO = new ActivityDTO();
			actiDTO.setMemNum(memNum);
			
			System.out.println("맴넘값_service : " + actiDTO.getMemNum());
			
		ActivityDTO list = activityRepository.show1to2(actiDTO);
		
		
	//타임스템프를 string으로 형식 재구성 후 저장
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		String activityStartDate = sdf.format(new Date(list.getActivityStartDate().getTime()));
				System.out.println("활동시작일 스트링 형");
				System.out.println("활동시작일 String형 : " + activityStartDate);
			
				System.out.println("접근_Service_ShowInfo1to2_끝나요");
				System.out.println("접근_끝");
				System.out.println("접근_끝");
				System.out.println("접근_끝");
		
		model.addAttribute("list", list);
		model.addAttribute("actiStartDate", activityStartDate);
	return list;
	}
	
	
	
	
	
}
