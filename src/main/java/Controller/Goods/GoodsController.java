package Controller.Goods;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Goods.GoodsCommand;
import Service.Goods.FindAuditNumService;
import Service.Goods.GoodsInsertService;

@Controller
public class GoodsController {
	@Autowired
	GoodsInsertService goodsInsertService;
	@Autowired
	FindAuditNumService findAuditNumService;

	@RequestMapping("goodsInsert")
	public String goodsInsert(@RequestParam(value = "memId") String memId, GoodsCommand goodsCommand, Model model) {
		model.addAttribute("memId", memId);
		return "Goods/goodsInsertForm";
	}

	@RequestMapping("goodsInsertPro")
	public String goodsInsertPro(@RequestParam(value = "memId") String memId, GoodsCommand goodsCommand,
			HttpServletRequest request) {
		System.out.println("멤아이디이 ::: " + memId);
		goodsInsertService.insert(goodsCommand, memId, request);
		return "redirect:main";
	}
}
