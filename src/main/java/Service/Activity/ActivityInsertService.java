package Service.Activity;

import java.io.File;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.web.multipart.MultipartFile;

import Command.Activity.ActivityInsertCommand1;
import DTO.Activity.ActivityDTO;
import Model.DTO.AuthInfo;
import Repository.Activity.ActivityRepository;

@Service
public class ActivityInsertService {
	
	
	@Autowired
	private ActivityRepository activityRepository;
	
	String original = null;
	String originalFileExtension = null;
	String store = null;
	
	
	public Integer activityPro(ActivityInsertCommand1 activityCommand1, HttpServletRequest request, HttpSession session, Errors errors) {
		ActivityDTO acti = new ActivityDTO();
		
		AuthInfo authInfo = (AuthInfo)session.getAttribute("authInfo");
		
		acti.setMemNum(authInfo.getNum());	 // 세션 받아온 거야
		
		
	//	SimpleDateFormat dt = new SimpleDateFormat("yyyyMMdd");
		//Date date;
		
		/*
		 * try { date = dt.parse(activityCommand1.getActiStartDate()); Timestamp
		 * actiDate1 = new Timestamp(date.getTime()); acti.setActiStartDate(actiDate1);
		 * 
		 * date = dt.parse(activityCommand1.getActiEndDate()); Timestamp actiDate2 = new
		 * Timestamp(date.getTime()); acti.setActiEndDate(actiDate2);
		 * 
		 * date = dt.parse(activityCommand1.getRecruitStartDate()); Timestamp actiDate3
		 * = new Timestamp(date.getTime()); acti.setRecruitStartDate(actiDate3);
		 * 
		 * date = dt.parse(activityCommand1.getRecruitEndDate()); Timestamp actiDate4 =
		 * new Timestamp(date.getTime()); acti.setRecruitEndDate(actiDate4); } catch
		 * (Exception e) { e.printStackTrace(); }
		 */
		
		acti.setActivityName(activityCommand1.getActivityName());
		acti.setRecruitPeople(Integer.parseInt(activityCommand1.getRecruitPeople()));
		acti.setActivityText(activityCommand1.getActivityText());
		acti.setLimitAge(activityCommand1.getLimitAge());
		
		System.out.println(authInfo.getNum());
		System.out.println(activityCommand1.getActivityName());
		System.out.println(activityCommand1.getRecruitPeople()); //가격

		System.out.println(activityCommand1.getLimitAge());
		System.out.println(activityCommand1.getActivityText());
		
		
		String originalTotal = "";
		String storeTotal = "";
		
		for(MultipartFile mf : activityCommand1.getActiImage()) {
			original =  mf.getOriginalFilename();
			originalFileExtension = original.substring(original.lastIndexOf(".")); // 확장자 가져오기 
			store =  UUID.randomUUID().toString().replaceAll("-","")
					+ originalFileExtension;
			
			originalTotal += original +"-";
			storeTotal += store +"-";
			
			String path = request.getServletContext().getRealPath("/");
			path += "WEB-INF/view/Activity/upload/";
			System.out.println();
			System.out.println(path);
			System.out.println();
			
			File file = new File(path + store);
			
			acti.setOriginalFilename(originalTotal);
			acti.setStoreFilename(storeTotal);
			
			System.out.println(originalTotal);
			System.out.println(storeTotal);
			try {
				mf.transferTo(file);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		Integer result = activityRepository.activituInsert1(acti);
	
		return result;
	}
		
	
	
}
