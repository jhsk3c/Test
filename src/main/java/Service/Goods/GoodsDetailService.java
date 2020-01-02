package Service.Goods;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.AuthInfo;
import Model.DTO.GoodsDTO;
import Repository.Goods.GoodsRepository;

@Service
public class GoodsDetailService {
	@Autowired
	GoodsRepository goodsRepository;
	public void goodsDetail(String goodsNum, Model model, HttpSession session) {
		GoodsDTO dto = new GoodsDTO();
		dto.setGoodsNum(Integer.parseInt(goodsNum));
		dto = goodsRepository.goodsDetail(dto);
		String memId = ((AuthInfo) session.getAttribute("authInfo")).getId();
		model.addAttribute("memId", memId);
		model.addAttribute("goods", dto);
	}
}
