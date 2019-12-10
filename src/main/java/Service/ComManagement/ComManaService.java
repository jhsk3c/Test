package Service.ComManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.ComMemberDTO;
import Repository.Admin.AdminRepository;

@Service
public class ComManaService {
	
	@Autowired
	private AdminRepository adminRepository;

	public String comList(Model model) {
		
		List<ComMemberDTO> list = adminRepository.comList();
		
		model.addAttribute("list", list);
		
		return "Admin/comList";
	}

}
