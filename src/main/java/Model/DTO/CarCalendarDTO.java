package Model.DTO;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class CarCalendarDTO implements Serializable {
	                                                            
	  private Integer calendarNumber;           //   -- 일정 번호   
	  private Integer driveNum;                 //   -- 운전번호    
	  private Timestamp calendarDepartureDate;  //   -- 출발 날짜   
	  private String startTime;              //   -- 출발 시간   
	  private String calendarStartingpoint;     //   -- 출발지역    
	  private String calendarDestination;       //   -- 도착지역    
	  private String destinationTime;        //   -- 도착시간    
	  private String predictionTime;         //   -- 예상 소요시간 
	  private Integer predictionPrice;          //   -- 예상 금액   
	  private Timestamp calendarArrival;		//	 -- 도착날짜
	  private Timestamp calendarRegist; //일정 등록 시간
	  private Integer calendarRecruitment; // 모집인원
	  private Integer calendarParticipant; //참가인원
	  
	  
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
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
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
	public String getDestinationTime() {
		return destinationTime;
	}
	public void setDestinationTime(String destinationTime) {
		this.destinationTime = destinationTime;
	}
	public String getPredictionTime() {
		return predictionTime;
	}
	public void setPredictionTime(String predictionTime) {
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
	public Timestamp getCalendarRegist() {
		return calendarRegist;
	}
	public void setCalendarRegist(Timestamp calendarRegist) {
		this.calendarRegist = calendarRegist;
	}
	public Integer getCalendarRecruitment() {
		return calendarRecruitment;
	}
	public void setCalendarRecruitment(Integer calendarRecruitment) {
		this.calendarRecruitment = calendarRecruitment;
	}
	public Integer getCalendarParticipant() {
		return calendarParticipant;
	}
	public void setCalendarParticipant(Integer calendarParticipant) {
		this.calendarParticipant = calendarParticipant;
	}
	
	    
}
