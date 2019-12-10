package Service.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.Login.ComLoginCommand;
import Command.Login.LoginCommand;
import Repository.Member.MemberRepository;

@Service
public class LoginMainService {
	
	@Autowired
	MemberRepository memberRepository;

	public Integer LevCheck(Model model, LoginCommand loginCommand) {
		
		String Lev = loginCommand.getMemId();
		
		Integer result = memberRepository.LevCheck(Lev);
		
		
		System.out.println(result);
		
		return result;
		
	}

	public Integer LevComCheck(Model model, ComLoginCommand comLoginCommand) {
		
		String Lev = comLoginCommand.getComId();
		
		Integer result = memberRepository.LevComCheck(Lev);
		
		
		System.out.println(result);
		
		return result;
	}

}
