package Controller.Spot;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.Spot.SpotCommand;
import Service.Vspot.MemVspotListServiceList;
import Service.Vspot.VspotService;

@Controller
public class SpotController {
	
	@Autowired
	private VspotService vspotService;
	
	@Autowired
	private MemVspotListServiceList memVspotListServiceList;
	
	@RequestMapping("/spot")
	public String gorm(SpotCommand spotCommand) {
		
		return "Spot/Vspot";
	}
	 

	@RequestMapping("/vspotPro") 
	public String vspot(SpotCommand spotCommand, HttpServletRequest request, HttpSession session ) {
		
		vspotService.vspotWrite(spotCommand, request, session);
		return "redirect:/main";
		
	}
	
	//리스트를 뽑아야지요
	@RequestMapping("/memvspotList")
	public String memvspotList(Model model) {
		return memVspotListServiceList.memLiset(model);
	}
	
	
	
	
	
	
	
	
	
	@ModelAttribute("vspotLoc")
	protected List<String> referData1() throws Exception {
	    List<String> vspotLoc = new ArrayList<String>();
	    
	    vspotLoc.add("강원도");                        
	    vspotLoc.add("강릉");
	    vspotLoc.add("거제");
	    vspotLoc.add("경산");                        
	    vspotLoc.add("경주");
	    vspotLoc.add("계룡");
	    vspotLoc.add("고양");                        
	    vspotLoc.add("공주");
	    vspotLoc.add("과천");
	    vspotLoc.add("광명");                        
	    vspotLoc.add("광양");
	    vspotLoc.add("광주");
	    vspotLoc.add("광주광역시");                        
	    vspotLoc.add("구리");
	    vspotLoc.add("구미");
	    vspotLoc.add("군산");                        
	    vspotLoc.add("군포");
	    vspotLoc.add("김제");
	    vspotLoc.add("김천");                        
	    vspotLoc.add("김포");
	    vspotLoc.add("김해");
	    vspotLoc.add("나주");                        
	    vspotLoc.add("남양주");
	    vspotLoc.add("남원");
	    vspotLoc.add("논산");                        
	    vspotLoc.add("당진");
	    vspotLoc.add("대구광역시");
	    vspotLoc.add("대전광역시");                        
	    vspotLoc.add("동두천");
	    vspotLoc.add("동해");
	    vspotLoc.add("목포");                        
	    vspotLoc.add("문경");
	    vspotLoc.add("밀양");
	    vspotLoc.add("보령");                        
	    vspotLoc.add("부산광역시");
	    vspotLoc.add("부천");
	    vspotLoc.add("사천");                        
	    vspotLoc.add("삼척");
	    vspotLoc.add("상주");
	    vspotLoc.add("서귀포");                        
	    vspotLoc.add("서산");
	    vspotLoc.add("서울특별시");
	    vspotLoc.add("성남");                        
	    vspotLoc.add("세종특별자치시");
	    vspotLoc.add("속초");
	    vspotLoc.add("수원");                        
	    vspotLoc.add("순천");
	    vspotLoc.add("시흥");
	    vspotLoc.add("아산");                        
	    vspotLoc.add("안동");
	    vspotLoc.add("안산");
	    vspotLoc.add("안성");
	    vspotLoc.add("안양");                        
	    vspotLoc.add("양산");
	    vspotLoc.add("양주");
	    vspotLoc.add("여수");                        
	    vspotLoc.add("영주");
	    vspotLoc.add("영천");
	    vspotLoc.add("오산");                        
	    vspotLoc.add("용인");
	    vspotLoc.add("울산광역시");
	    vspotLoc.add("원주");
	    vspotLoc.add("의왕");                        
	    vspotLoc.add("의정부");
	    vspotLoc.add("이천");
	    vspotLoc.add("익산");                        
	    vspotLoc.add("인천광역시");
	    vspotLoc.add("전주시");
	    vspotLoc.add("정읍");                        
	    vspotLoc.add("제주도");
	    vspotLoc.add("제천");
	    vspotLoc.add("진주");
	    vspotLoc.add("창원");                        
	    vspotLoc.add("천안");
	    vspotLoc.add("청주");
	    vspotLoc.add("춘천");                        
	    vspotLoc.add("충주");
	    vspotLoc.add("태백");
	    vspotLoc.add("통영");                        
	    vspotLoc.add("파주");
	    vspotLoc.add("평택");
	    vspotLoc.add("포천");
	    vspotLoc.add("포항");                        
	    vspotLoc.add("하남");
	    vspotLoc.add("화성");

	            
	    return vspotLoc;
	    
	   		
		
	} 
}
