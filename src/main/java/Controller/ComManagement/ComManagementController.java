package Controller.ComManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.ComManagement.ComManaService;

@Controller
public class ComManagementController {
	
	@Autowired
	private ComManaService comManaService;
	
	@RequestMapping("admin/comMana")
	public String comMana(Model model) {
		
		return comManaService.comList(model);
	}

}
