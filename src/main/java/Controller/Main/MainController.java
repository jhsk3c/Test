package Controller.Main;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Repository.Vspot.VspotRepository;
import Service.Main.MainService;

@Controller
public class MainController { 
	
	@Autowired
	private MainService mainService;
	
	@RequestMapping("/main")
	public String main(HttpSession session, Model model) {
		
		return mainService.memLiset(model);
	}
	
}
