package Controller.Participation;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Participation.PeopleSelectService;

@Controller
public class ParticipationPeopleController {
	@Autowired
	PeopleSelectService peopleSelectService; 

	@RequestMapping("participationPeople") // 참가자 조회
	public String select(@RequestParam(value = "contestNum") String contestNum, Model model, HttpSession session) {
		peopleSelectService.selectPeople(contestNum, model, session);
		return "Participation/peopleSelect";
	}
}
