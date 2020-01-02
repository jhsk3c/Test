package Service.Car;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.DTO.AuthInfo;
import Model.DTO.CarDTO;
import Repository.Car.CarRepository;

@Service
public class CarWriterMemNumCheckService {

	@Autowired
	CarRepository carRepository;
	
	public Integer memNumCheckService(HttpSession session) {
		CarDTO carDTO = new CarDTO();
			
			carDTO.setMemNum(((AuthInfo)session.getAttribute("authInfo")).getNum());
			
				Integer i = carRepository.carMemNumCheck(carDTO);
		
		return i;
	}
}
