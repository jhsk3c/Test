package Model.DTO;

import java.util.Date;

public class AduitDTO {
	Integer aduitNum;
	Integer participationNum;
	Integer contestNum;
	String memId;
	Integer auditScore;
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

	public Integer getAuditScore() {
		return auditScore;
	}

	public void setAuditScore(Integer auditScore) {
		this.auditScore = auditScore;
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
