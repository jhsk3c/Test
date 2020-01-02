package Controller.Goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Goods.GoodsCommand;
import Service.Goods.GoodsModifyService;

@Controller
public class GoodsModifyController {
	@Autowired
	GoodsModifyService goodsModifyService;

	@RequestMapping("goodsModify")
	public String goodsModify(@RequestParam(value = "goodsNum") String goodsNum, GoodsCommand goodsCommand, Model model) {
		model.addAttribute("goodsNum", goodsNum);
		return "Goods/goodsModify";
	}
	
	@RequestMapping("goodsModifyPro")
	public String goodsModifyPro(@RequestParam(value = "goodsNum") String goodsNum, GoodsCommand goodsCommand, Model model) {
		goodsModifyService.goodsModify(goodsCommand, goodsNum, model);
		return "Goods/goodsDetail";
	}
}
