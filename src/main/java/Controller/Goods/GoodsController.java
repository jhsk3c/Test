package Controller.Goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Participation.ParticipationInfoService;

@Controller
public class GoodsController {
	@Autowired
	ParticipationInfoService participationInfoService;

	@RequestMapping("goodsInsert")
	public String goodsInsert(@RequestParam(value = "memId") String memId, Model model) {
//		participationInfoService.info(memId, pNum);
		return "Goods/goodsInsertForm";
	}
}
