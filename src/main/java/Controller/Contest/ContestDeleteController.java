package Controller.Contest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Contest.ContestDeleteService;

@Controller
public class ContestDeleteController {
	@Autowired
	ContestDeleteService contestDeleteService;

	@RequestMapping(value = "/contestDelete")
	public String contestDelete(@RequestParam(value = "contestNum") String contestNum, HttpServletRequest req) {
		Integer result = contestDeleteService.contestDelete(contestNum, req);
		if(result == 1) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
		return "redirect:/contestList";
	}
}
