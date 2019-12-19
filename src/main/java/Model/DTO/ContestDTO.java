package Model.DTO;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@SuppressWarnings("serial")
public class ContestDTO implements Serializable {
	String contestNum; // 공모전번호
	String userId; // admin id
	String contestOrganizer; // 담당자
	String contestName; // 공모전이름
	String contestSubject; // 공모전주제
	String contestPoster; // 오리지널 파일명
	String contestStorePoster; // Store 파일명
	String contestContent; // 내용
	String contestCondition; // 참가조건
	String contestEntryWay; // 응모방법
	Integer contestPeoples; // 모집인원
	Date contestStart; // 모집시작기간
	Date contestEnd; // 모집종료기간
	String contestPrizeWay; // 시상방법
	Integer contestPrize; // 시상금

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getContestStorePoster() {
		return contestStorePoster;
	}

	public void setContestStorePoster(String contestStorePoster) {
		this.contestStorePoster = contestStorePoster;
	}

	public String getContestNum() {
		return contestNum;
	}

	public void setContestNum(String contestNum) {
		this.contestNum = contestNum;
	}

	public String getContestOrganizer() {
		return contestOrganizer;
	}

	public void setContestOrganizer(String contestOrganizer) {
		this.contestOrganizer = contestOrganizer;
	}

	public String getContestName() {
		return contestName;
	}

	public void setContestName(String contestName) {
		this.contestName = contestName;
	}

	public String getContestSubject() {
		return contestSubject;
	}

	public void setContestSubject(String contestSubject) {
		this.contestSubject = contestSubject;
	}

	public String getContestPoster() {
		return contestPoster;
	}

	public void setContestPoster(String contestPoster) {
		this.contestPoster = contestPoster;
	}

	public String getContestContent() {
		return contestContent;
	}

	public void setContestContent(String contestContent) {
		this.contestContent = contestContent;
	}

	public String getContestCondition() {
		return contestCondition;
	}

	public void setContestCondition(String contestCondition) {
		this.contestCondition = contestCondition;
	}

	public String getContestEntryWay() {
		return contestEntryWay;
	}

	public void setContestEntryWay(String contestEntryWay) {
		this.contestEntryWay = contestEntryWay;
	}

	public Integer getContestPeoples() {
		return contestPeoples;
	}

	public void setContestPeoples(Integer contestPeoples) {
		this.contestPeoples = contestPeoples;
	}

	public Date getContestStart() {
		return contestStart;
	}

	public void setContestEnd(Date contestEnd) {
		this.contestEnd = contestEnd;
	}

	public void setContestStart(Date contestStart) {
		this.contestStart = contestStart;
	}

	public Date getContestEnd() {
		return contestEnd;
	}

	public void setContestEnd(Timestamp contestEnd) {
		this.contestEnd = contestEnd;
	}

	public String getContestPrizeWay() {
		return contestPrizeWay;
	}

	public void setContestPrizeWay(String contestPrizeWay) {
		this.contestPrizeWay = contestPrizeWay;
	}

	public Integer getContestPrize() {
		return contestPrize;
	}

	public void setContestPrize(Integer contestPrize) {
		this.contestPrize = contestPrize;
	}

}
