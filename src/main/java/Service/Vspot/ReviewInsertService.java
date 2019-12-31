package Service.Vspot;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import Command.Spot.VspotReviewCommand;
import Model.DTO.AuthInfo;
import Model.DTO.SpotReviewDTO;
import Model.DTO.VspotDTO;
import Repository.Vspot.VspotRepository;

@Service
public class ReviewInsertService {
	
	@Autowired
	private VspotRepository vspotRepository;
	
	@Transactional
	public void insertList(String vspotNum, Model model) {
		
		VspotDTO vdto = new VspotDTO();
		
		vdto.setVspotNum(Integer.parseInt(vspotNum));
		
		VspotDTO list = vspotRepository.insertList(vdto);
		
		model.addAttribute("list", list);
		
		
		
	}

	public void insert(String vspotNum, VspotReviewCommand vspotReviewCommand, Model model, HttpSession session) {
		SpotReviewDTO srdto = new SpotReviewDTO();
		
		AuthInfo auth = (AuthInfo)session.getAttribute("authInfo");
		srdto.setMemNum(auth.getNum());
		srdto.setMemId(auth.getId());
		
		srdto.setVspotNum(Integer.parseInt(vspotNum));
		srdto.setSpotReviewStar1(Integer.parseInt(vspotReviewCommand.getSpotReviewStar1()));
		srdto.setSpotReviewStar2(Integer.parseInt(vspotReviewCommand.getSpotReviewStar2()));
		srdto.setSpotReviewStar3(Integer.parseInt(vspotReviewCommand.getSpotReviewStar3()));
		srdto.setSpotReviewStar4(Integer.parseInt(vspotReviewCommand.getSpotReviewStar4()));
		srdto.setSpotReviewTitle(vspotReviewCommand.getSpotReviewTitle());
		srdto.setSpotReviewContext(vspotReviewCommand.getSpotReviewContext());
		
		vspotRepository.insert(srdto);
		
	}

	
	
}
