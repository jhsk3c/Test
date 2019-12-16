package Service.ComManagement;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

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

		model.addAttribute("maxPage", maxPage);
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("page", page);
		model.addAttribute("list", list);
		model.addAttribute("Count", Count);
		model.addAttribute("list", list);

		//model.addAttribute("store", store);
		
		return "Admin/vspotList";
	}


	public void vspotDetail(String count, Model model) {
		
		VspotDTO vdto = adminRepository.vspotDetail(count);
		
		if(vdto.getVspotOriginal() != null) {
			
				String [] original = vdto.getVspotOriginal().split("-"); 
				String [] store = vdto.getVspotStore().split("-");
				
				model.addAttribute("original", original);
				model.addAttribute("store", store);
			}
		
		model.addAttribute("list", vdto);
		
	}

}
