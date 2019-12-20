package Controller.Car;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import Command.Car.CarWriterCommand;
import Model.DTO.AuthInfo;
import Service.Car.CarApprovalCheckService;
import Service.Car.CarDetailService;
import Service.Car.CarEnrollmentListService;
import Service.Car.CarEnrollmentModifyService;
import Service.Car.CarWriterMemNumCheckService;
import Service.Car.CarWriterProService;
import Validator.CarWriterCommandValidator;

@Controller
public class CarController { //차 등록 컨트롤
	
	@Autowired
	CarWriterMemNumCheckService	carWriterMemNumCheckService; //차등록 중복방지 서비스
	
	@Autowired
	CarWriterProService carWriterProService; //차등록 서비스
	
	@Autowired
	CarEnrollmentListService carEnrollmentListService; //차 등록한 리스트 서비스
	
	@Autowired
	CarDetailService carDetailService; // 차 등록한 상세정보 서비스
	
	@Autowired
	CarApprovalCheckService carApprovalCheckService; // 승인할시  승인여부 알려주는 서비스
	
	@Autowired
	CarEnrollmentModifyService carEnrollmentModifyService; // 상세정보 수정하는  서비스
 
	@RequestMapping("/Car/carEnrollmentList")
	public String carList(CarWriterCommand carWriterCommand , Model model ,HttpSession session) { //차등록 리스트
		
		return carEnrollmentListService.carEnrollmentList(carWriterCommand,model,session);
	}
	
	@RequestMapping("/Car/carWriter")
	public String carWriter(CarWriterCommand carWriterCommand,HttpSession session) { //차 등록
		
		Integer i = carWriterMemNumCheckService.memNumCheckService(session);
		if(i == null) {
			return "Car/car_writer";	
		}
		return "redirect:/Car/carEnrollmentList";
		
		
	}
	
	@RequestMapping("/Car/carWriterPro")
	public String carWriterPro(CarWriterCommand carWriterCommand,HttpServletRequest request, HttpSession session,Errors errors) {
		System.out.println("드라이브넘 비교할거" + carWriterCommand.getDriveName());
		String SessionMemName = ((AuthInfo)session.getAttribute("authInfo")).getName();
		System.out.println("세션이름" + SessionMemName);
		carWriterCommand.setCarMemName(SessionMemName);
		new CarWriterCommandValidator().validate(carWriterCommand,errors);
		if(errors.hasErrors()) {
			return "Car/car_writer";
		}
		carWriterProService.carWriterPro(carWriterCommand,request,session);
		return "redirect:/Car/carEnrollmentList";
	}
	
	@RequestMapping("/Car/carDetail")
	public String carDetail(@RequestParam(value="driveNum")Integer driveNum ,Model model) {
		
		carDetailService.carDetatilOneSelect(driveNum , model);
		System.out.println("다탔다.");
		return "Car/carDetail";
	}
	@RequestMapping("/Car/carApprovalCheck")
	public String carApprovalCheck(@RequestParam(value = "driveNum")String driveNum,@RequestParam(value = "memNum") String memNum, 
			@RequestParam(value = "carApproval") Integer carApproval ,@RequestParam(value = "carImage") String carImage,
			@RequestParam(value = "driveLicense") String driveLicense,@RequestParam(value = "driveInsurance") String driveInsurance, 
			@RequestParam(value = "driveCarcheck") String driveCarcheck, HttpServletRequest request) {
			carApprovalCheckService.approvalUpdate(driveNum,memNum,carApproval,carImage,driveLicense,driveInsurance,driveCarcheck, request);
		return "redirect:/Car/carEnrollmentList";
	}
	
	@RequestMapping("/Car/carEnrollmentModify") //차 수정
	public String carEnrollmentModify(@RequestParam(value = "driveNum") Integer driveNum,Model model,CarWriterCommand carWriterCommand) {
		carDetailService.carDetatilOneSelect(driveNum , model);
		return "Car/car_Modify";
	}
	
	@RequestMapping("/Car/carEnrollmentModifyPro") //차 수정 실행
	public String carEnrollmentModify(CarWriterCommand carWriterCommand,HttpServletRequest request,HttpSession session) {
		carEnrollmentModifyService.carEnrollmentModify(carWriterCommand,request,session);
		return "redirect:/Car/carEnrollmentList";
	}	
}
