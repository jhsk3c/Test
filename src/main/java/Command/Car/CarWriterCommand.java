package Command.Car;

import org.springframework.web.multipart.MultipartFile;

public class CarWriterCommand {
	private String carMemName;//세션이름 비교값.
	private String memNum; // 회원번호
	private String driveName;	//운전자이름
	private String driveAge;	//운전자 나이 
	private String driveLicenseInfo;	//운전면허 종류
	private MultipartFile [] driveLicense;	//운전면허증
	private MultipartFile [] driveInsurance;	//보험 증명서
	private MultipartFile [] driveCarCheck;	// 자차확인서
	private String carName;	// 차량이름 
	private String carNum;	//차량 번호
	private MultipartFile [] carImage;	//차량 사진
	private String carSize;	//차량 크기
	private String carKinds;	//차량 종류
	private String carContent;	//차량등록 소개
	
	
	
	

	
	
	public String getCarMemName() {
		return carMemName;
	}
	public void setCarMemName(String carMemName) {
		this.carMemName = carMemName;
	}
	
	public String getMemNum() {
		return memNum;
	}
	public void setMemNum(String memNum) {
		this.memNum = memNum;
	}
	public String getDriveName() {
		return driveName;
	}
	public void setDriveName(String driveName) {
		this.driveName = driveName;
	}
	public String getDriveAge() {
		return driveAge;
	}
	public void setDriveAge(String driveAge) {
		this.driveAge = driveAge;
	}
	public String getDriveLicenseInfo() {
		return driveLicenseInfo;
	}
	public void setDriveLicenseInfo(String driveLicenseInfo) {
		this.driveLicenseInfo = driveLicenseInfo;
	}
	public MultipartFile[] getDriveLicense() {
		return driveLicense;
	}
	public void setDriveLicense(MultipartFile[] driveLicense) {
		this.driveLicense = driveLicense;
	}
	public MultipartFile[] getDriveInsurance() {
		return driveInsurance;
	}
	public void setDriveInsurance(MultipartFile[] driveInsurance) {
		this.driveInsurance = driveInsurance;
	}
	public MultipartFile[] getDriveCarCheck() {
		return driveCarCheck;
	}
	public void setDriveCarCheck(MultipartFile[] driveCarCheck) {
		this.driveCarCheck = driveCarCheck;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarNum() {
		return carNum;
	}
	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
	public MultipartFile[] getCarImage() {
		return carImage;
	}
	public void setCarImage(MultipartFile[] carImage) {
		this.carImage = carImage;
	}
	public String getCarSize() {
		return carSize;
	}
	public void setCarSize(String carSize) {
		this.carSize = carSize;
	}
	public String getCarKinds() {
		return carKinds;
	}
	public void setCarKinds(String carKinds) {
		this.carKinds = carKinds;
	}
	public String getCarContent() {
		return carContent;
	}
	public void setCarContent(String carContent) {
		this.carContent = carContent;
	}
	
	
	
	
}
