package Command.Shop;


import org.springframework.web.multipart.MultipartFile;
// shopClosed
public class ShopCommand {
	
	String shopCategory;
	String shopLoc;
	String shopLocation1; 
	String shopLocation2; 
	String shopLocation3;
	String shopClosed;
	String shopTime1;
	String shopTime2;
	String shopName;
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
	public String getShopClosed() {
		return shopClosed;
	}
	public void setShopClosed(String shopClosed) {
		this.shopClosed = shopClosed;
	}
	public String getShopTime1() {
		return shopTime1;
	}
	public void setShopTime1(String shopTime1) {
		this.shopTime1 = shopTime1;
	}
	public String getShopTime2() {
		return shopTime2;
	}
	public void setShopTime2(String shopTime2) {
		this.shopTime2 = shopTime2;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
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
