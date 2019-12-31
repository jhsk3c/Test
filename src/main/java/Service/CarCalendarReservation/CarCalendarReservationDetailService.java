package Service.CarCalendarReservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.CarJoinDTO;
import Repository.CarCalendarReservation.CarCalendarReservationRepository;


@Service
public class CarCalendarReservationDetailService {

	@Autowired
	CarCalendarReservationRepository carCalendarReservationRepository;
	
	public void carReservationDetail(Integer calenderReservationNum , Model model) { //예약 상세정보
			
		System.out.println(calenderReservationNum);
		
		CarJoinDTO carJoinDTO =  carCalendarReservationRepository.carCalendarReservationOneSelect(calenderReservationNum);
	
		model.addAttribute("carJoinDTO", carJoinDTO);
	}
}
