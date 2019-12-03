package Controller.Recreation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecreationController { //휴양지 컨트롤
	
	@RequestMapping("/Recreation/recreation")
	public String recreation(){// 휴양지 
		
		return "Recreation/recreationList";
		
	}

}
