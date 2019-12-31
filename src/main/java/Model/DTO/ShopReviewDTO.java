package Model.DTO;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class ShopReviewDTO implements Serializable{
	
	
	Integer shopReviewNum; // 후기번호
	Integer shopNum; //상점 번호
	String  memNum; // 회원 번호
	String memId; // 회원 아이디
	String shopReviewTitle; //후기 제목
	String shopReviewContext; //후기 내용
	Integer shopReviewStar1; //별점 1
	Integer shopReviewStar2; //별점 2
	Integer shopReviewStar3; //별점 3
	Integer shopReviewStar4; //별점 4
	Integer shopReviewAvg; // 평군 평점
	Timestamp shopReviewDate; // 후기 작성 날짜
	
	public Integer getShopReviewNum() {
		return shopReviewNum;
	}
	public void setShopReviewNum(Integer shopReviewNum) {
		this.shopReviewNum = shopReviewNum;
	}
	public Integer getShopNum() {
		return shopNum;
	}
	public void setShopNum(Integer shopNum) {
		this.shopNum = shopNum;
	}
	public String getMemNum() {
		return memNum;
	}
	public void setMemNum(String memNum) {
		this.memNum = memNum;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getShopReviewTitle() {
		return shopReviewTitle;
	}
	public void setShopReviewTitle(String shopReviewTitle) {
		this.shopReviewTitle = shopReviewTitle;
	}
	public String getShopReviewContext() {
		return shopReviewContext;
	}
	public void setShopReviewContext(String shopReviewContext) {
		this.shopReviewContext = shopReviewContext;
	}
	public Integer getShopReviewStar1() {
		return shopReviewStar1;
	}
	public void setShopReviewStar1(Integer shopReviewStar1) {
		this.shopReviewStar1 = shopReviewStar1;
	}
	public Integer getShopReviewStar2() {
		return shopReviewStar2;
	}
	public void setShopReviewStar2(Integer shopReviewStar2) {
		this.shopReviewStar2 = shopReviewStar2;
	}
	public Integer getShopReviewStar3() {
		return shopReviewStar3;
	}
	public void setShopReviewStar3(Integer shopReviewStar3) {
		this.shopReviewStar3 = shopReviewStar3;
	}
	public Integer getShopReviewStar4() {
		return shopReviewStar4;
	}
	public void setShopReviewStar4(Integer shopReviewStar4) {
		this.shopReviewStar4 = shopReviewStar4;
	}
	public Integer getShopReviewAvg() {
		return shopReviewAvg;
	}
	public void setShopReviewAvg(Integer shopReviewAvg) {
		this.shopReviewAvg = shopReviewAvg;
	}
	public Timestamp getShopReviewDate() {
		return shopReviewDate;
	}
	public void setShopReviewDate(Timestamp shopReviewDate) {
		this.shopReviewDate = shopReviewDate;
	}
	
	

}
