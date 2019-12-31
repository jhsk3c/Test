package Service.Vspot;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import Model.DTO.ShopDTO;
import Model.DTO.SpotReviewDTO;
import Model.DTO.VspotDTO;
import Repository.Vspot.VspotRepository;

@Service
public class VspotListDetailService {
	
	@Autowired
	private VspotRepository vspotRepository;
	
	@Transactional
	public void listDetail(String vspotNum, Model model, Integer page) {
		
		VspotDTO vspot = new VspotDTO();
		vspot.setVspotNum(Integer.parseInt(vspotNum));
		VspotDTO list = vspotRepository.listDetail(vspot);
		if(list.getVspotOriginal() != null) {
				String [] original = list.getVspotOriginal().split("-"); 
				String [] store = list.getVspotStore().split("-");
				
				model.addAttribute("original", original);
				model.addAttribute("store", store);
			}
		model.addAttribute("list", list);
		
		
		List<VspotDTO> Vlist = vspotRepository.memList();
		Collections.shuffle(Vlist);
		model.addAttribute("vlist", Vlist);
		
		
		int limit = 10;
		SpotReviewDTO srto = new SpotReviewDTO();
		srto.setVspotNum(Integer.parseInt(vspotNum));
		System.out.println("접근 넘버 : " + Integer.parseInt(vspotNum));
		List<SpotReviewDTO> srdto = vspotRepository.listReview(vspotNum, page, limit);
		Integer Count = vspotRepository.listReviewCount(srto);
		System.out.println("접근 카운트 : " + Count);
		
		double sum1 = 0;
		double sum2 = 0;
		double sum3 = 0;
		double sum4 = 0;
		double max = 0;
		double maxAvg = 0;
		for(int i = 0; i < srdto.size(); i++) {
			sum1 += srdto.get(i).getSpotReviewStar1(); 
			sum2 += srdto.get(i).getSpotReviewStar2();
			sum3 += srdto.get(i).getSpotReviewStar3();
			sum4 += srdto.get(i).getSpotReviewStar4();
		}
		double Avg1 = Math.round((sum1/Count)*10)/10.0;
		double Avg2 = Math.round((sum2/Count)*10)/10.0;
		double Avg3 = Math.round((sum3/Count)*10)/10.0;
		double Avg4 = Math.round((sum4/Count)*10)/10.0;
		max = (Avg1 + Avg2 + Avg3 + Avg4);
		maxAvg = Math.round((max/4)*100)/100.0;
		
		int maxPage = (int)((double)Count / limit + 0.95);
		int startPage = (int)(((double)page / 10 + 0.9 ) -1) * 10 +1;
		int endPage = startPage + 10 -1;
		
		if(endPage > maxPage)endPage= maxPage;
		
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("page", page);
		model.addAttribute("srdto", srdto);
		model.addAttribute("count", Count);
		
		model.addAttribute("avg1", Avg1);
		model.addAttribute("avg2", Avg2);
		model.addAttribute("avg3", Avg3);
		model.addAttribute("avg4", Avg4);
		model.addAttribute("maxAvg", maxAvg);
		
		ShopDTO sdto = new ShopDTO();
		sdto.setVspotNum(Integer.parseInt(vspotNum));
		List<ShopDTO> shop = vspotRepository.listShop(sdto);
		Collections.shuffle(shop);
		model.addAttribute("shop", shop);
		
		
		
		
		/* 이거는 리스트에서 항목에 대한 평균 별점 뽑으려고 하는건데 포기 
		  VspotDTO test = vspotRepository.jointest(vspot); 
		  model.addAttribute("test1", test);
		 */
		
	}

}
