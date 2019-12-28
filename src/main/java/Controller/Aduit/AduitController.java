package Controller.Aduit;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Aduit.AduitProService;

@Controller
public class AduitController {
	@Autowired
	AduitProService aduitProService;

	@RequestMapping("/aduit")
	public String aduit(@RequestParam(value = "memId") String memId, @RequestParam(value = "pNum") String pNum,
			Model model) {
		model.addAttribute("pNum", pNum);
		model.addAttribute("memId", memId);
		return "Aduit/aduitForm"; // 심사 Form
	}

	@RequestMapping("/aduitPro")
	public String aduitPro(@RequestParam(value = "memId") String memId, @RequestParam(value = "pNum") String pNum,
			@RequestParam(value = "auditOriginality", required = false) String a,
			@RequestParam(value = "auditPracticality", required = false) String b, Model model, HttpSession session) {
//		System.out.println("pNum === " + pNum);
//		System.out.println("a와 b " + a);
//		System.out.println("a와 b " + b);
		Integer i = aduitProService.aduitPro(memId, pNum, a, b, model, session);
		if (i == 1) {
			return "Aduit/commercialization"; // auditPass가 합격일시 상품화 요청 진행.
		} else {
			return "redirect:/main";
		}
	}
}
