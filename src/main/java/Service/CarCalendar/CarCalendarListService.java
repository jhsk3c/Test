package Service.CarCalendar;

import java.util.ArrayList;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.Car.CarCalendarCommand;
import Model.DTO.CarCalendarJoinDTO;
import Repository.CarCalendar.CarCalendarRepository;

@Service
public class CarCalendarListService {
	
	@Autowired
	CarCalendarRepository carCalendarRepository; 
	
	public void calendarList(CarCalendarCommand carCalendarCommand, HttpSession session, Model model) {
		
		List<CarCalendarJoinDTO> list = new ArrayList<CarCalendarJoinDTO>();
			CarCalendarJoinDTO carCalendarJoinDTO = new CarCalendarJoinDTO(); 
			list = carCalendarRepository.calendarAllList(carCalendarJoinDTO); 
			model.addAttribute("calendarList",list);
		
	}
	

}
