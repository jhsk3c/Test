package Service.Activity;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;

import Command.Activity.ActivityInsertCommand2;
import DTO.Activity.ActivityDTO;
import Repository.Activity.ActivityRepository;

@Service
public class ActivityInsertService2 {
	@Autowired
	private ActivityRepository activityRepository;
	
	public Integer activityPro(String memNum, ActivityInsertCommand2 activityCommand2, HttpSession session, Errors errors) {
			System.out.println("접근_service_actiInsert2");
			System.out.println("접근_service_actiInsert2");
			System.out.println("접근_service_actiInsert2");
		ActivityDTO acti = new ActivityDTO();
			acti.setMemNum(memNum);		
			acti.setActivityCost(Integer.parseInt(activityCommand2.getActivityCost()));
			acti.setActivityProduct(activityCommand2.getActivityProduct());
		SimpleDateFormat dt = new SimpleDateFormat("mm/dd/yy");
		Date date;
			try {
				date = dt.parse(activityCommand2.getRecruitStartDate());
				Timestamp recruitStartDate = new Timestamp(date.getTime());
				acti.setRecruitStartDate(recruitStartDate);
					System.out.println(acti.getRecruitStartDate());
					
				date = dt.parse(activityCommand2.getRecruitEndDate());
				Timestamp recruitEndDate = new Timestamp(date.getTime());
				acti.setRecruitEndDate(recruitEndDate);
					System.out.println(acti.getRecruitEndDate());
					
			} catch (Exception e) {	e.printStackTrace();}
			System.out.println("멤넘~");
			System.out.println(acti.getMemNum());
			System.out.println(acti.getMemNum());
			System.out.println(acti.getMemNum());
			System.out.println("가격 " + acti.getActivityCost());
			System.out.println("사용물품 " + acti.getActivityProduct());
			System.out.println("모집기간 " + acti.getRecruitStartDate());
			System.out.println("모집기간 " + acti.getRecruitEndDate());
		Integer result = activityRepository.activityInsert2(acti);
		return result;
	}
	
	
	
	
	
	
	
	public ActivityDTO pr(String memNum, Model model) {
		System.out.println(memNum);
		System.out.println(memNum);
		System.out.println("접근 insert2_Service");
		System.out.println("접근");
		System.out.println("접근");
		System.out.println("접근");
		System.out.println("접근");
		System.out.println("접근");
		System.out.println("접근");
		ActivityDTO list = activityRepository.prpr(memNum);
		
		model.addAttribute("list", list);
	return list;
	}
	
	
	
	
	
	
	
}
