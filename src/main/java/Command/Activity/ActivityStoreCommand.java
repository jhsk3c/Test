package Command.Activity;

import org.springframework.web.multipart.MultipartFile;

public class ActivityStoreCommand {
	String storeNum;
	String storeName;
	String storeLoc1;
	String storeLoc2;
	String storeTel;
	String StoreMainProduct;
	String storeBusinessNum;
	String storeOwner;
	MultipartFile[] storePics;
	MultipartFile[] businessLicense;

	public MultipartFile[] getStorePics() {
		return storePics;
	}
	public void setStorePics(MultipartFile[] storePics) {
		this.storePics = storePics;
	}
	public MultipartFile[] getBusinessLicense() {
		return businessLicense;
	}
	public void setBusinessLicense(MultipartFile[] businessLicense) {
		this.businessLicense = businessLicense;
	}
	public String getStoreOwner() {
		return storeOwner;
	}
	public void setStoreOwner(String storeOwner) {
		this.storeOwner = storeOwner;
	}
	public String getStoreMainProduct() {
		return StoreMainProduct;
	}
	public void setStoreMainProduct(String storeMainProduct) {
		StoreMainProduct = storeMainProduct;
	}
	public String getStoreBusinessNum() {
		return storeBusinessNum;
	}
	public void setStoreBusinessNum(String storeBusinessNum) {
		this.storeBusinessNum = storeBusinessNum;
	}
	public String getStoreNum() {
		return storeNum;
	}
	public void setStoreNum(String storeNum) {
		this.storeNum = storeNum;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreLoc1() {
		return storeLoc1;
	}
	public void setStoreLoc1(String storeLoc1) {
		this.storeLoc1 = storeLoc1;
	}
	public String getStoreLoc2() {
		return storeLoc2;
	}
	public void setStoreLoc2(String storeLoc2) {
		this.storeLoc2 = storeLoc2;
	}
	public String getStoreTel() {
		return storeTel;
	}
	public void setStoreTel(String storeTel) {
		this.storeTel = storeTel;
	}

		
	
	
	
}
