package Service.Shop;

import java.io.File;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import Command.Shop.ShopCommand;
import Model.DTO.AuthInfo;
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
	
	@Transactional
	public String shopNumList(String vspotNum, Model model) {
		
		VspotDTO vspot = adminRepository.FileDelete(vspotNum);
		
		model.addAttribute("vspot", vspot);
		return "Admin/adminShop";
	}

	@Transactional
	public Integer shopInsert(String vspotNum, ShopCommand shopCommand, HttpServletRequest request, HttpSession session) { // 회원이
		
		ShopDTO sdto = new ShopDTO();
		
		AuthInfo auth = (AuthInfo)session.getAttribute("authInfo");
		sdto.setMemId(auth.getId());
		System.out.println(auth.getId());
		System.out.println(auth.getId());
		System.out.println(auth.getId());
		System.out.println(auth.getId());
		System.out.println(auth.getId());
		
		sdto.setShopClosed(shopCommand.getShopClosed());
		
	
		sdto.setShopTime1(shopCommand.getShopTime1());
		sdto.setShopTime2(shopCommand.getShopTime2());
		sdto.setShopCount(Integer.parseInt(shopCommand.getShopCount()));
		sdto.setVspotNum(Integer.parseInt(vspotNum));
		sdto.setShopCategory(shopCommand.getShopCategory());
		sdto.setShopLoc(shopCommand.getShopLoc());
		sdto.setShopLocation("(" + shopCommand.getShopLocation1() + ")" + " " + shopCommand.getShopLocation2()+ " " + shopCommand.getShopLocation3());
		sdto.setShopLocationMap(shopCommand.getShopLocation2());
		sdto.setShopName(shopCommand.getShopName());
		sdto.setGoodsContext(shopCommand.getGoodsContext().replace("\n", "<br/>"));
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
	
	
	
	@Transactional
	public String shopNumList2(String vspotNum, Model model) {
		
		VspotDTO vspot = adminRepository.FileDelete(vspotNum);
		
		model.addAttribute("vspot", vspot);
		return "Admin/adminShopInsert";
	}

	
	
	
	@Transactional
	public Integer adminshopInsert(String vspotNum, ShopCommand shopCommand, HttpServletRequest request, HttpSession session) { // 회원이
		
		ShopDTO sdto = new ShopDTO();
		
		AuthInfo auth = (AuthInfo)session.getAttribute("authInfo");
		sdto.setMemId(auth.getId());
		
		sdto.setShopClosed(shopCommand.getShopClosed());
		
	
		sdto.setShopTime1(shopCommand.getShopTime1());
		sdto.setShopTime2(shopCommand.getShopTime2());
		
		sdto.setVspotNum(Integer.parseInt(vspotNum));
		sdto.setShopCount(Integer.parseInt(shopCommand.getShopCount()));
		sdto.setShopCategory(shopCommand.getShopCategory());
		sdto.setShopLoc(shopCommand.getShopLoc());
		sdto.setShopLocation("(" + shopCommand.getShopLocation1() + ")" + " " + shopCommand.getShopLocation2()+ " " + shopCommand.getShopLocation3());
		sdto.setShopLocationMap(shopCommand.getShopLocation2());
		sdto.setShopName(shopCommand.getShopName());
		sdto.setGoodsContext(shopCommand.getGoodsContext().replace("\n", "<br/>"));
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
		Integer result = adminRepository.adminshopInsert(sdto);
		
		return result;
		
	}

}
