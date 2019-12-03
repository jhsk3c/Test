package Controller.Car;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {

	@RequestMapping("/Car/carList")
	public String carList() { //차 공유 리스트
		return "Car/carList";
	}
}
