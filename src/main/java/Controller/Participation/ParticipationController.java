package Controller.Participation;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Participation.ParticipationCommand;
import Service.Participation.WriteService;

@Controller
public class ParticipationController {
	@Autowired
	WriteService writeService;
	
	@RequestMapping("/participationPage")
	public String write() {
		return "Participation/writeForm";
	}
	
	@RequestMapping("/participationWritePro")
	public String writePro(@RequestParam(value = "contestNum") String contestNum ,ParticipationCommand participationCommand, HttpSession session) {
		writeService.write(contestNum, participationCommand, session);
		return "";
	}
}
