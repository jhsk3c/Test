package Command.CarPayment;

public class CarPaymentCommand {
	
	private String cardSelection; //카드선택
	private String cardNumber; //카드번호
	private String cardExpirationDate; //유효기간
	private String cvcNumber; //cvc번호
	private String carPrice; //상품가격
	private String paymentPrice; //결제금액
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
	public String getCardExpirationDate() {
		return cardExpirationDate;
	}
	public void setCardExpirationDate(String cardExpirationDate) {
		this.cardExpirationDate = cardExpirationDate;
	}
	public String getCvcNumber() {
		return cvcNumber;
	}
	public void setCvcNumber(String cvcNumber) {
		this.cvcNumber = cvcNumber;
	}
	public String getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(String carPrice) {
		this.carPrice = carPrice;
	}
	public String getPaymentPrice() {
		return paymentPrice;
	}
	public void setPaymentPrice(String paymentPrice) {
		this.paymentPrice = paymentPrice;
	}
	
	
	
	
}
