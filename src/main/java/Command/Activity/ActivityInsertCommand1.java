package Command.Activity;

import org.springframework.web.multipart.MultipartFile;

public class ActivityInsertCommand1 {
	String activityName;
	//String actiStartDate;
	//String actiEndDate;
	//String recruitStartDate;
	//String recruitEndDate;
	String recruitPeople;
	String activityText;
	String limitAge;
	MultipartFile[] actiImage;
	
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getRecruitPeople() {
		return recruitPeople;
	}
	public void setRecruitPeople(String recruitPeople) {
		this.recruitPeople = recruitPeople;
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
	public MultipartFile[] getActiImage() {
		return actiImage;
	}
	public void setActiImage(MultipartFile[] actiImage) {
		this.actiImage = actiImage;
	}
	
	
	
	
	
}
