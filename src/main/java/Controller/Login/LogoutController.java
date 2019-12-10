package Controller.Login;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.Login.MemberLogoutService;

@Controller
public class LogoutController {
	
	@Autowired
	private MemberLogoutService memberLogoutService;
	
	
	@RequestMapping("logout")
	public String logout(HttpSession session, HttpServletResponse response) {
		memberLogoutService.logout(session, response);
		return "redirect:/main";
	}
}
