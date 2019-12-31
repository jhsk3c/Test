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
			acti.setMemNum(authInfo.getNum());	 // 세션 !
			
			acti.setActivityName(activityCommand1.getActivityName());
			acti.setRecruitPeople(Integer.parseInt(activityCommand1.getRecruitPeople()));
			acti.setActivityText(activityCommand1.getActivityText());
			acti.setLimitAge(activityCommand1.getLimitAge());
			acti.setSortOfActivity(activityCommand1.getSortOfActivity());
			acti.setActivityCity(activityCommand1.getActivityCity());
			acti.setWhichProduct(activityCommand1.getWhichProduct());		
			
			System.out.println(acti.getRecruitPeople());
			System.out.println(acti.getRecruitPeople());
			System.out.println(acti.getRecruitPeople());System.out.println(acti.getRecruitPeople());
			System.out.println(acti.getRecruitPeople());
		
	//TIMESTAMP
		SimpleDateFormat dt = new SimpleDateFormat("mm/dd/yy");
		Date date;
		try {
			date = dt.parse(activityCommand1.getActiStartDate());
			Timestamp actiStartDate = new Timestamp(date.getTime());
			acti.setActivityStartDate(actiStartDate);
			
			System.out.println(acti.getActivityStartDate());
			
			date = dt.parse(activityCommand1.getActiEndDate());
			Timestamp actiEndDate = new Timestamp(date.getTime());
			acti.setActivityEndDate(actiEndDate);
			
			System.out.println(acti.getActivityEndDate());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
			System.out.println(acti.getMemNum());
			System.out.println(acti.getSortOfActivity());
			System.out.println(acti.getWhichProduct());
			System.out.println(acti.getActivityCity());
			System.out.println(acti.getSortOfActivity());
			System.out.println(acti.getLimitAge());
			System.out.println(acti.getActivityText());
			System.out.println(acti.getActivityNum());
		
		String originalTotal = "";
		String storeTotal = "";
		
		for(MultipartFile mf : activityCommand1.getActiImage()) {
			original =  mf.getOriginalFilename();
			originalFileExtension = original.substring(original.lastIndexOf(".")); // 확장자 가져오기 
			store =  UUID.randomUUID().toString().replaceAll("-","") + originalFileExtension;
			
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
