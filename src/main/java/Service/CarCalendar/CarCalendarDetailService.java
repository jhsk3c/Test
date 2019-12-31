package Service.CarCalendar;


import java.util.ArrayList;
import java.util.List;

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
		List<String> list = new ArrayList<String>();
		CarCalendarJoinDTO calendarDTO = new CarCalendarJoinDTO();
		calendarDTO = carCalendarRepository.calendarDetailOneSelect(calendarNumber);
		if(calendarDTO.getCarDTO().getCarImage() != null) {
			
			String [] stores = calendarDTO.getCarDTO().getCarImageStore().split("-");
			for(String store: stores) {
				list.add(store);
			}
			model.addAttribute("stores",list);
		}
			model.addAttribute("calendarDTO", calendarDTO);
	}
}
