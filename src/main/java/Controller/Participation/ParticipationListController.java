package Controller.Participation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Participation.ParticipationListService;

@Controller
public class ParticipationListController {
	@Autowired
	ParticipationListService participationListService;

	@RequestMapping("participationList")
	public String list(@RequestParam(value = "memId") String memId, Model model) {
		participationListService.list(memId, model);
		return "Participation/participationList";
	}
}
