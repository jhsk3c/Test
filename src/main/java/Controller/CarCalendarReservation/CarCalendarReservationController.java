package Controller.CarCalendarReservation;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import Command.CarReserVation.CarReserVationCommand;
import Service.CarCalendarReservation.CarCalendarReservationDetailService;
import Service.CarCalendarReservation.CarCalendarReservationInsertProService;
import Service.CarCalendarReservation.CarCalendarReservationListService;

@Controller
public class CarCalendarReservationController { //일정예약 컨트롤
	
	@Autowired
	CarCalendarReservationInsertProService carCalendarReservationInsertProService; //일정예약 등록 서비스.

	@Autowired
	CarCalendarReservationListService carCalendarReservationListService; //일정 예약완료 리스트
	
	@Autowired
	CarCalendarReservationDetailService carCalendarReservationDetailService; //일정 상세정보
	
	@RequestMapping("/Car/carCalendaReservation") //예약 폼
	public String carCalendarReservationForm(@RequestParam(value = "calendarNumber") Long calendarNumber, CarReserVationCommand carReserVationCommand,Model model) {
		return "Car/car_calendar_reservation";
	}
	
	@RequestMapping("/Car/carCalendaReservationPro") //예약 등록 
	public String carCalendarReservationInsertPro(@RequestParam(value = "calendarNumber") Integer calendarNumber, CarReserVationCommand carReserVationCommand) { //회원이 예약 등록.
		System.out.println("calendarNumbercalendarNumbercalendarNumbercalendarNumbercalendarNumbercalendarNumber" + calendarNumber);
			carCalendarReservationInsertProService.carReservationInsertPro(calendarNumber,carReserVationCommand); //예약 등록 서비스
		return "redirect:/Car/carPayment";
	}
	
	@RequestMapping("/Car/carCalendaReservationList") //예약 리스트
	public String carCalendarReservationList( CarReserVationCommand carReserVationCommand,Model model ,HttpSession session) { //회원이 예약 등록.
			carCalendarReservationListService.carReservationList(carReserVationCommand,model,session); //예약 목록 서비스
		return "Car/car_calendar_reservation_List";
	}
	
	@RequestMapping("/Car/carCalendarReservationDetail") //예약 상세정보
	public String carCalendarReservationList(@RequestParam(value="calenderReservationNum") Integer calenderReservationNum , Model model) { //회원이 예약 등록.
			carCalendarReservationDetailService.carReservationDetail(calenderReservationNum,model); //예약 상세정보 서비스
		return "Car/car_calendar_reservation_detail";
	}

	
}
