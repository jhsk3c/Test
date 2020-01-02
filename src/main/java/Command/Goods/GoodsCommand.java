package Command.Goods;

import org.springframework.web.multipart.MultipartFile;

public class GoodsCommand {
	String goodsNum;
	String memId;
	String goodsCategory;
	String goodsName;
	String goodsPrice;
	String goodsContent;
	String goodsQty;
	String goodsDiscountRate; // 할인율
	MultipartFile[] goodsImage;

	public MultipartFile[] getGoodsImage() {
		return goodsImage;
	}

	public void setGoodsImage(MultipartFile[] goodsImage) {
		this.goodsImage = goodsImage;
	}

	public String getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(String goodsNum) {
		this.goodsNum = goodsNum;
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

	public String getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getGoodsContent() {
		return goodsContent;
	}

	public void setGoodsContent(String goodsContent) {
		this.goodsContent = goodsContent;
	}

	public String getGoodsQty() {
		return goodsQty;
	}

	public void setGoodsQty(String goodsQty) {
		this.goodsQty = goodsQty;
	}

	public String getGoodsDiscountRate() {
		return goodsDiscountRate;
	}

	public void setGoodsDiscountRate(String goodsDiscountRate) {
		this.goodsDiscountRate = goodsDiscountRate;
	}
}
