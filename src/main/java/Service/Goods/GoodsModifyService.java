package Service.Goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.Goods.GoodsCommand;
import Model.DTO.GoodsDTO;
import Repository.Goods.GoodsRepository;

@Service
public class GoodsModifyService {
	@Autowired
	GoodsRepository goodsRepository;

	public void goodsModify(GoodsCommand goodsCommand, String goodsNum, Model model) {
		GoodsDTO dto = new GoodsDTO();
		dto.setGoodsNum(Integer.parseInt(goodsNum));
		dto.setGoodsName(goodsCommand.getGoodsName());
		dto.setGoodsContent(goodsCommand.getGoodsContent());
		dto.setGoodsPrice(Integer.parseInt(goodsCommand.getGoodsPrice()));
		dto.setGoodsQty(Integer.parseInt(goodsCommand.getGoodsQty()));
		dto.setGoodsDiscountRate(Integer.parseInt(goodsCommand.getGoodsDiscountRate()));

		Integer result = goodsRepository.goodsModify(dto);

		model.addAttribute("goods", dto);
	}

}
