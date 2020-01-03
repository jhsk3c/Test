package Model.DTO;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class ShopDTO implements Serializable{
	
	Integer shopNum;
	Integer vspotNum;
	String memId;
	String shopCategory;
	String shopLoc;
	String shopLocation; 
	String shopLocationMap; 
	String shopName;
	String goodsContext;
	String goodsOriginal;
	String goodsStore; 
	String goodsIntro;
	String shopApproval;
	String shopClosed;
	Integer shopCount;
	String shopTime1;
	String shopTime2;
	Timestamp goodsDate;
	public Integer getShopNum() {
		return shopNum;
	}
	public void setShopNum(Integer shopNum) {
		this.shopNum = shopNum;
	}
	public Integer getVspotNum() {
		return vspotNum;
	}
	public void setVspotNum(Integer vspotNum) {
		this.vspotNum = vspotNum;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
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
	public String getShopLocation() {
		return shopLocation;
	}
	public void setShopLocation(String shopLocation) {
		this.shopLocation = shopLocation;
	}
	public String getShopLocationMap() {
		return shopLocationMap;
	}
	public void setShopLocationMap(String shopLocationMap) {
		this.shopLocationMap = shopLocationMap;
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
	public String getGoodsOriginal() {
		return goodsOriginal;
	}
	public void setGoodsOriginal(String goodsOriginal) {
		this.goodsOriginal = goodsOriginal;
	}
	public String getGoodsStore() {
		return goodsStore;
	}
	public void setGoodsStore(String goodsStore) {
		this.goodsStore = goodsStore;
	}
	public String getGoodsIntro() {
		return goodsIntro;
	}
	public void setGoodsIntro(String goodsIntro) {
		this.goodsIntro = goodsIntro;
	}
	public String getShopApproval() {
		return shopApproval;
	}
	public void setShopApproval(String shopApproval) {
		this.shopApproval = shopApproval;
	}
	public String getShopClosed() {
		return shopClosed;
	}
	public void setShopClosed(String shopClosed) {
		this.shopClosed = shopClosed;
	}
	public Integer getShopCount() {
		return shopCount;
	}
	public void setShopCount(Integer shopCount) {
		this.shopCount = shopCount;
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
	public Timestamp getGoodsDate() {
		return goodsDate;
	}
	public void setGoodsDate(Timestamp goodsDate) {
		this.goodsDate = goodsDate;
	}
	
	
	 
	
}
