package Service.ComManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.ComMemberDTO;
import Model.DTO.VspotDTO;
import Repository.Admin.AdminRepository;

@Service
public class MemVspotListService {
	
	@Autowired
	private AdminRepository adminRepository;
	

	public String vspotList(Integer page, Model model) {
		int limit = 10;
		
		List<VspotDTO> list = adminRepository.vspotList(page, limit);
		Integer Count = adminRepository.vspotListCount();
		
		int maxPage = (int)((double)Count / limit + 0.95);
		int startPage = (int)(((double)page / 10 + 0.9 ) -1) * 10 +1;
		int endPage = startPage + 10 -1;
		
		if(endPage > maxPage)endPage= maxPage;
		
		for(int i = 0; i < list.size(); i++) {
			VspotDTO str = list.get(i);
			
			
		}
	
			String aa = list.get(1).getVspotOriginal();
			System.out.println(list.get(1).getVspotOriginal());
	
				
			
			System.out.println(list.get(1).getVspotOriginal());
		
		//String [] original = vspot.getVspotOriginal().split("-"); 
		//String [] store = vspot.getVspotStore().split("-");
		
		
		//System.out.println(original);
		//System.out.println(store);
		
		
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("page", page);
		model.addAttribute("list", list);
		model.addAttribute("Count", Count);
		model.addAttribute("list", list);
		model.addAttribute("original", aa);
		//model.addAttribute("store", store);
		
		return "Admin/vspotList";
	}

}
