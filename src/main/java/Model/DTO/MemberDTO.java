package Model.DTO;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class MemberDTO  implements Serializable{

	
	String memNum;
	String memId;
	String memPw;
	String memName;
	Timestamp memBirth;
	String memSex;
	String memNationality;
	String memLoc;
	String memEmail;
	String memAddr;
	String memTel;
	String memPreferTrip;
	Timestamp memDate;
	Integer memLev;
	
	

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
	public String getMemPw() {
		return memPw;
	}
	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public Timestamp getMemBirth() {
		return memBirth;
	}
	public void setMemBirth(Timestamp memBirth) {
		this.memBirth = memBirth;
	}
	public String getMemSex() {
		return memSex;
	}
	public void setMemSex(String memSex) {
		this.memSex = memSex;
	}
	public String getMemNationality() {
		return memNationality;
	}
	public void setMemNationality(String memNationality) {
		this.memNationality = memNationality;
	}
	public String getMemLoc() {
		return memLoc;
	}
	public void setMemLoc(String memLoc) {
		this.memLoc = memLoc;
	}
	public String getMemEmail() {
		return memEmail;
	}
	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
	public String getMemAddr() {
		return memAddr;
	}
	public void setMemAddr(String memAddr) {
		this.memAddr = memAddr;
	}
	public String getMemTel() {
		return memTel;
	}
	public void setMemTel(String memTel) {
		this.memTel = memTel;
	}
	public String getMemPreferTrip() {
		return memPreferTrip;
	}
	public void setMemPreferTrip(String memPreferTrip) {
		this.memPreferTrip = memPreferTrip;
	}
	public Timestamp getMemDate() {
		return memDate;
	}
	public void setMemDate(Timestamp memDate) {
		this.memDate = memDate;
	}
	
	public Integer getMemLev() {
		return memLev;
	}
	public void setMemLev(Integer memLev) {
		this.memLev = memLev;
	}
	
	

	
	
	
	
	
}
