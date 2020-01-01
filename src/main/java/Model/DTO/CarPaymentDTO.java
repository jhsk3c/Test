package Model.DTO;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class CarPaymentDTO implements Serializable{
	
	private String paymentNumber; 
	private Integer calenderReservationNum;
	private Integer calendarNumber;
	private String cardSelection;
	private String cardNumber;
	private Timestamp cardExpirationDate;
	private String cvcNumber;
	private Integer carPrice;
	private Integer paymentPrice; 
	private Timestamp paymentDate;
	private String paymentCheck;
	public String getPaymentNumber() {
		return paymentNumber;
	}
	public void setPaymentNumber(String paymentNumber) {
		this.paymentNumber = paymentNumber;
	}
	public Integer getCalenderReservationNum() {
		return calenderReservationNum;
	}
	public void setCalenderReservationNum(Integer calenderReservationNum) {
		this.calenderReservationNum = calenderReservationNum;
	}
	public Integer getCalendarNumber() {
		return calendarNumber;
	}
	public void setCalendarNumber(Integer calendarNumber) {
		this.calendarNumber = calendarNumber;
	}
	public String getCardSelection() {
		return cardSelection;
	}
	public void setCardSelection(String cardSelection) {
		this.cardSelection = cardSelection;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Timestamp getCardExpirationDate() {
		return cardExpirationDate;
	}
	public void setCardExpirationDate(Timestamp cardExpirationDate) {
		this.cardExpirationDate = cardExpirationDate;
	}
	public String getCvcNumber() {
		return cvcNumber;
	}
	public void setCvcNumber(String cvcNumber) {
		this.cvcNumber = cvcNumber;
	}
	public Integer getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(Integer carPrice) {
		this.carPrice = carPrice;
	}
	public Integer getPaymentPrice() {
		return paymentPrice;
	}
	public void setPaymentPrice(Integer paymentPrice) {
		this.paymentPrice = paymentPrice;
	}
	public Timestamp getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Timestamp paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getPaymentCheck() {
		return paymentCheck;
	}
	public void setPaymentCheck(String paymentCheck) {
		this.paymentCheck = paymentCheck;
	}
	
	
	
	

}
