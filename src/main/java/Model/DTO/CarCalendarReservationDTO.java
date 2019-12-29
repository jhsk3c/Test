package Model.DTO;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class CarCalendarReservationDTO implements Serializable {
	private Long calenderReservationNum;
	private Integer calendarNumber;
	private String carName;
	private Timestamp carStartDate;
	private Timestamp carEndDate;
	private String carStartTime;
	private String carEndTime;
	
	public Long getCalenderReservationNum() {
		return calenderReservationNum;
	}
	public void setCalenderReservationNum(Long calenderReservationNum) {
		this.calenderReservationNum = calenderReservationNum;
	}
	public Integer getCalendarNumber() {
		return calendarNumber;
	}
	public void setCalendarNumber(Integer calendarNumber) {
		this.calendarNumber = calendarNumber;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Timestamp getCarStartDate() {
		return carStartDate;
	}
	public void setCarStartDate(Timestamp carStartDate) {
		this.carStartDate = carStartDate;
	}
	public Timestamp getCarEndDate() {
		return carEndDate;
	}
	public void setCarEndDate(Timestamp carEndDate) {
		this.carEndDate = carEndDate;
	}
	public String getCarStartTime() {
		return carStartTime;
	}
	public void setCarStartTime(String carStartTime) {
		this.carStartTime = carStartTime;
	}
	public String getCarEndTime() {
		return carEndTime;
	}
	public void setCarEndTime(String carEndTime) {
		this.carEndTime = carEndTime;
	}
	
	

	
	
}
