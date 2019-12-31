package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CarJoinDTO implements Serializable {
	
	private MemberDTO memDTO;
	private CarDTO carDTO;
	private CarCalendarDTO carCalendarDTO;
	private CarCalendarReservationDTO carCalendarReservationDTO;
	private CarPaymentDTO carPaymentDTO;
	
	
	public MemberDTO getMemDTO() {
		return memDTO;
	}
	public void setMemDTO(MemberDTO memDTO) {
		this.memDTO = memDTO;
	}
	public CarDTO getCarDTO() {
		return carDTO;
	}
	public void setCarDTO(CarDTO carDTO) {
		this.carDTO = carDTO;
	}
	public CarCalendarDTO getCarCalendarDTO() {
		return carCalendarDTO;
	}
	public void setCarCalendarDTO(CarCalendarDTO carCalendarDTO) {
		this.carCalendarDTO = carCalendarDTO;
	}
	public CarCalendarReservationDTO getCarCalendarReservationDTO() {
		return carCalendarReservationDTO;
	}
	public void setCarCalendarReservationDTO(CarCalendarReservationDTO carCalendarReservationDTO) {
		this.carCalendarReservationDTO = carCalendarReservationDTO;
	}
	public CarPaymentDTO getCarPaymentDTO() {
		return carPaymentDTO;
	}
	public void setCarPaymentDTO(CarPaymentDTO carPaymentDTO) {
		this.carPaymentDTO = carPaymentDTO;
	}
	


}
