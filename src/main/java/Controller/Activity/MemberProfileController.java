package Controller.Activity;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Activity.MemberProfileService;

	@Controller
	public class MemberProfileController {
		
		@Autowired
		private MemberProfileService memberProfileService;
		
		
		@RequestMapping("/profile")
		public String MemberProfile( HttpSession session, Model model, @RequestParam(value = "page", defaultValue = "1") Integer page) {
			System.out.println("접근Controller_MemberProfile");
			System.out.println("접근");
			System.out.println("접근");
			System.out.println("접근");
		
		return memberProfileService.ActivitySelect(model, session, page);
		}
		
}
