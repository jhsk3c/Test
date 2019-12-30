package Model.DTO;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class ShopDTO implements Serializable{
	
	Integer shopNum;
	Integer vspotNum;
	String shopCategory;
	String shopLoc;
	String shopLocation; 
	String shopLocationMap; 
	String shopName;
	String 	goodsName;
	Integer goodsPrice;
	String goodsContext;
	String goodsOriginal;
	String goodsStore; 
	String goodsIntro;
	String shopApproval;
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
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Integer getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(Integer goodsPrice) {
		this.goodsPrice = goodsPrice;
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
	public Timestamp getGoodsDate() {
		return goodsDate;
	}
	public void setGoodsDate(Timestamp goodsDate) {
		this.goodsDate = goodsDate;
	}
	
	 
	
}
