package Controller.CarCalendar;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.Car.CarCalendarCommand;
import Service.CarCalendar.CarCalendarWriterService;

@Controller
public class CarCalendarController {
	
	@Autowired
	CarCalendarWriterService carCalendarWriterService;
	
	@RequestMapping("/Car/carCalendarList")
	public String calendarList() {
		
		return "Car/car_calendar_list";
	}
	
	@RequestMapping("/Car/carCalendarWriter")
	public String calendarWriter(CarCalendarCommand carCalendarCommand ) {
		
		return "Car/car_calendar";
	}
	
	@RequestMapping("/Car/carCalendarWriterPro")
	public String calendarWriterPro(CarCalendarCommand carCalendarCommand,HttpSession session ) {
		carCalendarWriterService.calendarWriter(carCalendarCommand,session);
		return "redirect:/Car/carEnrollmentList";
	}


}
