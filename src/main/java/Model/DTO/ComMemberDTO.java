package Model.DTO;

import java.sql.Timestamp;

public class ComMemberDTO {

	String comNum;
	String comId;
	String comPw;
	String comRepName;
	String licenseNumber;
    String comName;
    String comAddr;
    String contactPhoneNum;
    String contactEmail;
    String comApproval; // ?? 승인 여부
    Timestamp approvalDate; //?? 승인 날짜
    Timestamp comDate;
	public String getComNum() {
		return comNum;
	}
	public void setComNum(String comNum) {
		this.comNum = comNum;
	}
	public String getComId() {
		return comId;
	}
	public void setComId(String comId) {
		this.comId = comId;
	}
	public String getComPw() {
		return comPw;
	}
	public void setComPw(String comPw) {
		this.comPw = comPw;
	}
	public String getComRepName() {
		return comRepName;
	}
	public void setComRepName(String comRepName) {
		this.comRepName = comRepName;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public String getComAddr() {
		return comAddr;
	}
	public void setComAddr(String comAddr) {
		this.comAddr = comAddr;
	}
	public String getContactPhoneNum() {
		return contactPhoneNum;
	}
	public void setContactPhoneNum(String contactPhoneNum) {
		this.contactPhoneNum = contactPhoneNum;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getComApproval() {
		return comApproval;
	}
	public void setComApproval(String comApproval) {
		this.comApproval = comApproval;
	}
	public Timestamp getApprovalDate() {
		return approvalDate;
	}
	public void setApprovalDate(Timestamp approvalDate) {
		this.approvalDate = approvalDate;
	}
	public Timestamp getComDate() {
		return comDate;
	}
	public void setComDate(Timestamp comDate) {
		this.comDate = comDate;
	} 
    
    
	
}
