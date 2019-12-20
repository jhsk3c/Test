package Controller.Aduit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AduitController {
	
	@RequestMapping("/aduit") 
	public String aduit(@RequestParam(value = "pNum") String pNum) {
		
		return "Aduit/aduitForm"; // 심사 Form
	}
}
