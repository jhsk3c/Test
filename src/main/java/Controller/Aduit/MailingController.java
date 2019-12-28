package Controller.Aduit;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Model.DTO.MemberDTO;
import Service.Aduit.FindMemberService;
import Service.Aduit.MailingService;

@Controller
public class MailingController {
	@Autowired
	FindMemberService findmemberService;
	@Autowired
	MailingService mailingService;

	@RequestMapping("emailTransmission")
	public String mailing(@RequestParam("memId") String memId, HttpServletRequest request, Model model) {
		MemberDTO member = new MemberDTO();
		member.setMemId(memId);
		System.out.println("받아온 memId찾아라 :: " + member.getMemId());
		String memEmail = findmemberService.findMember(member); // 받는 사람 이메일
		System.out.println("왜 못ㅂ다아와 " + memEmail);
		mailingService.sendMail(memEmail, memId); // 메일보내기 service
		return "redirect:/main";
	}
}
