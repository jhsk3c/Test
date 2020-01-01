package Service.CarCalendarReservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.CarCalendarJoinDTO;
import Repository.CarCalendarReservation.CarCalendarReservationRepository;

@Service
public class CarNameSelectService {
	
	@Autowired
	CarCalendarReservationRepository carCalendarReservationRepository;
	
	public void carNameSelect(Long calendarNumber,String carName,Model model) {
		
		String calendarNumber1 = calendarNumber.toString();
		Integer calendarNum = Integer.parseInt(calendarNumber1);
		
		CarCalendarJoinDTO carCalendarJoinDTO = new CarCalendarJoinDTO();
		carCalendarJoinDTO.getCarCalendarDTO().setCalendarNumber(calendarNum);
		carCalendarJoinDTO.getCarDTO().setCarName(carName);
		carCalendarJoinDTO = carCalendarReservationRepository.carNameSelect(carCalendarJoinDTO);
		model.addAttribute("carName",carCalendarJoinDTO);
		
	}

}
