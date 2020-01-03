package Model.DTO;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class ParticipationDTO implements Serializable {
	Integer participationNum; // 참가번호
	String memNum; // 회원번호
	Integer contestNum; // 공모전번호
	String memId; // 회원아이디
	String memName; // 참가자이름
	String workName; // 작품명
	String workOutline; // 작품개요
	String workContent; // 작품내용
	String workImage; // 작품이미지
	Date participationDate; // 참가신청 날짜
	String aduitStatus; // 평가 상태

	public String getAduitStatus() {
		return aduitStatus;
	}

	public void setAduitStatus(String aduitStatus) {
		this.aduitStatus = aduitStatus;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public Date getParticipationDate() {
		return participationDate;
	}

	public void setParticipationDate(Date participationDate) {
		this.participationDate = participationDate;
	}

	public String getWorkName() {
		return workName;
	}

	public void setWorkName(String workName) {
		this.workName = workName;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public Integer getParticipationNum() {
		return participationNum;
	}

	public void setParticipationNum(Integer participationNum) {
		this.participationNum = participationNum;
	}

	public String getMemNum() {
		return memNum;
	}

	public void setMemNum(String memNum) {
		this.memNum = memNum;
	}

	public Integer getContestNum() {
		return contestNum;
	}

	public void setContestNum(Integer contestNum) {
		this.contestNum = contestNum;
	}

	public String getWorkOutline() {
		return workOutline;
	}

	public void setWorkOutline(String workOutline) {
		this.workOutline = workOutline;
	}

	public String getWorkContent() {
		return workContent;
	}

	public void setWorkContent(String workContent) {
		this.workContent = workContent;
	}

	public String getWorkImage() {
		return workImage;
	}

	public void setWorkImage(String workImage) {
		this.workImage = workImage;
	}

}
