package Controller.Contest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Contest.ContestCommand;
import Service.Contest.ContestInsertService;

@Controller
public class ContestController {
	@Autowired
	ContestInsertService contestInsertService;

	@RequestMapping("/contestInsertForm") // 공모전 등록 폼
	public String contestInsertForm(ContestCommand contestCommand) {
		return "Contest/contestInsertForm";
	}

	@RequestMapping(value = "/contestInsert", method = RequestMethod.POST) // 공모전 등록
	public String contestInsert(ContestCommand contestCommand, HttpServletRequest request) {
		Integer i = contestInsertService.contestInsert(contestCommand, request);
		return "redirect:/contestList"; // list로 이동하게만들어야댐
	}
	
}
