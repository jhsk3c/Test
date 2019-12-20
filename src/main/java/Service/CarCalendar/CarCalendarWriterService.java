package Service.CarCalendar;

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
		
		carCalendarCommand.setUserName(((AuthInfo)session.getAttribute("authInfo")).getName());
		
		String userName = carCalendarCommand.getUserName();
		System.out.println("이름이름이름이름 :" + userName);
		Integer driveNum = carCalendarRepository.driveNumSelect(userName);
		System.out.println("일정에 들어갈 driveNum :" + driveNum);
		
		CarCalendarDTO carCalendarDTO = new CarCalendarDTO();
		
		carCalendarDTO.setDriveNum(driveNum);
		
		
		
		
	}

}
