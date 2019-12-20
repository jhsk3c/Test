package Controller.Car;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarPaymentController { //결제 컨트롤
	
	@RequestMapping("/Car/carPayment")
	public String carPaymentForm() {
		return "Car/car_payment";
	}

}
