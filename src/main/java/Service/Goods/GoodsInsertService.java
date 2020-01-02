package Service.Goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Command.Goods.GoodsCommand;
import Model.DTO.AduitDTO;
import Model.DTO.GoodsDTO;
import Repository.Goods.GoodsRepository;

@Service
public class GoodsInsertService {
	@Autowired
	GoodsRepository goodsRepository;

	@Transactional
	public void insert(GoodsCommand goodsCommand, String memId) {
		AduitDTO dto = new AduitDTO();
		String auditPass = "합격";
		memId = memId.trim();
		dto.setMemId(memId);
		dto.setAuditPass(auditPass);
		Integer auditNum = goodsRepository.findAuditNum(dto);
		Integer particiaptionNum = goodsRepository.findParticipationNum(auditNum);
		System.out.println("찾아온 aNum ::: " + auditNum);
		System.out.println("찾아온 pNum ::: " + particiaptionNum);
		GoodsDTO goods = new GoodsDTO();
		goods.setMemId(memId);
		goods.setAuditNum(auditNum);
		goods.setParticipationNum(particiaptionNum);
		goods.setGoodsCategory(goodsCommand.getGoodsCategory());
		goods.setGoodsName(goodsCommand.getGoodsName());
		goods.setGoodsPrice(Integer.parseInt(goodsCommand.getGoodsPrice()));
//		goods.setGoodsImage(goodsImage);
		goods.setGoodsContent(goodsCommand.getGoodsContent());
		goods.setGoodsQty(Integer.parseInt(goodsCommand.getGoodsQty()));
		goods.setGoodsDiscountRate(Integer.parseInt(goodsCommand.getGoodsDiscountRate()));

		Integer result = goodsRepository.goodsInsert(goods);
	}

}
