package Controller.CarPayment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.CarPayment.CarPaymentCommand;
import Service.CarPayment.CarKakaoPaySelectService;
import Service.CarPayment.CarPaymentInsertService;

@Controller
public class CarPaymentController { //결제 컨트롤
	
	@Autowired
	CarPaymentInsertService carPaymentInsertService; //결제 등록서비스
	
	@Autowired
	CarKakaoPaySelectService carKakaoPaySelectService; //결제 정보 필요한것들 가져오기
	
	@RequestMapping("/Car/carPayment")
	public String carPaymentForm(CarPaymentCommand carPaymentCommand,Model model ) {
		/* carKakaoPaySelectService.kakaoPaySelect(calendarNumber,model); 에러 */
		return "Car/car_kakaoPay";
	}
	@RequestMapping("/Car/carPaymentPro")
	public String carPaymentInsertPro(CarPaymentCommand carPaymentCommand) {
		carPaymentInsertService.carPaymentInsertPro(carPaymentCommand);
		
		return "Car/car_payment";
	}
}
