package Service.CarCalendar;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import Model.DTO.CarCalendarJoinDTO;
import Repository.CarCalendar.CarCalendarRepository;

@Service
public class CarCalendarDetailService { //일정 상세정보
	
	@Autowired
	CarCalendarRepository carCalendarRepository;
	
	public void calendarDetail(Integer calendarNumber ,Model model) {
		
		CarCalendarJoinDTO calendarDTO = carCalendarRepository.calendarDetailOneSelect(calendarNumber);
		
		model.addAttribute("calendarDTO", calendarDTO);
	}
}
