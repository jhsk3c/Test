package Service.CarPayment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.CarJoinDTO;
import Repository.CarPay.CarPayRepository;

@Service
public class CarKakaoPaySelectService {
	
	@Autowired
	CarPayRepository carPayRepository;
	
	
	public void kakaoPaySelect(Integer calendarNumber,Model model) {
		
		CarJoinDTO carJoinDTO = new CarJoinDTO();
		carJoinDTO = carPayRepository.payInfoSelect(calendarNumber);
		model.addAttribute("carJoinDTO", carJoinDTO);
	}

}
