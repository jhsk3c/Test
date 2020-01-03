package Service.Goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.DTO.GoodsDTO;
import Repository.Goods.GoodsRepository;

@Service
public class GoodsDeleteService {
	@Autowired
	GoodsRepository goodsRepository;
	
	public void goodsDelete(String goodsNum) {
		GoodsDTO dto = new GoodsDTO();
		dto.setGoodsNum(Integer.parseInt(goodsNum));
		Integer result = goodsRepository.goodsDelete(dto);
	}
}
