package Service.Shop;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import Model.DTO.ShopDTO;
import Model.DTO.VspotDTO;
import Repository.Admin.AdminRepository;

public class AdminShopManaService {
	
	@Autowired
	private AdminRepository adminRepository;

	@Transactional
	public String list(Integer page, Model model) { // 리스트 뽑느거
		
		int limit = 10;
		
		List<ShopDTO> list = adminRepository.list(page, limit);
		Integer Count = adminRepository.listmanaCount();
		
		int maxPage = (int)((double)Count / limit + 0.95);
		int startPage = (int)(((double)page / 10 + 0.9 ) -1) * 10 +1;
		int endPage = startPage + 10 -1;
		
		if(endPage > maxPage)endPage= maxPage;

		model.addAttribute("maxPage", maxPage);
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("page", page);
		model.addAttribute("list", list);
		model.addAttribute("Count", Count);

		model.addAttribute("list", list);
		
		return "Admin/adminShopList";
	}

	@Transactional
	public Integer listTrue(String shopNum) { //승인 클릭시.
		
		Integer result = adminRepository.listTrue(shopNum);
		
		return result;
	}

	@Transactional
	public Integer listFalse(String shopNum, HttpServletRequest request) {
		
		System.out.println(shopNum);
		
		ShopDTO sdto = adminRepository.FileDelete2(shopNum);
		
		
		String[] store = sdto.getGoodsStore().split("-"); //얘를 어케 뽑아야할까 .
		
		String filedelete = null;
		
		for(String list : store) {
			filedelete = list;

			String path = request.getServletContext().getRealPath("/"); 
			path += "WEB-INF/view/Spot/upload/"; 
			File file = new File(path+ filedelete); 
			if(file.exists()) {
				file.delete();
			}
		
		}

		Integer result = adminRepository.listFalse(shopNum);
		System.out.println(result);
		return result;
	}

}
