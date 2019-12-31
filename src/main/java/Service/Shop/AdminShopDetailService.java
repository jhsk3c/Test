package Service.Shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import Model.DTO.ShopDTO;
import Repository.Admin.AdminRepository;

@Service
public class AdminShopDetailService {
	
	@Autowired
	private AdminRepository adminRepository;

	@Transactional
	public void shopDetail(String shopNum, Model model) {

		ShopDTO sdto = new ShopDTO();
		
		sdto.setShopNum(Integer.parseInt(shopNum));
		
		ShopDTO list = adminRepository.shopListDetail(sdto);
		
		if(list.getGoodsOriginal() != null) {
			String[] original = list.getGoodsOriginal().split("-");
			String[] store = list.getGoodsStore().split("-");
			
			model.addAttribute("original", original);
			model.addAttribute("store", store);
		}
		
		model.addAttribute("list", list);
		
	}

}
