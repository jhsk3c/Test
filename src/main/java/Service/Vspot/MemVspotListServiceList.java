package Service.Vspot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import Model.DTO.VspotDTO;
import Repository.Vspot.VspotRepository;

@Service
public class MemVspotListServiceList {

	@Autowired
	private VspotRepository vspotRepository;
	
	@Transactional
	public String memLiset(Model model) {
		
		//리스트를 어케 뽑을까.
		String[] original = null;
		String[] store = null;
		List<VspotDTO> list = vspotRepository.memList();
	
		VspotDTO vdto = new VspotDTO();
		for(int i = 0; i < list.size(); i++) {
			vdto.setVspotStore(list.get(i).getVspotStore());
			vdto.setVspotOriginal(list.get(i).getVspotOriginal());
			
			System.out.println(vdto.getVspotOriginal());
			System.out.println(vdto.getVspotStore());
			
			original = vdto.getVspotOriginal().split("-");
			store = vdto.getVspotStore().split("-");
			 
			System.out.println(original);
			System.out.println(store);
		}
		
		System.out.println(original);
		System.out.println(store);
		model.addAttribute("Store", store);
		model.addAttribute("Original", original);
	
	
		model.addAttribute("list", list);
		return "Spot/vspotList";
	}

}
