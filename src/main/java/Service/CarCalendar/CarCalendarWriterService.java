package Service.CarCalendar;



import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.Car.CarCalendarCommand;
import Model.DTO.AuthInfo;
import Model.DTO.CarCalendarDTO;
import Repository.CarCalendar.CarCalendarRepository;

@Service
public class CarCalendarWriterService {
	
	@Autowired
	CarCalendarRepository carCalendarRepository;
	
	public void calendarWriter(CarCalendarCommand carCalendarCommand,HttpSession session) {
	
		System.out.println("calendarWriter : " + carCalendarCommand.getStartTime());
		
		try {
				CarCalendarDTO carCalendarDTO = new CarCalendarDTO();
				carCalendarCommand.setUserName(((AuthInfo)session.getAttribute("authInfo")).getName());
			
				String userName = carCalendarCommand.getUserName();
				System.out.println("이름이름이름이름 :" + userName);
				Integer driveNum = carCalendarRepository.driveNumSelect(userName);
				System.out.println("일정에 들어갈 driveNum :" + driveNum);	
				carCalendarDTO.setDriveNum(driveNum);
				SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
				Date date = (Date) dt.parse(carCalendarCommand.getCalendarDepartureDate());
				Timestamp calendarDepartureDate = new Timestamp(date.getTime());
				carCalendarDTO.setCalendarDepartureDate(calendarDepartureDate);
				System.out.println("carCalendarDTO DepartureDate : " + carCalendarDTO.getCalendarDepartureDate());
				carCalendarDTO.setStartTime(carCalendarCommand.getStartTime());
				System.out.println("carCalendarDTO : " + carCalendarDTO.getStartTime());
				carCalendarDTO.setCalendarStartingpoint(carCalendarCommand.getCalendarStartingpoint());
				System.out.println("carCalendarDTOCalendarStartingpoint : "+carCalendarDTO.getCalendarStartingpoint());
				carCalendarDTO.setCalendarDestination(carCalendarCommand.getCalendarDestination());
				System.out.println("setCalendarDestination"+carCalendarDTO.getCalendarDestination());
				carCalendarDTO.setDestinationTime(carCalendarCommand.getDestinationTime());
				System.out.println("setDestinationTime"+carCalendarDTO.getDestinationTime());
				carCalendarDTO.setPredictionTime(carCalendarCommand.getPredictionTime());
				System.out.println("setPredictionTime"+carCalendarDTO.getPredictionTime());
				carCalendarDTO.setPredictionPrice(Integer.parseInt(carCalendarCommand.getPredictionPrice()));
				System.out.println("getPrice"+carCalendarDTO.getPredictionPrice());
				SimpleDateFormat dt4 = new SimpleDateFormat("yyyy-MM-dd");
				Date date4 = (Date) dt4.parse(carCalendarCommand.getCalendarArrival());
				Timestamp calendarArrival = new Timestamp(date4.getTime());
				carCalendarDTO.setCalendarArrival(calendarArrival);
				System.out.println(carCalendarDTO.getCalendarArrival());
		
		carCalendarRepository.carCalendarInsert(carCalendarDTO);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
