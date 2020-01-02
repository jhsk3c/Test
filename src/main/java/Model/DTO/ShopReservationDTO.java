package Model.DTO;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class ShopReservationDTO implements Serializable {
	
	 Integer shopReservationNum;
	 Integer shopNum;
	 Integer vspotNum;
	 String memNum;
	 Integer peopleNum;
	 Timestamp useDate;
	 String useTime;
	 String shopLev;
	
	public Integer getShopReservationNum() {
		return shopReservationNum;
	}
	public void setShopReservationNum(Integer shopReservationNum) {
		this.shopReservationNum = shopReservationNum;
	}
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
	public String getMemNum() {
		return memNum;
	}
	public void setMemNum(String memNum) {
		this.memNum = memNum;
	}
	public Integer getPeopleNum() {
		return peopleNum;
	}
	public void setPeopleNum(Integer peopleNum) {
		this.peopleNum = peopleNum;
	}
	public Timestamp getUseDate() {
		return useDate;
	}
	public void setUseDate(Timestamp useDate) {
		this.useDate = useDate;
	}
	public String getUseTime() {
		return useTime;
	}
	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}
	public String getShopLev() {
		return shopLev;
	}
	public void setShopLev(String shopLev) {
		this.shopLev = shopLev;
	}
}
