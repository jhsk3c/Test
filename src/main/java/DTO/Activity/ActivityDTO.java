package DTO.Activity;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class ActivityDTO implements Serializable{
	String activityNum;
	String productNum;
	String storeNum;
	String memNum;
	String activityName;
	Timestamp activityStartDate;
	Timestamp activityEndDate;
	Timestamp recruitStartDate;
	Timestamp recruitEndDate;
	Integer recruitPeople;
	Integer activityCurrentPeople;
	String activityProduct;
	String actiState;
	String activityText;
	String limitAge;
	Integer activityCost;
	String originalFilename; 
	String storeFilename;
	String activityLev;
	public String getActivityNum() {
		return activityNum;
	}
	public void setActivityNum(String activityNum) {
		this.activityNum = activityNum;
	}
	public String getProductNum() {
		return productNum;
	}
	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
	public String getStoreNum() {
		return storeNum;
	}
	public void setStoreNum(String storeNum) {
		this.storeNum = storeNum;
	}
	public String getMemNum() {
		return memNum;
	}
	public void setMemNum(String memNum) {
		this.memNum = memNum;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public Timestamp getActivityStartDate() {
		return activityStartDate;
	}
	public void setActivityStartDate(Timestamp activityStartDate) {
		this.activityStartDate = activityStartDate;
	}
	public Timestamp getActivityEndDate() {
		return activityEndDate;
	}
	public void setActivityEndDate(Timestamp activityEndDate) {
		this.activityEndDate = activityEndDate;
	}
	public Timestamp getRecruitStartDate() {
		return recruitStartDate;
	}
	public void setRecruitStartDate(Timestamp recruitStartDate) {
		this.recruitStartDate = recruitStartDate;
	}
	public Timestamp getRecruitEndDate() {
		return recruitEndDate;
	}
	public void setRecruitEndDate(Timestamp recruitEndDate) {
		this.recruitEndDate = recruitEndDate;
	}
	public Integer getRecruitPeople() {
		return recruitPeople;
	}
	public void setRecruitPeople(Integer recruitPeople) {
		this.recruitPeople = recruitPeople;
	}
	public Integer getActivityCurrentPeople() {
		return activityCurrentPeople;
	}
	public void setActivityCurrentPeople(Integer activityCurrentPeople) {
		this.activityCurrentPeople = activityCurrentPeople;
	}
	public String getActivityProduct() {
		return activityProduct;
	}
	public void setActivityProduct(String activityProduct) {
		this.activityProduct = activityProduct;
	}
	public String getActiState() {
		return actiState;
	}
	public void setActiState(String actiState) {
		this.actiState = actiState;
	}
	public String getActivityText() {
		return activityText;
	}
	public void setActivityText(String activityText) {
		this.activityText = activityText;
	}
	public String getLimitAge() {
		return limitAge;
	}
	public void setLimitAge(String limitAge) {
		this.limitAge = limitAge;
	}
	public Integer getActivityCost() {
		return activityCost;
	}
	public void setActivityCost(Integer activityCost) {
		this.activityCost = activityCost;
	}
	public String getOriginalFilename() {
		return originalFilename;
	}
	public void setOriginalFilename(String originalFilename) {
		this.originalFilename = originalFilename;
	}
	public String getStoreFilename() {
		return storeFilename;
	}
	public void setStoreFilename(String storeFilename) {
		this.storeFilename = storeFilename;
	}
	public String getActivityLev() {
		return activityLev;
	}
	public void setActivityLev(String activityLev) {
		this.activityLev = activityLev;
	}
	
	
	
	
	
	
}
