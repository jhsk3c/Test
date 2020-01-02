package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CartDTO implements Serializable {
	Integer cartNum;
	Integer goodsNum;
	Integer aduitNum;
	Integer participationNum;
	String memId;
	Integer qty;

	public Integer getAduitNum() {
		return aduitNum;
	}

	public void setAduitNum(Integer aduitNum) {
		this.aduitNum = aduitNum;
	}

	public Integer getCartNum() {
		return cartNum;
	}

	public void setCartNum(Integer cartNum) {
		this.cartNum = cartNum;
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

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

}
