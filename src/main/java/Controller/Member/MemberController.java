package Controller.Member;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
		 System.out.println("memberInfo접근 확인");
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
			return "redirect:/main";
		}
		else {
			return "Member/memberInfo";
		}
		
	}
	
	@RequestMapping(value = "member/memCheck", method = RequestMethod.POST)
	@ResponseBody
	public String memCheck(@RequestParam("memId") String memId) {
		 System.out.println("컨트롤러 접근 확인");
		 String str = "";
		 Integer idcheck = memberJoinUserCheckService.getMemCheck(memId);
		 if(idcheck == 1) {
			 str ="NO"; // 중복ID
		 } else {
			 str ="YES";
		 }
		return str;
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
