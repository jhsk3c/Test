package Service.CarCalendarReservation;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Command.CarReserVation.CarReserVationCommand;
import Model.DTO.AuthInfo;
import Model.DTO.CarCalendarJoinDTO;
import Model.DTO.CarCalendarReservationDTO;
import Repository.CarCalendarReservation.CarCalendarReservationRepository;

@Service
public class CarCalendarReservationInsertProService { // 일정예약 등록 서비스 역활.

	@Autowired
	CarCalendarReservationRepository carCalendarReservationRepository; // 일정예약 repository

	@Transactional
	public void carReservationInsertPro(Integer calendarNumber,CarReserVationCommand carReserVationCommand){
			
		try {
		
		
			
		CarCalendarReservationDTO carCalendarReserationDTO = new CarCalendarReservationDTO();
		carCalendarReserationDTO.setCalendarNumber(calendarNumber);
		System.out.println("캘린더넘버"+carCalendarReserationDTO.getCalendarNumber());
		
		
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd"); //스트링을 타임스템프로 형변환.
		Date date = (Date) dt.parse(carReserVationCommand.getCarStartDate());
		Timestamp carReserVationCarStartDate = new Timestamp(date.getTime());
		carCalendarReserationDTO.setCarStartDate(carReserVationCarStartDate);
		
		System.out.println("carCalendarReserationDTO.setCarStartDate" + carCalendarReserationDTO.getCarStartDate());
		
		SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd"); //스트링을 타임스템프로 형변환.
		Date date1 = (Date) dt1.parse(carReserVationCommand.getCarEndDate());
		Timestamp carReserVationCarEndDate = new Timestamp(date1.getTime());
		carCalendarReserationDTO.setCarEndDate(carReserVationCarEndDate);
		System.out.println("carCalendarReserationDTO.setCarEndDate" + carCalendarReserationDTO.getCarEndDate());
		
		
		carCalendarReserationDTO.setCarStartTime(carReserVationCommand.getCarStartTime());
		System.out.println("carCalendarReserationDTO.setCarStartTime" + carCalendarReserationDTO.getCarStartTime());
		carCalendarReserationDTO.setCarEndTime(carReserVationCommand.getCarEndTime());
		System.out.println("carCalendarReserationDTO.setCarEndTime"+ carCalendarReserationDTO.getCarEndTime());
		carCalendarReserationDTO.setCarName(carReserVationCommand.getCarName());
		System.out.println("carCalendarReserationDTO.setCarName"+ carReserVationCommand.getCarName());
		carCalendarReservationRepository.carCalendarReservationInsert(carCalendarReserationDTO);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
}
