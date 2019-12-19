package Controller.Main;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController { 
	
	@RequestMapping("/main")
	public String main(HttpSession session) {
		
		
		return "Main/mainView";
	}
}
