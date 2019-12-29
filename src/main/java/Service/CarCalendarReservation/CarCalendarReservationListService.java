package Service.CarCalendarReservation;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.CarReserVation.CarReserVationCommand;
import Model.DTO.CarJoinDTO;
import Repository.CarCalendarReservation.CarCalendarReservationRepository;

@Service
public class CarCalendarReservationListService {
	
	@Autowired
	CarCalendarReservationRepository carCalendarReservationRepository;
	
	
	public void carReservationList(CarReserVationCommand carReserVationCommand,Model model,HttpSession session) {
		List<CarJoinDTO> list = new ArrayList<CarJoinDTO>();
		CarJoinDTO carJoinDTO = new CarJoinDTO();
		
		list = carCalendarReservationRepository.selectCarReservationList(carJoinDTO);
		
		model.addAttribute("carJoinDTO",list);
		
		
		
		
		
	}

}
