package Service.Shop;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.Shop.ShopReviewCommand;
import Model.DTO.AuthInfo;
import Model.DTO.ShopDTO;
import Model.DTO.ShopReviewDTO;
import Repository.Vspot.VspotRepository;

@Service
public class ShopReviewInsertService {
	
	@Autowired
	private VspotRepository vspotRepository;

	public void listNum(String shopNum, Model model, HttpSession session) {
		
		ShopDTO sdto = new ShopDTO();
		
		sdto.setShopNum(Integer.parseInt(shopNum));
		
		ShopDTO list = vspotRepository.listNum(sdto);
		
		AuthInfo auto = (AuthInfo)session.getAttribute("authInfo");
		
		model.addAttribute("auto",auto.getId() );	
		
		model.addAttribute("list", list);
		
	}

	public void insert(String shopNum, ShopReviewCommand shopReviewCommand, Model model, HttpSession session) {
		
		ShopReviewDTO shrdto = new ShopReviewDTO();
		
		AuthInfo auth = (AuthInfo)session.getAttribute("authInfo");
		shrdto.setMemNum(auth.getNum());
		shrdto.setMemId(auth.getId());
		
		shrdto.setShopNum(Integer.parseInt(shopNum));
		shrdto.setShopReviewStar1(Integer.parseInt(shopReviewCommand.getShopReviewStar1()));
		shrdto.setShopReviewStar2(Integer.parseInt(shopReviewCommand.getShopReviewStar2()));
		shrdto.setShopReviewStar3(Integer.parseInt(shopReviewCommand.getShopReviewStar3()));
		shrdto.setShopReviewStar4(Integer.parseInt(shopReviewCommand.getShopReviewStar4()));
		shrdto.setShopReviewTitle(shopReviewCommand.getShopReviewTitle());
		shrdto.setShopReviewContext(shopReviewCommand.getShopReviewContext());
		
		vspotRepository.insertshr(shrdto);
		
	}

}
