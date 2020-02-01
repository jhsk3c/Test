package Controller.Activity;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.org.apache.bcel.internal.generic.NEW;

import Command.Activity.ActivityStoreCommand;
import Service.Activity.ActivityStoreListForMemberService;
import Service.Activity.ActivityStoreSearchService;



@Controller
public class AcitivtyStoreListForMemberController {
	@Autowired
	private ActivityStoreListForMemberService activityStoreListForMemberService;
	@Autowired
	private ActivityStoreSearchService activityStoreSearchService;
	
	
	
	@RequestMapping("/activityStoreList")
	public String activityStoreList(Model model, HttpServletRequest request) {
			System.out.println("접근");
			System.out.println("접근_Controller_StoreList");
			System.out.println("접근");
			System.out.println("접근");
			System.out.println("접근");
			System.out.println("접근");
		
		model.addAttribute("activityStoreCommand", new ActivityStoreCommand());
	return activityStoreListForMemberService.storeList(model, request);
	}
	
//상점지역 검색
	@RequestMapping("/searchCity")
	public String searchCity(ActivityStoreCommand activityStoreCommand, Model model, HttpServletRequest request) {
	return activityStoreSearchService.searchCity(activityStoreCommand, model, request);
	}
	
	
	
	
	
	
	
	
	
	@ModelAttribute("storeLoc1")
	   protected List<String> referData1() throws Exception {
	       List<String> storeLoc1 = new ArrayList<String>();
	       storeLoc1.add("강원도");                        
	       storeLoc1.add("강릉");
	       storeLoc1.add("거제");
	       storeLoc1.add("경산");                        
	       storeLoc1.add("경주");
	       storeLoc1.add("계룡");
	       storeLoc1.add("고양");                        
	       storeLoc1.add("공주");
	       storeLoc1.add("과천");
	       storeLoc1.add("광명");                        
	       storeLoc1.add("광양");
	       storeLoc1.add("광주");
	       storeLoc1.add("광주광역시");                        
	       storeLoc1.add("구리");
	       storeLoc1.add("구미");
	       storeLoc1.add("군산");                        
	       storeLoc1.add("군포");
	       storeLoc1.add("김제");
	       storeLoc1.add("김천");                        
	       storeLoc1.add("김포");
	       storeLoc1.add("김해");
	       storeLoc1.add("나주");                        
	       storeLoc1.add("남양주");
	       storeLoc1.add("남원");
	       storeLoc1.add("논산");                        
	       storeLoc1.add("당진");
	       storeLoc1.add("대구광역시");
	       storeLoc1.add("대전광역시");                        
	       storeLoc1.add("동두천");
	       storeLoc1.add("동해");
	       storeLoc1.add("목포");                        
	       storeLoc1.add("문경");
	       storeLoc1.add("밀양");
	       storeLoc1.add("보령");                        
	       storeLoc1.add("부산광역시");
	       storeLoc1.add("부천");
	       storeLoc1.add("사천");                        
	       storeLoc1.add("삼척");
	       storeLoc1.add("상주");
	       storeLoc1.add("서귀포");                        
	       storeLoc1.add("서산");
	       storeLoc1.add("서울특별시");
	       storeLoc1.add("성남");                        
	       storeLoc1.add("세종특별자치시");
	       storeLoc1.add("속초");
	       storeLoc1.add("수원");                        
	       storeLoc1.add("순천");
	       storeLoc1.add("시흥");
	       storeLoc1.add("아산");                        
	       storeLoc1.add("안동");
	       storeLoc1.add("안산");
	       storeLoc1.add("안성");
	       storeLoc1.add("안양");                        
	       storeLoc1.add("양산");
	       storeLoc1.add("양주");
	       storeLoc1.add("여수");                        
	       storeLoc1.add("영주");
	       storeLoc1.add("영천");
	       storeLoc1.add("오산");                        
	       storeLoc1.add("용인");
	       storeLoc1.add("울산광역시");
	       storeLoc1.add("원주");
	       storeLoc1.add("의왕");                        
	       storeLoc1.add("의정부");
	       storeLoc1.add("이천");
	       storeLoc1.add("익산");                        
	       storeLoc1.add("인천광역시");
	       storeLoc1.add("전주시");
	       storeLoc1.add("정읍");                        
	       storeLoc1.add("제주도");
	       storeLoc1.add("제천");
	       storeLoc1.add("진주");
	       storeLoc1.add("창원");                        
	       storeLoc1.add("천안");
	       storeLoc1.add("청주");
	       storeLoc1.add("춘천");                        
	       storeLoc1.add("충주");
	       storeLoc1.add("태백");
	       storeLoc1.add("통영");                        
	       storeLoc1.add("파주");
	       storeLoc1.add("평택");
	       storeLoc1.add("포천");
	       storeLoc1.add("포항");                        
	       storeLoc1.add("하남");
	       storeLoc1.add("화성");

	       return storeLoc1;
	                   
	      
	   } 
	
	
	
	
	
	
	
	
}
