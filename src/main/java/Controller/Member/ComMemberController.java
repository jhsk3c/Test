package Controller.Member;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import CommandMember.ComMemberCommand;
import Service.Member.ComMemberInfoService;
import Service.Member.ComMemberJoinUserCheckService;
import Validator.ComMemberCommandValidator;

@Controller
public class ComMemberController {
	
	@Autowired
	private ComMemberInfoService comMemberInfoService;
	
	@Autowired
	private ComMemberJoinUserCheckService comMemberJoinUserCheckService;
	
	@RequestMapping("/comMemberInfo")
	public String comMemberInfo(ComMemberCommand comMemberCommand) {
		
		return "Member/comMemberInfo";
	}
	
	@RequestMapping("/comMemberInfoPro")
	public String comMemberInfo(ComMemberCommand comMemberCommand, Errors errors) {
		
		new ComMemberCommandValidator().validate(comMemberCommand, errors);
		
		if(errors.hasErrors()) {
			return "Member/comMemberInfo";
		}
		
		Integer result = comMemberInfoService.InfoInsert(comMemberCommand);
		
		if(result != 0) {
			return "redirect:/main";
		}
		else {
			return "Member/comMemberInfoPro";
		}

	}
	
	
	
	@RequestMapping(value = "/comMemCheck", method = RequestMethod.POST)
	@ResponseBody
	public String memCheck(@RequestParam("comId") String comId) {
		 System.out.println("컨트롤러 접근 확인"); 
		 String str = "";
		 Integer idcheck1 = comMemberJoinUserCheckService.getComCheck(comId);
		 if(idcheck1 == 1) {
			 str ="NO"; // 중복ID
		 } else {
			 str ="YES";
		 }
		return str;
	}
	
	
	
	
	
	
	
	
	
	
	

}
