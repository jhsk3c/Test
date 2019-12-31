package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DriveInfoDTO implements Serializable{
	private Long driveInfoNum;
	private Long driveNum;
	private String driveLicense;
	private String driveLicenseStore;
	private String driveLicenseSize;
	private String driveInsurance;
	private String driveInsuranceStore;
	private String driveInsuranceSize;
	private String driveCarcheck;
	private String driveCarcheckStore;
	private String driveCarcheckSize;
	
	
	public Long getDriveInfoNum() {
		return driveInfoNum;
	}
	public void setDriveInfoNum(Long driveInfoNum) {
		this.driveInfoNum = driveInfoNum;
	}
	public Long getDriveNum() {
		return driveNum;
	}
	public void setDriveNum(Long driveNum) {
		this.driveNum = driveNum;
	}
	public String getDriveLicense() {
		return driveLicense;
	}
	public void setDriveLicense(String driveLicense) {
		this.driveLicense = driveLicense;
	}
	public String getDriveLicenseStore() {
		return driveLicenseStore;
	}
	public void setDriveLicenseStore(String driveLicenseStore) {
		this.driveLicenseStore = driveLicenseStore;
	}
	public String getDriveLicenseSize() {
		return driveLicenseSize;
	}
	public void setDriveLicenseSize(String driveLicenseSize) {
		this.driveLicenseSize = driveLicenseSize;
	}
	public String getDriveInsurance() {
		return driveInsurance;
	}
	public void setDriveInsurance(String driveInsurance) {
		this.driveInsurance = driveInsurance;
	}
	public String getDriveInsuranceStore() {
		return driveInsuranceStore;
	}
	public void setDriveInsuranceStore(String driveInsuranceStore) {
		this.driveInsuranceStore = driveInsuranceStore;
	}
	public String getDriveInsuranceSize() {
		return driveInsuranceSize;
	}
	public void setDriveInsuranceSize(String driveInsuranceSize) {
		this.driveInsuranceSize = driveInsuranceSize;
	}
	public String getDriveCarcheck() {
		return driveCarcheck;
	}
	public void setDriveCarcheck(String driveCarcheck) {
		this.driveCarcheck = driveCarcheck;
	}
	public String getDriveCarcheckStore() {
		return driveCarcheckStore;
	}
	public void setDriveCarcheckStore(String driveCarcheckStore) {
		this.driveCarcheckStore = driveCarcheckStore;
	}
	public String getDriveCarcheckSize() {
		return driveCarcheckSize;
	}
	public void setDriveCarcheckSize(String driveCarcheckSize) {
		this.driveCarcheckSize = driveCarcheckSize;
	}
	
	
	
}
