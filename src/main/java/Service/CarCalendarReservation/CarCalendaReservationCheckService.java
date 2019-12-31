package Service.CarCalendarReservation;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.AuthInfo;

@Service
public class CarCalendaReservationCheckService {

	public void carCalendaReservationCheck(Model model,HttpSession session){
		String userName = ((AuthInfo)session.getAttribute("authInfo")).getName();
		model.addAttribute("userName",userName);
		
	}
}
