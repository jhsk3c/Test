package Controller.Spot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.Spot.SpotCommand;
import Servoce.Vspot.VspotService;

@Controller
public class SpotController {
	
	@Autowired
	private VspotService vspotService;
	
	@RequestMapping("travel/spot")
	public String gorm(SpotCommand spotCommand) {
		
		return "Spot/Vspot";
	}
	 

	@RequestMapping("travel/vspotPro") //경로를 잡아봅시다.
	public String vspot(SpotCommand spotCommand, HttpServletRequest request, HttpSession session ) {
		
		vspotService.vspotWrite(spotCommand, request, session);
		return "Main/mainView";
		
	}
	
}
