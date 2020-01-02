package Controller.Goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Goods.GoodsDeleteService;


@Controller
public class GoodsDeleteController {
	@Autowired
	GoodsDeleteService goodsDeleteService;
	
	@RequestMapping("goodsDelete")
	public String goodsModify(@RequestParam(value = "goodsNum") String goodsNum) {
		goodsDeleteService.goodsDelete(goodsNum);
		return "Goods/goodsDelete";
	}
}
