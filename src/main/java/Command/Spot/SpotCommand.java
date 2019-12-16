package Command.Spot;

import org.springframework.web.multipart.MultipartFile;

public class SpotCommand {
	
	
	String vspotName;
	String vspotLocation1;
	String vspotLocation2;
	String vspotLocation3;
	String vspotIntroduce;
	String vspotFeature;
	MultipartFile[] vspotReport;
	
	public String getVspotName() {
		return vspotName;
	}
	public void setVspotName(String vspotName) {
		this.vspotName = vspotName;
	}
	public String getVspotLocation1() {
		return vspotLocation1;
	}
	public void setVspotLocation1(String vspotLocation1) {
		this.vspotLocation1 = vspotLocation1;
	}
	public String getVspotLocation2() {
		return vspotLocation2;
	}
	public void setVspotLocation2(String vspotLocation2) {
		this.vspotLocation2 = vspotLocation2;
	}
	public String getVspotLocation3() {
		return vspotLocation3;
	}
	public void setVspotLocation3(String vspotLocation3) {
		this.vspotLocation3 = vspotLocation3;
	}
	public String getVspotIntroduce() {
		return vspotIntroduce;
	}
	public void setVspotIntroduce(String vspotIntroduce) {
		this.vspotIntroduce = vspotIntroduce;
	}
	public String getVspotFeature() {
		return vspotFeature;
	}
	public void setVspotFeature(String vspotFeature) {
		this.vspotFeature = vspotFeature;
	}
	public MultipartFile[] getVspotReport() {
		return vspotReport;
	}
	public void setVspotReport(MultipartFile[] vspotReport) {
		this.vspotReport = vspotReport;
	}
	


}
