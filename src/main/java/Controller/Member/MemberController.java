package Controller.Member;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import CommandMember.MemberCommand;
import Model.DTO.MemberDTO;
import Service.Member.MemberJoinService;
import Service.Member.MemberJoinUserCheckService;
import Validator.MemberCommandValidator;

@Controller
public class MemberController {
	
	@Autowired
	private MemberJoinService memberJoinService;
	
	@Autowired
	private MemberJoinUserCheckService memberJoinUserCheckService;
	
	
	@RequestMapping("member/memberInfo")
	public String Info(Model model, MemberCommand memberCommand) {
		return "Member/memberInfo";
	}
	
	@RequestMapping("member/memberInfoPro")
	public String InfoPro(MemberCommand memberCommand, Errors errors) {
		
		new MemberCommandValidator().validate(memberCommand, errors);
		if(errors.hasErrors()) {
			return "Member/memberInfo";
		}
		Integer result = memberJoinService.JoinInsert(memberCommand);
		
		if(result != 0) {
			return "Main/mainView";
		}
		else {
			return "Member/memberInfo";
		}
		
	}
	
	@RequestMapping("member/userCheck")
	public String userCheck(MemberCommand memberCommand) {
		
		Integer result = memberJoinUserCheckService.getUserCheck(memberCommand);
		
		
		return "Member/memberInfo";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//회원가입 국가에 대한 SELECT 만들기..
	@ModelAttribute("memNationality")
	protected List<String> referData() throws Exception {
	    List<String> memNationality = new ArrayList<String>();
	    
	    memNationality.add("대한민국");                        
	    memNationality.add("가나");
	    memNationality.add("그리스");
	    memNationality.add("남아프리카공화국");
	    memNationality.add("노르웨이");                        
	    memNationality.add("독일");
	    memNationality.add("대만");
	    memNationality.add("덴마크");
	    memNationality.add("모로코");                        
	    memNationality.add("몽골");
	    memNationality.add("미국");
	    memNationality.add("멕시코");
	    memNationality.add("베트남");                        
	    memNationality.add("벨기에");
	    memNationality.add("스페인");
	    memNationality.add("영국");
	    memNationality.add("오스트리아");                        
	    memNationality.add("우즈베키스탄");
	    memNationality.add("이탈리아");
	    memNationality.add("일본");
	    memNationality.add("중국");                        
	    memNationality.add("칠레");
	    memNationality.add("체코");
	    memNationality.add("카자흐스탄");
	    memNationality.add("캐나다");                        
	    memNationality.add("케냐");
	    memNationality.add("태국");
	    memNationality.add("포르투갈");
	    memNationality.add("폴란드");                        
	    memNationality.add("프랑스");
	    memNationality.add("핀란드");
	    memNationality.add("필리핀");
	    memNationality.add("페루");                        
	    memNationality.add("헝가리");
	    memNationality.add("홍콩");
	   
	    
	            
	    return memNationality;
	    
	   		
		
	} 
	
	//회원가입 지역에 대한 SELECT 만들기..
	@ModelAttribute("memLoc")
	protected List<String> referData1() throws Exception {
		List<String> memLoc = new ArrayList<String>();
		    
		memLoc.add("강릉");                        
		memLoc.add("거제");
		memLoc.add("경산");
		memLoc.add("경주");
		memLoc.add("계룡");                        
		memLoc.add("고양");
		memLoc.add("공주");
		memLoc.add("과천");
		memLoc.add("광명");                        
		memLoc.add("광양");
		memLoc.add("광주");
		memLoc.add("광주광역시");
		memLoc.add("구리");                        
		memLoc.add("구미");
		memLoc.add("군산");
		memLoc.add("군포");
		memLoc.add("김제");                        
		memLoc.add("김천");
		memLoc.add("김포");
		memLoc.add("김해");
		memLoc.add("나주");                        
		memLoc.add("남양주");
		memLoc.add("남원");
		memLoc.add("논산");
		memLoc.add("당진");                        
		memLoc.add("대구광역시");
		memLoc.add("대전광역시");
		memLoc.add("동두천");
		memLoc.add("동해");                        
		memLoc.add("목포");
		memLoc.add("문경");
		memLoc.add("밀양");
		memLoc.add("보령");                        
		memLoc.add("부산광역시");
		memLoc.add("부천");
		memLoc.add("사천");
		memLoc.add("삼척");                        
		memLoc.add("상주");
		memLoc.add("서귀포");
		memLoc.add("서산");
		memLoc.add("서울특별시");                        
		memLoc.add("성남");
		memLoc.add("세종특별자치시");
		memLoc.add("속초");
		memLoc.add("수원");                        
		memLoc.add("순천");
		memLoc.add("시흥");
		memLoc.add("아산");
		memLoc.add("안동");                        
		memLoc.add("안산");
		memLoc.add("안성");
		memLoc.add("안양");
		memLoc.add("양산");                        
		memLoc.add("양주");
		memLoc.add("여수");
		memLoc.add("영주");
		memLoc.add("영천");
		memLoc.add("오산");
		memLoc.add("용인");                        
		memLoc.add("울산광역시");
		memLoc.add("원주");
		memLoc.add("의왕");
		memLoc.add("의정부");
		memLoc.add("이천");
		memLoc.add("익산");                        
		memLoc.add("인천광역시");
		memLoc.add("전주시");
		memLoc.add("정읍");
		memLoc.add("제주도");
		memLoc.add("제천");
		memLoc.add("진주");                        
		memLoc.add("창원");
		memLoc.add("천안");
		memLoc.add("청주");
		memLoc.add("춘천");
		memLoc.add("충주");
		memLoc.add("태백");                        
		memLoc.add("통영");
		memLoc.add("평택");
		memLoc.add("포천");
		memLoc.add("포항");
		memLoc.add("하남");
		memLoc.add("화성");                        
	
		           
		return memLoc;
		
		
	} 
		
	//회원가입 여행법에 대한 SELECT 만들기..
	@ModelAttribute("memPreferTrip")
	protected List<String> referData2() throws Exception {
		List<String> memPreferTrip = new ArrayList<String>();
		    
		memPreferTrip.add("숙소 중심");                        
		memPreferTrip.add("활동 중심");
		memPreferTrip.add("경치 중심");
		memPreferTrip.add("자연 중심");
		            
		return memPreferTrip;
	
	} 
	

}
