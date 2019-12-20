package Model.DTO;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class VspotDTO implements Serializable{
	
	Integer vspotNum;
	String memNum;
	String memId;
	String vspotTitle;
	String vspotName;
	String vspotOriginal;
	String vspotStore;
	String vspotLocation;
	String vspotLocationMap;
	String vspotLoc;
	String vspotIntroduce;
	String vspotFeature;
	String vspotApproval;
	Timestamp approvalDate;
	Timestamp vspotDate;
	
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
	public String getVspotTitle() {
		return vspotTitle;
	}
	public void setVspotTitle(String vspotTitle) {
		this.vspotTitle = vspotTitle;
	}
	public String getVspotName() {
		return vspotName;
	}
	public void setVspotName(String vspotName) {
		this.vspotName = vspotName;
	}
	public String getVspotOriginal() {
		return vspotOriginal;
	}
	public void setVspotOriginal(String vspotOriginal) {
		this.vspotOriginal = vspotOriginal;
	}
	public String getVspotStore() {
		return vspotStore;
	}
	public void setVspotStore(String vspotStore) {
		this.vspotStore = vspotStore;
	}
	public String getVspotLocation() {
		return vspotLocation;
	}
	public void setVspotLocation(String vspotLocation) {
		this.vspotLocation = vspotLocation;
	}
	public String getVspotLocationMap() {
		return vspotLocationMap;
	}
	public void setVspotLocationMap(String vspotLocationMap) {
		this.vspotLocationMap = vspotLocationMap;
	}
	public String getVspotLoc() {
		return vspotLoc;
	}
	public void setVspotLoc(String vspotLoc) {
		this.vspotLoc = vspotLoc;
	}
	public String getVspotIntroduce() {
		return vspotIntroduce;
	}
	public void setVspotIntroduce(String vspotIntroduce) {
		this.vspotIntroduce = vspotIntroduce;
	}
	public String getVspotFeature() {
		return vspotFeature;
	}
	public void setVspotFeature(String vspotFeature) {
		this.vspotFeature = vspotFeature;
	}
	public String getVspotApproval() {
		return vspotApproval;
	}
	public void setVspotApproval(String vspotApproval) {
		this.vspotApproval = vspotApproval;
	}
	public Timestamp getApprovalDate() {
		return approvalDate;
	}
	public void setApprovalDate(Timestamp approvalDate) {
		this.approvalDate = approvalDate;
	}
	public Timestamp getVspotDate() {
		return vspotDate;
	}
	public void setVspotDate(Timestamp vspotDate) {
		this.vspotDate = vspotDate;
	}
	
	/*
	 * 휴양지 정보
	휴양지등록번호(PK)	vspot_num(PK)	번호 	NUMBER	NOT NULL
	회원번호(FK)	mem_num(FK)	회원번호	VARCHAR(10)	NULL
	휴양지 이름	vspot_name	이름	VARCHAR(50)	NOT NULL
	휴양지 사진	vspot_image	사진	VARCHAR2(1000)	NOT NULL
	휴양지 위치	vspot_location	주소	VARCHAR(255)	NOT NULL
	휴양지 소개	vspot_introduce	소개	VARCHAR2(2000)	NOT NULL
	휴양 특장점	vspot_feature	특장점	VARCHAR2(100)	NULL
	String vspotApproval; 승인여부
	Timestamp approvalDate; 승인날짜
	휴양지 등록날짜	vspot_date	날짜	TIMESTAMP	NULL

	 * 
	 * 
	 */
	
}
