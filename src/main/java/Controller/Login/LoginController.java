package Controller.Login;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Login.ComLoginCommand;
import Command.Login.LoginCommand;
import Service.Login.LoginMainService;
import Service.Login.LoginService;
import Validator.ComLoginCommandValidator;
import Validator.LoginCommandValidator;

@Controller

public class LoginController {
	
	 @Autowired
	 private LoginService loginService;
	 
	 @Autowired
	 private LoginMainService loginMainService;
	 	
	@RequestMapping(value = "login",method=RequestMethod.POST)
	public String loginPro(LoginCommand loginCommand, Errors errors, HttpSession session, HttpServletResponse response, Model model) {
		new LoginCommandValidator().validate(loginCommand, errors);
			if(errors.hasErrors()) { 
				return "Login/login"; 
			}
		 
		 Integer i = loginService.loginPro(loginCommand, session, response);
		 
		 if( i ==0) {
			 errors.rejectValue("memId", "notId"); 
			 return "Login/login"; 
		 }else {
			if( i == -1) {
				errors.rejectValue("memPw", "wrong"); 
				return "Login/login"; 
		 	} 	
		}
		 
		 Integer result = loginMainService.LevCheck(model, loginCommand);
		 model.addAttribute("Lev",result);
		 
		 
		 
		return "Main/mainView";
	}

	
	
	@RequestMapping(value = "login", method=RequestMethod.GET)
	public String LoginPro(LoginCommand loginCommand) {

		return "Login/login";
	}
	
	// 여기 하단부터기 기업 회원 로그인에 대한 정보.
	
	
	@RequestMapping(value = "comLogin", method = RequestMethod.POST)
	public String comLoginPOST(ComLoginCommand comLoginCommand, Errors errors, HttpSession session, HttpServletResponse response, Model model) {
		new ComLoginCommandValidator().validate(comLoginCommand, errors);
		if(errors.hasErrors()) { 
			return "Login/comLogin"; 
		}
	 
	 Integer i = loginService.comLoginPro(comLoginCommand, session, response);
	 
	 if( i ==0) {
		 errors.rejectValue("comId", "notId"); 
		 return "Login/comLogin"; 
	 }else {
		if( i == -1) {
			errors.rejectValue("comPw", "wrong"); 
			return "Login/comLogin"; 
	 	} 	
	}
	//해야할 일 : LEV 2로 로그인을하면  알림창?? 아직 승인처리 되지 않았다고. => 1~2시간.. 후 등록 가자(그리고 승인눌렀을떄 승인 날짜와 승인으로 변경하기)
	 
	 Integer result = loginMainService.LevComCheck(model, comLoginCommand);
	 model.addAttribute("Lev",result);
	 
	 
	return "Main/mainView";
	}
	
	
	
	
	
	
	@RequestMapping(value = "comLogin", method = RequestMethod.GET)
	public String comLoginGET(ComLoginCommand comLoginCommand) {
		return "Login/comLogin";
	}

}
