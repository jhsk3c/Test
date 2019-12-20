package Command.Contest;

import org.springframework.web.multipart.MultipartFile;

public class ContestCommand {
	String contestOrganizer; // 담당자
	String contestName; // 공모전이름
	String contestSubject; // 공모전주제
	MultipartFile[] contestPoster; // 첨부파일 사진
	String contestContent; // 내용
	String contestCondition; // 참가조건
	String contestEntryWay; // 응모방법
	String contestPeoples; // 모집인원
	String contestStart; // 모집시작기간
	String contestEnd; // 모집종료기간
	String contestPrizeWay; // 시상방법
	String contestPrize; // 시상금

	public ContestCommand() {
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

	public MultipartFile[] getContestPoster() {
		return contestPoster;
	}

	public void setContestPoster(MultipartFile[] contestPoster) {
		this.contestPoster = contestPoster;
	}

	public String getContestStart() {
		return contestStart;
	}

	public void setContestStart(String contestStart) {
		this.contestStart = contestStart;
	}

	public String getContestEnd() {
		return contestEnd;
	}

	public void setContestEnd(String contestEnd) {
		this.contestEnd = contestEnd;
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

	public String getContestPeoples() {
		return contestPeoples;
	}

	public void setContestPeoples(String contestPeoples) {
		this.contestPeoples = contestPeoples;
	}

	public String getContestPrizeWay() {
		return contestPrizeWay;
	}

	public void setContestPrizeWay(String contestPrizeWay) {
		this.contestPrizeWay = contestPrizeWay;
	}

	public String getContestPrize() {
		return contestPrize;
	}

	public void setContestPrize(String contestPrize) {
		this.contestPrize = contestPrize;
	}

}
