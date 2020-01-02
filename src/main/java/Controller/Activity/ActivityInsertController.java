package Controller.Activity;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Activity.ActivityInsertCommand1;
import Command.Activity.ActivityInsertCommand2;
import Service.Activity.ActivityInsert2ShowService;
import Service.Activity.ActivityInsertService;
import Service.Activity.ActivityInsertService2;


@Controller
public class ActivityInsertController {
	@Autowired
	private ActivityInsertService activityInsertService;
	@Autowired
	private ActivityInsertService2 activityInsertService2;
	@Autowired
	private ActivityInsert2ShowService activityInsert2ShowService;
	
	
//1차
	@RequestMapping("/ActivityInsert")
	public String ActivityForm(Model model, HttpSession session, HttpServletRequest request) {
			System.out.println("접근_Controller_ActivityInsert");
			System.out.println("접근");
			System.out.println("접근");
			System.out.println("접근");
			System.out.println("접근");
		model.addAttribute("activityCommand1",  new ActivityInsertCommand1());
	return "Activity/ActivityInsertForm1";
	}
		
	
	@RequestMapping("/ActivityInsertPro")
	public String ActivityInsertPro(ActivityInsertCommand1 activityCommand1, HttpServletRequest request, HttpSession session, Errors errors) {
			System.out.println(activityCommand1.getActivityName());
			System.out.println(activityCommand1.getActiStartDate());
			System.out.println(activityCommand1.getActiEndDate());
			System.out.println(activityCommand1.getRecruitPeople());
			System.out.println(activityCommand1.getActivityText());
			System.out.println(activityCommand1.getLimitAge());
			System.out.println(activityCommand1.getSortOfActivity());
			System.out.println(activityCommand1.getWhichProduct());
			System.out.println(activityCommand1.getActivityCity());
		activityInsertService.activityPro(activityCommand1, request, session, errors);
	return "redirect:/profile";
	}
	
	
	
	
	
	

//2차
	@RequestMapping("/ActivityInsert2")
	public String ActivityForm2(@RequestParam(value = "memNum") String memNum, Model model, HttpSession session) {
			System.out.println("접근");
			System.out.println("접근_2차폼_Controller");
			System.out.println("접근");
			System.out.println("접근");
			System.out.println("접근");
		activityInsert2ShowService.ShowInfo1to2(memNum, model, session);
		activityInsertService2.pr(memNum, model);
		model.addAttribute("activityCommand1", new ActivityInsertCommand1());
		
	return "Activity/ActivityInsertForm2";
	}
	
	@RequestMapping("/ActivityInsertPro2")
	public String ActivityInsertPro2(@RequestParam(value ="memNum") String memNum, ActivityInsertCommand2 activityCommand2, Model model, HttpSession session, Errors errors) {
			System.out.println("모집기간" + activityCommand2.getRecruitStartDate());
			System.out.println("모집기간" + activityCommand2.getRecruitEndDate());
			System.out.println("접근Controller_insert2");
			System.out.println("접근");
			System.out.println("접근");
			System.out.println("접근");
			System.out.println("접근");
			System.out.println("접근");
			System.out.println("접근");
		activityInsertService2.activityPro(memNum, activityCommand2, session, errors);
	return "redirect:/Activity2Success";
	}
	
	@RequestMapping("/Activity2Success")
	public String Activity1Success() {
		return "Activity/ActivitySuccessInsert";
	}
	
		
	
	
	
	
	
	
	
	
	
	@ModelAttribute("recruitPeople")
	protected List<Integer> referData2() throws Exception {
		List<Integer> recruitPeople = new ArrayList<Integer>();
		recruitPeople.add(1);
		recruitPeople.add(2);
		recruitPeople.add(3);
		recruitPeople.add(4);
		recruitPeople.add(5);
		recruitPeople.add(6);
		recruitPeople.add(7);
		recruitPeople.add(8);
		recruitPeople.add(9);
		recruitPeople.add(10);
		return recruitPeople;
	}
	
	
	@ModelAttribute("limitAge")
	protected List<String> referData3() throws Exception{
		List<String> limitAge = new ArrayList<String>();
		limitAge.add("14~16");
		limitAge.add("17~19");
		limitAge.add("20대");
		limitAge.add("30대");
		limitAge.add("40대");
		limitAge.add("50대");
		limitAge.add("제한 없음");
	return limitAge;
	}
	
	
	  @ModelAttribute("activityCity")
	   protected List<String> referData1() throws Exception {
	       List<String> activityCity = new ArrayList<String>();
	       activityCity.add("강원도");                        
	       activityCity.add("강릉");
	       activityCity.add("거제");
	       activityCity.add("경산");                        
	       activityCity.add("경주");
	       activityCity.add("계룡");
	       activityCity.add("고양");                        
	       activityCity.add("공주");
	       activityCity.add("과천");
	       activityCity.add("광명");                        
	       activityCity.add("광양");
	       activityCity.add("광주");
	       activityCity.add("광주광역시");                        
	       activityCity.add("구리");
	       activityCity.add("구미");
	       activityCity.add("군산");                        
	       activityCity.add("군포");
	       activityCity.add("김제");
	       activityCity.add("김천");                        
	       activityCity.add("김포");
	       activityCity.add("김해");
	       activityCity.add("나주");                        
	       activityCity.add("남양주");
	       activityCity.add("남원");
	       activityCity.add("논산");                        
	       activityCity.add("당진");
	       activityCity.add("대구광역시");
	       activityCity.add("대전광역시");                        
	       activityCity.add("동두천");
	       activityCity.add("동해");
	       activityCity.add("목포");                        
	       activityCity.add("문경");
	       activityCity.add("밀양");
	       activityCity.add("보령");                        
	       activityCity.add("부산광역시");
	       activityCity.add("부천");
	       activityCity.add("사천");                        
	       activityCity.add("삼척");
	       activityCity.add("상주");
	       activityCity.add("서귀포");                        
	       activityCity.add("서산");
	       activityCity.add("서울특별시");
	       activityCity.add("성남");                        
	       activityCity.add("세종특별자치시");
	       activityCity.add("속초");
	       activityCity.add("수원");                        
	       activityCity.add("순천");
	       activityCity.add("시흥");
	       activityCity.add("아산");                        
	       activityCity.add("안동");
	       activityCity.add("안산");
	       activityCity.add("안성");
	       activityCity.add("안양");                        
	       activityCity.add("양산");
	       activityCity.add("양주");
	       activityCity.add("여수");                        
	       activityCity.add("영주");
	       activityCity.add("영천");
	       activityCity.add("오산");                        
	       activityCity.add("용인");
	       activityCity.add("울산광역시");
	       activityCity.add("원주");
	       activityCity.add("의왕");                        
	       activityCity.add("의정부");
	       activityCity.add("이천");
	       activityCity.add("익산");                        
	       activityCity.add("인천광역시");
	       activityCity.add("전주시");
	       activityCity.add("정읍");                        
	       activityCity.add("제주도");
	       activityCity.add("제천");
	       activityCity.add("진주");
	       activityCity.add("창원");                        
	       activityCity.add("천안");
	       activityCity.add("청주");
	       activityCity.add("춘천");                        
	       activityCity.add("충주");
	       activityCity.add("태백");
	       activityCity.add("통영");                        
	       activityCity.add("파주");
	       activityCity.add("평택");
	       activityCity.add("포천");
	       activityCity.add("포항");                        
	       activityCity.add("하남");
	       activityCity.add("화성");

	       return activityCity;
	                   
	      
	   } 
	
	
}
