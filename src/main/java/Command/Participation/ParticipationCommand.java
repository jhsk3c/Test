package Command.Participation;

import org.springframework.web.multipart.MultipartFile;

public class ParticipationCommand {
	String memName;
	String workName;
	String workOutline;
	String workContent;
	String workImage;

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getWorkName() {
		return workName;
	}

	public void setWorkName(String workName) {
		this.workName = workName;
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
