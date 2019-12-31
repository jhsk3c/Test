package Controller.CarCalendar;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Car.CarCalendarCommand;
import Service.CarCalendar.CarCalendarDetailService;
import Service.CarCalendar.CarCalendarListService;
import Service.CarCalendar.CarCalendarWriterService;

@Controller
public class CarCalendarController {
	
	@Autowired
	CarCalendarWriterService carCalendarWriterService; //일정등록 서비스
	
	@Autowired
	CarCalendarListService carCalendarListService; //일정 목록 서비스
	
	@Autowired
	CarCalendarDetailService carCalendarDetailService; // 일정 상세 정보
	
	@RequestMapping("/Car/carCalendarList") //일정 목록
	public String calendarList(CarCalendarCommand carCalendarCommand, HttpSession session, Model model) {
	
		carCalendarListService.calendarList(carCalendarCommand,session,model); //일정 목록
		
		return "Car/car_calendar_list";
	}
	
	@RequestMapping("/Car/carCalendarWriter") //일정등록 사이트 이동
	public String calendarWriter(CarCalendarCommand carCalendarCommand ) {
		
		return "Car/car_calendar";
	}
	
	@RequestMapping("/Car/carCalendarWriterPro") //일정등록 사이트값을 적용
	public String calendarWriterPro(CarCalendarCommand carCalendarCommand,HttpSession session ) {
		carCalendarWriterService.calendarWriter(carCalendarCommand,session);
		return "redirect:/Car/carCalendarList";
	}
	
		@RequestMapping("/Car/carCalendarDetail") //일정 상세정보
		public String calendarList(@RequestParam(value="calendarNumber") Integer calendarNumber , Model model) {
		
		carCalendarDetailService.calendarDetail(calendarNumber,model); //일정 상세정보
		
		return "Car/car_calendar_Detail";
	}

}
