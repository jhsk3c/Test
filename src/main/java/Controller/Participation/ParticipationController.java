package Controller.Participation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Participation.ParticipationCommand;
import Service.Participation.MemNumCheckService;
import Service.Participation.WriteService;

@Controller
public class ParticipationController {
	@Autowired
	MemNumCheckService memNumCheckService;
	@Autowired
	WriteService writeService;

	@RequestMapping(value = "/participation")
	public String write(@RequestParam(value = "contestNum") String contestNum,
			ParticipationCommand participationCommand, HttpSession session) {
		Integer result = memNumCheckService.memNumCheck(session, contestNum);
//		System.out.println("결과값" + result);
		if (result == null) {
			return "Participation/writeForm"; // 참가내역 없으면 writeForm으로
		} else {
			return "Participation/participationOverlap"; // 참가신청내역이 있으면
		}
	}

	@RequestMapping("/participationWritePro")
	public String writePro(@RequestParam(value = "contestNum") String contestNum,
			ParticipationCommand participationCommand, HttpSession session, HttpServletRequest request) {
		writeService.write(contestNum, participationCommand, session, request);
		return "redirect:main"; // 참가내역으로 넘겨줘야함
	}
}
