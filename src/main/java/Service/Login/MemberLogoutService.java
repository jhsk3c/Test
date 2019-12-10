package Service.Login;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

@Service
public class MemberLogoutService {

	public void logout(HttpSession session, HttpServletResponse response) {
		session.invalidate();
		
	}

}
