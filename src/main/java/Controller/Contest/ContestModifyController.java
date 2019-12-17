package Controller.Contest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Contest.ContestCommand;
import Model.DTO.ContestDTO;
import Service.Contest.ContestDetailService;
import Service.Contest.ContestModifyService;

@Controller
public class ContestModifyController {
	@Autowired
	ContestDetailService contestDetailService;
	@Autowired
	ContestModifyService contestModifyService;
	
	@RequestMapping("/contestModify")
	public String modify(@RequestParam(value = "contestNum") String contestNum, Model model, ContestCommand contestCommand) {
		ContestDTO contest = contestDetailService.contestDetail(contestNum, model);
		model.addAttribute("contest", contest);
		System.out.println("conttestNUM ======" + contest.getContestNum());
		return "Contest/contestModifyForm";
	}
	
	@RequestMapping("/contestModifyPro") 
	public String modifyPro(@RequestParam(value = "contestNum", required = false) String contestNum, ContestCommand contestCommand) {
		Integer reslut = contestModifyService.modify(contestNum, contestCommand);
		System.out.println("contestNum = = = == = =" + contestNum);
		if(reslut == 1) {
			System.out.println("업데이트 성공");
		} else {
			System.out.println("업데이트 실패");
		}
		return "redirect:/main"; // 수정완료되면 detail 혹은 list로~
	}
}
