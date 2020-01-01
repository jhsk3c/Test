package Command.Activity;

import org.springframework.web.multipart.MultipartFile;

public class ActivityProductCommand {
	String productNum;
	String storeNum;
	String productOption;
	String productName;
	String productPrice;
	String productContent;
	MultipartFile[] productIamge;
	
	
	public String getProductNum() {
		return productNum;
	}
	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
	public String getStoreNum() {
		return storeNum;
	}
	public void setStoreNum(String storeNum) {
		this.storeNum = storeNum;
	}
	public String getProductOption() {
		return productOption;
	}
	public void setProductOption(String productOption) {
		this.productOption = productOption;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductContent() {
		return productContent;
	}
	public void setProductContent(String productContent) {
		this.productContent = productContent;
	}
	public MultipartFile[] getProductIamge() {
		return productIamge;
	}
	public void setProductIamge(MultipartFile[] productIamge) {
		this.productIamge = productIamge;
	}
	
	
}
