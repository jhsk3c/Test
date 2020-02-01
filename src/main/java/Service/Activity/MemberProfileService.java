package Service.Activity;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import DTO.Activity.ActivityDTO;
import Model.DTO.AuthInfo;
import Model.DTO.MemberDTO;
import Model.DTO.ShopDTO;
import Model.DTO.ShopReservationDTO;
import Model.DTO.SpotReviewDTO;
import Model.DTO.VspotDTO;
import Repository.Activity.ActivityRepository;
import Repository.Member.MemberRepository;
import Repository.Vspot.VspotRepository;


@Service
public class MemberProfileService {
	@Autowired
	private ActivityRepository activityRepository;
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private VspotRepository vspotRepository;
	
	@Transactional
	public String ActivitySelect(Model model, HttpSession session, Integer page) {
		ActivityDTO acti = new ActivityDTO();
		AuthInfo authInfo = (AuthInfo)session.getAttribute("authInfo");
			acti.setMemNum(authInfo.getNum());
			
				 System.out.println("접근_SERVICE_MYprofile");
				 System.out.println("memNum 값"); System.out.println(acti.getMemNum());
				 System.out.println("memNum 값"); System.out.println(acti.getMemNum());
				 System.out.println("memNum 값"); System.out.println(acti.getMemNum());
				 System.out.println("memNum 값"); System.out.println(acti.getMemNum());
				 System.out.println("memNum 값"); System.out.println(acti.getMemNum());
			 
		ActivityDTO list = activityRepository.activityProfile(acti);
				System.out.println("활동 넘 값 : " + list.getActivityNum());
				System.out.println("레벨 값 : " + list.getActivityLev());
				System.out.println("레벨 값 : " + list.getActivityLev());
				System.out.println("레벨 값 : " + list.getActivityLev());
				System.out.println("레벨 값 : " + list.getActivityLev());
				
		//타임스템프를 string으로 형식 재구성 후 저장
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
			String activityStartDate = sdf.format(new Date(list.getActivityStartDate().getTime()));
					System.out.println("활동시작일 스트링 형");
					System.out.println("활동시작일 String형 : " + activityStartDate);	
			String activityEndDate = sdf.format(new Date(list.getActivityEndDate().getTime()));
					System.out.println("활동시작일 스트링 형");
					System.out.println("활동시작일 String형 : " + activityEndDate);	
				
		model.addAttribute("list", list);
		model.addAttribute("activityStartDate", activityStartDate);
		model.addAttribute("activityEndDate", activityEndDate);
		
		
		// 여기서부터는 회원의 개인 정보와 리스트..(상점 등록, 휴양지 등록, 예약등등)
		MemberDTO member = new MemberDTO();
		member.setMemNum(authInfo.getNum());
		MemberDTO mem = memberRepository.memberSele(member);
		model.addAttribute("mem", mem);
		// ====================================> 여기까지가 회원 개인정보 뽑기.
		
		int limit = 10;
		VspotDTO vspot = new VspotDTO();
		vspot.setMemNum(authInfo.getNum());
		String ss = authInfo.getNum();
		List<VspotDTO> vsp = vspotRepository.vspotSele(ss, page, limit);
		model.addAttribute("vsp", vsp);

		Integer Count = vspotRepository.vspotseleCount(vspot);
		int maxPage = (int)((double)Count / limit + 0.95);
		int startPage = (int)(((double)page / 10 + 0.9 ) -1) * 10 +1;
		int endPage = startPage + 10 -1;
		
		if(endPage > maxPage)endPage= maxPage;
		
		System.out.println(Count);
		
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("page", page);
		model.addAttribute("vsp", vsp);
		model.addAttribute("count", Count);
		// ==================> 여기까지가 휴양지 뽑는거
		
		ShopDTO sdto = new ShopDTO();
		sdto.setMemId(authInfo.getId());
		String abcd = authInfo.getId();
		List<ShopDTO> shdto = vspotRepository.shopSele(abcd, page, limit);
		Integer shopCount = vspotRepository.shopSeleCount(sdto);
		int maxPage1 = (int)((double)shopCount / limit + 0.95);
		int startPage1 = (int)(((double)page / 10 + 0.9 ) -1) * 10 +1;
		int endPage1 = startPage1 + 10 -1;
		
		if(endPage1 > maxPage1)endPage1= maxPage1;
		
		
		model.addAttribute("maxPage", maxPage1);
		model.addAttribute("startPage", startPage1);
		model.addAttribute("endPage", endPage1);
		model.addAttribute("page", page);
		model.addAttribute("shdto", shdto);
		model.addAttribute("shopCount", shopCount);
		// ========================> 여기까지가 상점 뽑느거.
		
		ShopReservationDTO shopre = new ShopReservationDTO();
		shopre.setMemNum(authInfo.getNum());
		String zxc = authInfo.getNum();
		List<ShopReservationDTO> shoptdto = vspotRepository.shopReserSele(zxc, page, limit);
		Integer shoprtionCount = vspotRepository.shoprtionSeleCount(shopre);
		
		int maxPage2 = (int)((double)shoprtionCount / limit + 0.95);
		int startPage2 = (int)(((double)page / 10 + 0.9 ) -1) * 10 +1;
		int endPage2 = startPage2 + 10 -1;
		
		if(endPage2 > maxPage2)endPage2= maxPage2;
		
		
		model.addAttribute("maxPage", maxPage2);
		model.addAttribute("startPage", startPage2);
		model.addAttribute("endPage", endPage2);
		model.addAttribute("page", page);
		model.addAttribute("shoptdto", shoptdto);
		model.addAttribute("shoprtionCount", shoprtionCount);
		
		
	return "Member/MyProfile";
	}
}
