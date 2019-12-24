package Service.Vspot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import Model.DTO.VspotDTO;
import Repository.Vspot.VspotRepository;

@Service
public class VspotListDetailService {
	
	@Autowired
	private VspotRepository vspotRepository;
	
	@Transactional
	public void listDetail(String vspotNum, Model model) {
		
		VspotDTO vspot = new VspotDTO();
		
		vspot.setVspotNum(Integer.parseInt(vspotNum));
		
		VspotDTO list = vspotRepository.listDetail(vspot);
		
		
		

		if(list.getVspotOriginal() != null) {
			
				String [] original = list.getVspotOriginal().split("-"); 
				String [] store = list.getVspotStore().split("-");
				
				model.addAttribute("original", original);
				model.addAttribute("store", store);
			}
		
		model.addAttribute("list", list);
		
		
		
		List<VspotDTO> Vlist = vspotRepository.memList();
	
		model.addAttribute("vlist", Vlist);
		
		
	}

}
