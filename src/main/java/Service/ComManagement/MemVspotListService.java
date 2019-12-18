package Service.ComManagement;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import Model.DTO.VspotDTO;
import Repository.Admin.AdminRepository;

@Service
public class MemVspotListService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	//리스트 출력하기
	@Transactional
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

	//상세보기
	@Transactional
	public void vspotDetail(String vspotNum, Model model) {
		
		VspotDTO vdto = adminRepository.FileDelete(vspotNum); //상세보기나 파일삭제나 같아서
		
		if(vdto.getVspotOriginal() != null) {
			
				String [] original = vdto.getVspotOriginal().split("-"); 
				String [] store = vdto.getVspotStore().split("-");
				
				model.addAttribute("original", original);
				model.addAttribute("store", store);
			}
		
		model.addAttribute("list", vdto);
		
	}

	// 승인버튼을 클릭시.
	@Transactional
	public Integer vspotTrue(String vspotNum) {
		
		System.out.println(vspotNum);
		Integer result = adminRepository.vspotTrue(vspotNum);
		System.out.println(result);
		return result;
	}

	// 비승인버튼을 클릭시.
	@Transactional
	public Integer vspotFalse(String vspotNum,  HttpServletRequest request) {
		
		System.out.println(vspotNum);
		
		VspotDTO vdto = adminRepository.FileDelete(vspotNum);
		
		
		String[] store = vdto.getVspotStore().split("-"); //얘를 어케 뽑아야할까 .
		
		String filedelete = null;
		
		for(String list : store) {
			filedelete = list;

			String path = request.getServletContext().getRealPath("/"); 
			path += "upload/"; 
			File file = new File(path+ filedelete); 
			if(file.exists()) {
				file.delete();
			}
		
		}

		Integer result = adminRepository.vspotFalse(vspotNum);
		System.out.println(result);
		return result;
	}

}
