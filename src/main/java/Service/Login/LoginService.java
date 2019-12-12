package Service.Login;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.Login.ComLoginCommand;
import Command.Login.LoginCommand;
import Encrypt.Encrypt;
import Model.DTO.AuthInfo;
import Model.DTO.ComMemberDTO;
import Model.DTO.MemberDTO;
import Repository.Member.MemberRepository;

@Service
public class LoginService {

	@Autowired
	MemberRepository memberRepository;

	public Integer loginPro(LoginCommand loginCommand, HttpSession session, HttpServletResponse response) {
		MemberDTO member = new MemberDTO();
		Integer result = null;

		member.setMemId(loginCommand.getMemId());
		member = memberRepository.memLogin(member);

		AuthInfo authInfo = null;
		if (member == null) {
			result = 0; // 아이디 없을 때
		} else {
			if (member.getMemPw().equals(Encrypt.getEncryption(loginCommand.getMemPw()))) {
				authInfo = new AuthInfo(member.getMemNum(), member.getMemId(), member.getMemEmail(), member.getMemName(), member.getMemPw(),
						member.getMemLev()); // 로그인 정보 저장
				session.setAttribute("authInfo", authInfo);
					System.out.println("유저 LEV :::::::::" + member.getMemNum());
				setCookie(loginCommand, response);
				result = 1;
			} else {
				result = -1; // 비밀번호가 틀림
			}
		}

		return result;
	}

	public void setCookie(LoginCommand loginCommand, HttpServletResponse response) {
		Cookie cookie = new Cookie("idStore", loginCommand.getMemId());

		if (loginCommand.getInputIdStore()) {
			cookie.setMaxAge(60 * 60 * 24 * 30);
		} else {
			cookie.setMaxAge(0);
		}
		response.addCookie(cookie);
	}

	public Integer comLoginPro(ComLoginCommand comloginCommand, HttpSession session, HttpServletResponse response) {

		ComMemberDTO comMember = new ComMemberDTO();
		Integer result = null;

		comMember.setComId(comloginCommand.getComId());
		comMember = memberRepository.comLogin(comMember);

		AuthInfo authInfo = null;
		if (comMember == null) {
			result = 0; // 아이디 없을 때
		} else {
			if (comMember.getComPw().equals(Encrypt.getEncryption(comloginCommand.getComPw()))) {
				authInfo = new AuthInfo(comMember.getComNum(), comMember.getComId(), comMember.getContactEmail(), comMember.getComRepName(),
						comMember.getComPw(), comMember.getComLev()); // 로그인 정보 저장
				session.setAttribute("authInfo", authInfo);
				System.out.println("기업 LEV :::::::::" + comMember.getComNum());
				setCookie(comloginCommand, response);
				result = 1;
			} else {
				result = -1; // 비밀번호가 틀림
			}
		}

		return result;
	}

	public void setCookie(ComLoginCommand comloginCommand, HttpServletResponse response) {
		Cookie cookie = new Cookie("comidStore", comloginCommand.getComId());

		if (comloginCommand.getInputIdStore()) {
			cookie.setMaxAge(60 * 60 * 24 * 30);
		} else {
			cookie.setMaxAge(0);
		}
		response.addCookie(cookie);
	}

}