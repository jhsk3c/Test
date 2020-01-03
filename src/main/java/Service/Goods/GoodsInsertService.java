package Service.Goods;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import Command.Goods.GoodsCommand;
import Model.DTO.AduitDTO;
import Model.DTO.GoodsDTO;
import Repository.Goods.GoodsRepository;

@Service
public class GoodsInsertService {
	@Autowired
	GoodsRepository goodsRepository;
	String original = null;
	String originalFileExtension = null;
	String store = null;

	@Transactional
	public void insert(GoodsCommand goodsCommand, String memId, HttpServletRequest request) {
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
		goods.setGoodsContent(goodsCommand.getGoodsContent());
		goods.setGoodsQty(Integer.parseInt(goodsCommand.getGoodsQty()));
		goods.setGoodsDiscountRate(Integer.parseInt(goodsCommand.getGoodsDiscountRate()));

//		파일
		String originalTotal = "";
		String storeTotal = "";

		for (MultipartFile mf : goodsCommand.getGoodsImage()) {
			original = mf.getOriginalFilename();
			originalFileExtension = original.substring(original.lastIndexOf("."));
			store = UUID.randomUUID().toString().replaceAll("-", "") + originalFileExtension;
			originalTotal += original + "-";
			storeTotal += store + "-";

			System.out.println("originalTotal" + originalTotal);
			System.out.println("storeTotal" + storeTotal);

			String path = request.getServletContext().getRealPath("/");
			path += "WEB-INF/view/Goods/upload/";
			System.out.println("업로드 Path ::::::::" + path);
			File file = new File(path + store);
			try {
				mf.transferTo(file);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		goods.setGoodsImage(storeTotal);
		System.out.println("스토어 토탈 :::: " + storeTotal);
		Integer result = goodsRepository.goodsInsert(goods);
	}

}
