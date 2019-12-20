package CommandMember;

public class ComMemberCommand {
	
	String comId;
	String comPw;
	String comPwCon;
	String comRepName;
	String licenseNumber;
	String comName;
	String comAddr1;
	String comAddr2;
	String comAddr3;
	String contactPhoneNum;
	String contactEmail;
	
	
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


	public String getComPwCon() {
		return comPwCon;
	}


	public void setComPwCon(String comPwCon) {
		this.comPwCon = comPwCon;
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
	


	public String getComAddr1() {
		return comAddr1;
	}


	public void setComAddr1(String comAddr1) {
		this.comAddr1 = comAddr1;
	}


	public String getComAddr2() {
		return comAddr2;
	}


	public void setComAddr2(String comAddr2) {
		this.comAddr2 = comAddr2;
	}


	public String getComAddr3() {
		return comAddr3;
	}


	public void setComAddr3(String comAddr3) {
		this.comAddr3 = comAddr3;
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


	public boolean isPwEqualToPwCon() {
		if(comPw.equals(comPwCon)) return true;
		return false;
	}
	

}
