package Controller.Participation;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Participation.ParticipationDetailService;
import Service.Participation.PeopleSelectService;

@Controller
public class ParticipationPeopleController {
	@Autowired
	PeopleSelectService peopleSelectService; 
	@Autowired
	ParticipationDetailService participationDetailService;

	@RequestMapping("participationPeople") // 참가자 조회 (관리자가 보는 list)
	public String select(@RequestParam(value = "contestNum") String contestNum, Model model, HttpSession session) {
		peopleSelectService.selectPeople(contestNum, model, session);
		return "Participation/peopleSelect";
	}
	
	@RequestMapping("participationDetail") // 참가정보 detail
	public String detail(@RequestParam(value = "pNum") String pNum, Model model) {
		participationDetailService.detail(pNum, model);
		return "Participation/participationDetail";
	}
}
