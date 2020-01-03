package Model.DTO;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class GoodsDTO implements Serializable {
	Integer goodsNum;
	Integer participationNum;
	Integer auditNum;
	String memId;
	String goodsCategory;
	String goodsName;
	Integer goodsPrice;
	String goodsImage;
	String goodsContent;
	Integer goodsQty;
	Integer goodsDiscountRate; // 할인율
	Date goodsDate;

	public Date getGoodsDate() {
		return goodsDate;
	}

	public void setGoodsDate(Date goodsDate) {
		this.goodsDate = goodsDate;
	}

	public Integer getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

	public Integer getParticipationNum() {
		return participationNum;
	}

	public void setParticipationNum(Integer participationNum) {
		this.participationNum = participationNum;
	}

	public Integer getAuditNum() {
		return auditNum;
	}

	public void setAuditNum(Integer auditNum) {
		this.auditNum = auditNum;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getGoodsCategory() {
		return goodsCategory;
	}

	public void setGoodsCategory(String goodsCategory) {
		this.goodsCategory = goodsCategory;
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

	public String getGoodsImage() {
		return goodsImage;
	}

	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}

	public String getGoodsContent() {
		return goodsContent;
	}

	public void setGoodsContent(String goodsContent) {
		this.goodsContent = goodsContent;
	}

	public Integer getGoodsQty() {
		return goodsQty;
	}

	public void setGoodsQty(Integer goodsQty) {
		this.goodsQty = goodsQty;
	}

	public Integer getGoodsDiscountRate() {
		return goodsDiscountRate;
	}

	public void setGoodsDiscountRate(Integer goodsDiscountRate) {
		this.goodsDiscountRate = goodsDiscountRate;
	}

}
