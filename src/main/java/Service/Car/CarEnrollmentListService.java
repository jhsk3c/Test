package Service.Car;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.Car.CarWriterCommand;
import Model.DTO.AuthInfo;
import Model.DTO.CarDTO;
import Repository.Car.CarRepository;

@Service
public class CarEnrollmentListService {
	
	@Autowired
	CarRepository carRepository;
	
	public String carEnrollmentList(CarWriterCommand carWriterCommand,Model model,HttpSession session) {
		
		List<CarDTO> list = new ArrayList<CarDTO>();
		if(((AuthInfo)session.getAttribute("authInfo")).getMemLev() == 4) {
		list = carRepository.carEnrollmentAllSelectAdmin(carWriterCommand);	
		}else {
		carWriterCommand.setMemNum(((AuthInfo)session.getAttribute("authInfo")).getNum());
		list = carRepository.carEnrollmentAllSelect(carWriterCommand);
		}
		model.addAttribute("list",list);
		
		return "Car/car_List";
		
		
	}

}
