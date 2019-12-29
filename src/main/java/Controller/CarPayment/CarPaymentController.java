package Controller.CarPayment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.CarPayment.CarPaymentCommand;
import Service.CarPayment.CarPaymentInsertService;

@Controller
public class CarPaymentController { //결제 컨트롤
	
	@Autowired
	CarPaymentInsertService carPaymentInsertService;
	
	@RequestMapping("/Car/carPayment")
	public String carPaymentForm(CarPaymentCommand carPaymentCommand ) {
		return "Car/car_payment";
	}

	@RequestMapping("/Car/carPaymentPro")
	public String carPaymentInsertPro(CarPaymentCommand carPaymentCommand ) {
		carPaymentInsertService.carPaymentInsertPro(carPaymentCommand);
		
		return "Car/car_payment";
	}
}
