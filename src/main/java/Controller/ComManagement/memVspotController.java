package Controller.ComManagement; 

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.ComManagement.FileSerivce;
import Service.ComManagement.MemVspotListService;

@Controller
public class memVspotController {
	
	@Autowired
	private MemVspotListService memVspotListService;
	
	@Autowired
	private FileSerivce fileSerivce;
	
	//휴양지 리스트 보기(관리자가)
	@RequestMapping("admin/memVspot")
	public String memvspot(@RequestParam(value = "page", defaultValue = "1") Integer page, Model model) {
		
		return memVspotListService.vspotList(page, model);
	}
	
	
	@RequestMapping("admin/vspotListTrue") // 승인을 눌렀을  승인업데이트와 함께 리스트 출력
	public String True(Model model, @RequestParam(value = "num") String vspotNum, @RequestParam(value = "page", defaultValue = "1") Integer page)  {
		System.out.println(vspotNum);
		Integer result = memVspotListService.vspotTrue(vspotNum);
		
		if(result != null) {
			return memVspotListService.vspotList(page, model);
		} else {
			return "redirect:/main";
		}
		
	}
	
	@RequestMapping("admin/vspotListFalse") // 비승인을 눌렀을  삭제와 함께 리스트 출력
	public String False(Model model, @RequestParam(value = "num") String vspotNum, @RequestParam(value = "page", defaultValue = "1") Integer page, HttpServletRequest request)  {
		System.out.println(vspotNum);
		Integer result = memVspotListService.vspotFalse(vspotNum, request);
		
		if(result != null) {
			return memVspotListService.vspotList(page, model);
		} else {
			return "redirect:/main";
		}
		
	}
	
	
	
	//휴양지 클릭 시 상세보기
	@RequestMapping("admin/Detail")
	public String Datil(@RequestParam(value = "num") String vspotNum, Model model) {
		
		memVspotListService.vspotDetail(vspotNum, model);

		return "Admin/vspotDetail";
	}
	
	//휴양지 상세보기 내용에서 파일을 다운로드 하는 내용
	@RequestMapping("admin/fileUpload")
	public String file(@RequestParam(value = "filename") String original,@RequestParam(value = "filename1") String store , Model model, HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("접근접근접근접근접근접근접근접근접근접근접근접근");
		
		fileSerivce.upload(original,store, request, response);
		
		
		return null;
	}

}
