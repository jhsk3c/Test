package Servoce.Vspot;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import Command.Spot.SpotCommand;
import Model.DTO.AuthInfo;
import Model.DTO.VspotDTO;
import Repository.Vspot.VspotRepository;

@Service
public class VspotService {
	
	@Autowired
	private VspotRepository vspotRepository;
	
	String original = null;
	String originalFileExtension = null;
	String store = null;
	
	
	public Integer vspotWrite(SpotCommand spotCommand, HttpServletRequest request, HttpSession session) {
		
		VspotDTO spot = new VspotDTO();
		
		spot.setMemNum(((AuthInfo)session.getAttribute("authInfo")).getNum());
		spot.setMemId(((AuthInfo)session.getAttribute("authInfo")).getId());
		
		
		spot.setVspotName(spotCommand.getVspotName());
		spot.setVspotLocation("("+spotCommand.getVspotLocation1() +")" +"&nbsp;&nbsp;&nbsp;" + spotCommand.getVspotLocation2()+ "\n" + spotCommand.getVspotLocation3());
		spot.setVspotIntroduce(spotCommand.getVspotIntroduce());
		spot.setVspotFeature(spotCommand.getVspotFeature());
		
		
		String originalTotal = "";
		String storeTotal = "";
		
		for(MultipartFile mf : spotCommand.getVspotReport()) { 
			 original = mf.getOriginalFilename(); 
			 originalFileExtension = original.substring(original.lastIndexOf("."));  
			
			 store = UUID.randomUUID().toString().replaceAll("-", "") + originalFileExtension; 

			 originalTotal += original + "-"; 
			 storeTotal += store + "-";

			 spot.setVspotOriginal(originalTotal); 
			 spot.setVspotStore(storeTotal);
		
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
		Integer result = vspotRepository.vspotInsert(spot);
		
		return result;
		
	}

}
