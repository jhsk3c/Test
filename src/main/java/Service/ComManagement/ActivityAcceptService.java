package Service.ComManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import DTO.Activity.ActivityDTO;
import Repository.Admin.AdminRepository;

@Service
public class ActivityAcceptService {

	@Autowired
	private AdminRepository adminRepository;
	
	@Transactional
	public String activityAcceptList(Integer page, Model model) {
		
		int limit = 10;//페이징
		
		Integer su1 = 2;
		List<ActivityDTO> list = adminRepository.ActivityListADMIN(page, limit);
		Integer Count = adminRepository.ActivityCount();
		
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

		
		return "Admin/Activity";
	}
	
}