package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CarCalendarJoinDTO implements Serializable {

	private MemberDTO memberDTO;
	private CarDTO carDTO;
	private CarCalendarDTO carCalendarDTO;
	private CarPaymentDTO carPaymentDTO;
	
	
	public MemberDTO getMemberDTO() {
		return memberDTO;
	}
	public void setMemberDTO(MemberDTO memberDTO) {
		this.memberDTO = memberDTO;
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
	public CarPaymentDTO getCarPaymentDTO() {
		return carPaymentDTO;
	}
	public void setCarPaymentDTO(CarPaymentDTO carPaymentDTO) {
		this.carPaymentDTO = carPaymentDTO;
	}
	
	
	
}
