package Controller.Car;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarCalendarReservationController { //일정예약 컨트롤
	
	@RequestMapping("/Car/carCalendaReservation")
	public String carCalendarReservationForm() {
		return "Car/car_calendar_reservation";
	}

}
