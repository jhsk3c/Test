package Model.DTO;

import java.util.Date;

public class AduitDTO {
	Integer aduitNum;
	Integer participationNum;
	Integer contestNum;
	String memId;
	Integer auditOriginality; // 독창성
	Integer auditPracticality; // 실용성
	Float auditAvg;
	String auditPass;
	Date auditDate;

	public Integer getAduitNum() {
		return aduitNum;
	}

	public void setAduitNum(Integer aduitNum) {
		this.aduitNum = aduitNum;
	}

	public Integer getParticipationNum() {
		return participationNum;
	}

	public void setParticipationNum(Integer participationNum) {
		this.participationNum = participationNum;
	}

	public Integer getContestNum() {
		return contestNum;
	}

	public void setContestNum(Integer contestNum) {
		this.contestNum = contestNum;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public Integer getAuditOriginality() {
		return auditOriginality;
	}

	public void setAuditOriginality(Integer auditOriginality) {
		this.auditOriginality = auditOriginality;
	}

	public Integer getAuditPracticality() {
		return auditPracticality;
	}

	public void setAuditPracticality(Integer auditPracticality) {
		this.auditPracticality = auditPracticality;
	}

	public Float getAuditAvg() {
		return auditAvg;
	}

	public void setAuditAvg(Float auditAvg2) {
		this.auditAvg = auditAvg2;
	}

	public String getAuditPass() {
		return auditPass;
	}

	public void setAuditPass(String auditPass) {
		this.auditPass = auditPass;
	}

	public Date getAuditDate() {
		return auditDate;
	}

	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}

}
