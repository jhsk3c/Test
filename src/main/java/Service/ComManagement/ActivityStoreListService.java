package Service.ComManagement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import DTO.Activity.ActivityStoreDTO;
import Repository.Admin.AdminRepository;

@Service
public class ActivityStoreListService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	
	
	
	public String StoreList(Integer page, Model model) {
		
		int limit = 10;//페이징
		
		Integer su1 = 2;
		
		List<ActivityStoreDTO> list = adminRepository.storeList(page, limit);
	
		
		
		Integer Count = adminRepository.ActivityListCount();
		
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
		
		
		return "Admin/ActivityStoreList";
	}
	
	
	
}
