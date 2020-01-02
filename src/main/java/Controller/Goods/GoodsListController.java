package Controller.Goods;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Goods.GoodsDetailService;
import Service.Goods.GoodsListService;

@Controller
public class GoodsListController {
	@Autowired
	GoodsListService goodsListService;
	@Autowired
	GoodsDetailService goodsDetailService;
	@RequestMapping("goodsShop")
	public String list(Model model) {
		goodsListService.goodsList(model);
		return "Goods/goodsList";
	}
	
	@RequestMapping("goodsDetail")
	public String detail(@RequestParam(value = "gNum") String goodsNum, Model model, HttpSession session) {
		goodsDetailService.goodsDetail(goodsNum, model, session);
		return "Goods/goodsDetail";
	}
}
