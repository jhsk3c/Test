package Controller.Contest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Contest.ContestDetailService;
import Service.Contest.ContestListService;

@Controller
public class ContestListController {
	@Autowired
	ContestListService contestListService;
	@Autowired
	ContestDetailService contestDetailService;

	@RequestMapping(value = "/contestList", method = RequestMethod.GET) // 공모전 리스트
	public String contestList(Model model) {
		contestListService.contestList(model);
		return "Contest/contestListForm";
	}

	@RequestMapping() // 공모전 상세정보
	public String contestDetail(@RequestParam(value = "contestNum", required = false) String contestNum, Model model) {
		contestDetailService.contestDetail(contestNum, model);
		return "Contest/contestDetail";
	}
}
