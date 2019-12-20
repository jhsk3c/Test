package Model.DTO;

import java.sql.Timestamp;

public class CarCalendarDTO {
	                                                            
	  private Integer calendarNumber;           //   -- 일정 번호   
	  private Integer driveNum;                 //   -- 운전번호    
	  private Timestamp calendarDepartureDate;  //   -- 출발 날짜   
	  private Timestamp startTime;              //   -- 출발 시간   
	  private String calendarStartingpoint;     //   -- 출발지역    
	  private String calendarDestination;       //   -- 도착지역    
	  private Timestamp destinationTime;        //   -- 도착시간    
	  private Timestamp predictionTime;         //   -- 예상 소요시간 
	  private Integer predictionPrice;          //   -- 예상 금액   
	  private Timestamp calendarArrival;		//	 -- 도착날짜
	  
	public Integer getCalendarNumber() {
		return calendarNumber;
	}
	public void setCalendarNumber(Integer calendarNumber) {
		this.calendarNumber = calendarNumber;
	}
	public Integer getDriveNum() {
		return driveNum;
	}
	public void setDriveNum(Integer driveNum) {
		this.driveNum = driveNum;
	}
	public Timestamp getCalendarDepartureDate() {
		return calendarDepartureDate;
	}
	public void setCalendarDepartureDate(Timestamp calendarDepartureDate) {
		this.calendarDepartureDate = calendarDepartureDate;
	}
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	public String getCalendarStartingpoint() {
		return calendarStartingpoint;
	}
	public void setCalendarStartingpoint(String calendarStartingpoint) {
		this.calendarStartingpoint = calendarStartingpoint;
	}
	public String getCalendarDestination() {
		return calendarDestination;
	}
	public void setCalendarDestination(String calendarDestination) {
		this.calendarDestination = calendarDestination;
	}
	public Timestamp getDestinationTime() {
		return destinationTime;
	}
	public void setDestinationTime(Timestamp destinationTime) {
		this.destinationTime = destinationTime;
	}
	public Timestamp getPredictionTime() {
		return predictionTime;
	}
	public void setPredictionTime(Timestamp predictionTime) {
		this.predictionTime = predictionTime;
	}
	public Integer getPredictionPrice() {
		return predictionPrice;
	}
	public void setPredictionPrice(Integer predictionPrice) {
		this.predictionPrice = predictionPrice;
	}
	public Timestamp getCalendarArrival() {
		return calendarArrival;
	}
	public void setCalendarArrival(Timestamp calendarArrival) {
		this.calendarArrival = calendarArrival;
	}

	
	  
	  
	  
	  
      
}
