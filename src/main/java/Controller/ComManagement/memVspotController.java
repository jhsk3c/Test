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
	
	@RequestMapping("admin/memVspot")
	public String memvspot(@RequestParam(value = "page", defaultValue = "1") Integer page, Model model) {
		
		return memVspotListService.vspotList(page, model);
	}
	
	@RequestMapping("admin/Detail")
	public String Datil(@RequestParam(value = "num") String count, Model model) {
		
		memVspotListService.vspotDetail(count, model);
		
		
		return "Admin/vspotDetail";
	}
	
	
	
	@RequestMapping("admin/fileUpload")
	public String file(@RequestParam(value = "filename") String original,@RequestParam(value = "filename1") String store , Model model, HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("접근접근접근접근접근접근접근접근접근접근접근접근");
		
		fileSerivce.upload(original,store, request, response);
		
		
		return null;
	}

}
