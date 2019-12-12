package Controller.Contest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Contest.ContestCommand;
import Service.Contest.ContestInsertService;

@Controller
public class ContestController {
	@Autowired
	ContestInsertService contestInsertService;

	@RequestMapping("/contest") // 공모전 메인
	public String contestMain(Model model, HttpSession session) {
		return "Contest/contestMain";
	}

	@RequestMapping("/contestInsertForm") // 공모전 등록 폼
	public String contestInsertForm(ContestCommand contestCommand) {
		return "Contest/contestInsertForm";
	}

	@RequestMapping(value = "/contestInsert", method = RequestMethod.POST) // 공모전 등록
	public String contestInsert(ContestCommand contestCommand, HttpServletRequest request, HttpSession session, Model model) {
		Integer i = contestInsertService.contestInsert(contestCommand, request, session, model);
		return "redirect:/contestList"; // list로 이동하게만들어야댐
	}

}
