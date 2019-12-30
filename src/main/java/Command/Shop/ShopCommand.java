package Command.Shop;


import org.springframework.web.multipart.MultipartFile;

public class ShopCommand {
	
	String shopCategory;
	String shopLoc;
	String shopLocation1; 
	String shopLocation2; 
	String shopLocation3; 
	String shopName;
	String 	goodsName;
	String goodsPrice;
	String goodsContext;
	String goodsIntro;
	MultipartFile[] goodsReport;
	
	public String getShopCategory() {
		return shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}
	public String getShopLoc() {
		return shopLoc;
	}
	public void setShopLoc(String shopLoc) {
		this.shopLoc = shopLoc;
	}
	public String getShopLocation1() {
		return shopLocation1;
	}
	public void setShopLocation1(String shopLocation1) {
		this.shopLocation1 = shopLocation1;
	}
	public String getShopLocation2() {
		return shopLocation2;
	}
	public void setShopLocation2(String shopLocation2) {
		this.shopLocation2 = shopLocation2;
	}
	public String getShopLocation3() {
		return shopLocation3;
	}
	public void setShopLocation3(String shopLocation3) {
		this.shopLocation3 = shopLocation3;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public String getGoodsContext() {
		return goodsContext;
	}
	public void setGoodsContext(String goodsContext) {
		this.goodsContext = goodsContext;
	}
	public String getGoodsIntro() {
		return goodsIntro;
	}
	public void setGoodsIntro(String goodsIntro) {
		this.goodsIntro = goodsIntro;
	}
	public MultipartFile[] getGoodsReport() {
		return goodsReport;
	}
	public void setGoodsReport(MultipartFile[] goodsReport) {
		this.goodsReport = goodsReport;
	}
	
	
	
	
	
	
}
