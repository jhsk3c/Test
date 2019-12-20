package Service.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.CarDTO;
import Repository.Car.CarRepository;

@Service
public class CarDetailService {
	
	@Autowired
	CarRepository careRepository;
	
	public void carDetatilOneSelect(Integer driveNum ,Model model) {
		
		System.out.println("carDTO드라이브넘버" + driveNum);
		CarDTO carDTO = careRepository.carDetailOneSelect(driveNum);
		System.out.println("carDTOCarDTOcarDTO"+carDTO.getDriveNum());
		model.addAttribute("carDTO",carDTO);
		
	}

}
