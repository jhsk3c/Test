package Controller.Contest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Model.DTO.ContestDTO;
import Service.Contest.ContestListService;

@Controller
public class ContestListController {
	@Autowired
	ContestListService contestListService;

	@RequestMapping(value = "/contestList", method = RequestMethod.GET)
	public String contestList(Model model) {
		contestListService.contestList(model);
		return "Contest/contestListForm";
	}
}
