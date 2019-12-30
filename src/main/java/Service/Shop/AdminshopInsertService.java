package Service.Shop;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import Command.Shop.ShopCommand;
import Model.DTO.ShopDTO;
import Model.DTO.VspotDTO;
import Repository.Admin.AdminRepository;

@Service
public class AdminshopInsertService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	String original = null;
	String originalFileExtension = null;
	String store = null;
	
	public String shopNumList(String vspotNum, Model model) {
		
		VspotDTO vspot = adminRepository.FileDelete(vspotNum);
		
		model.addAttribute("vspot", vspot);
		return "Admin/adminShop";
	}

	public Integer shopInsert(String vspotNum, ShopCommand shopCommand, HttpServletRequest request) {
		
		ShopDTO sdto = new ShopDTO();
		
		sdto.setVspotNum(Integer.parseInt(vspotNum));
		sdto.setShopCategory(shopCommand.getShopCategory());
		sdto.setShopLoc(shopCommand.getShopLoc());
		sdto.setShopLocation("(" + shopCommand.getShopLocation1() + ")" + " " + shopCommand.getShopLocation2()+ " " + shopCommand.getShopLocation3());
		sdto.setShopLocationMap(shopCommand.getShopLocation2());
		sdto.setShopName(shopCommand.getShopName());
		sdto.setGoodsName(shopCommand.getGoodsName());
		sdto.setGoodsContext(shopCommand.getGoodsContext().replace("\n", "<br/>"));
		sdto.setGoodsPrice(Integer.parseInt(shopCommand.getGoodsPrice()));
		sdto.setGoodsIntro(shopCommand.getGoodsIntro());
		

		String originalTotal = "";
		String storeTotal = "";
		
		for(MultipartFile mf : shopCommand.getGoodsReport()) { 
			 original = mf.getOriginalFilename(); 
			 originalFileExtension = original.substring(original.lastIndexOf("."));  
			
			 store = UUID.randomUUID().toString().replaceAll("-", "") + originalFileExtension; 

			 originalTotal += original + "-"; 
			 storeTotal += store + "-";

			 sdto.setGoodsOriginal(originalTotal); 
			 sdto.setGoodsStore(storeTotal);
		
			String path = request.getServletContext().getRealPath("/"); 
			 
			path += "WEB-INF/view/Spot/upload/"; 
			File file = new File(path+ store); 
			System.out.println();
			System.out.println(path);
			System.out.println();
			System.out.println(file);
			
			try {
				mf.transferTo(file); 
				
				
			} catch (Exception e) {
			
				e.printStackTrace();
			} 
			} 
		Integer result = adminRepository.shopInsert(sdto);
		
		return result;
		
	}

}
