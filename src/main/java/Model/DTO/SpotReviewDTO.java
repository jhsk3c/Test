 package Model.DTO;

import java.io.Serializable;
import java.sql.Timestamp;


@SuppressWarnings("serial")
public class SpotReviewDTO implements Serializable {

	Integer spotReviewNum; // 후기번호
	Integer vspotNum; //휴양지 번호
	String  memNum; // 회원 번호
	String memId; // 회원 아이디
	String spotReviewTitle; //후기 제목
	String spotReviewContext; //후기 내용
	Integer spotReviewStar1; //별점 1
	Integer spotReviewStar2; //별점 2
	Integer spotReviewStar3; //별점 3
	Integer spotReviewStar4; //별점 4
	Integer spotReviewAvg; // 평군 평점
	Timestamp spotReviewDate; // 후기 작성 날짜
	
	public Integer getSpotReviewNum() {
		return spotReviewNum;
	}
	public void setSpotReviewNum(Integer spotReviewNum) {
		this.spotReviewNum = spotReviewNum;
	}
	public Integer getVspotNum() {
		return vspotNum;
	}
	public void setVspotNum(Integer vspotNum) {
		this.vspotNum = vspotNum;
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
	public String getSpotReviewTitle() {
		return spotReviewTitle;
	}
	public void setSpotReviewTitle(String spotReviewTitle) {
		this.spotReviewTitle = spotReviewTitle;
	}
	public String getSpotReviewContext() {
		return spotReviewContext;
	}
	public void setSpotReviewContext(String spotReviewContext) {
		this.spotReviewContext = spotReviewContext;
	}
	public Integer getSpotReviewStar1() {
		return spotReviewStar1;
	}
	public void setSpotReviewStar1(Integer spotReviewStar1) {
		this.spotReviewStar1 = spotReviewStar1;
	}
	public Integer getSpotReviewStar2() {
		return spotReviewStar2;
	}
	public void setSpotReviewStar2(Integer spotReviewStar2) {
		this.spotReviewStar2 = spotReviewStar2;
	}
	public Integer getSpotReviewStar3() {
		return spotReviewStar3;
	}
	public void setSpotReviewStar3(Integer spotReviewStar3) {
		this.spotReviewStar3 = spotReviewStar3;
	}
	public Integer getSpotReviewStar4() {
		return spotReviewStar4;
	}
	public void setSpotReviewStar4(Integer spotReviewStar4) {
		this.spotReviewStar4 = spotReviewStar4;
	}
	public Integer getSpotReviewAvg() {
		return spotReviewAvg;
	}
	public void setSpotReviewAvg(Integer spotReviewAvg) {
		this.spotReviewAvg = spotReviewAvg;
	}
	
	public Timestamp getSpotReviewDate() {
		return spotReviewDate;
	}
	public void setSpotReviewDate(Timestamp spotReviewDate) {
		this.spotReviewDate = spotReviewDate;
	}
	
	
	
}
