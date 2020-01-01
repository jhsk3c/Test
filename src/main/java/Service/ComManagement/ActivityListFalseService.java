package Service.ComManagement;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DTO.Activity.ActivityDTO;
import Repository.Admin.AdminRepository;
@Service
public class ActivityListFalseService {
	
	@Autowired
	private AdminRepository adminRepository;
	


	@Transactional
	public Integer activityFalse(String activityNum,  HttpServletRequest request) {
		
		System.out.println(activityNum);
		
		ActivityDTO actiDTO = adminRepository.actFileDelete(activityNum);
		
		
		String[] store = actiDTO.getStoreFilename().split("-"); //얘를 어케 뽑아야할까 .
		
		String filedelete = null;
		
		for(String list : store) {
			filedelete = list;

			String path = request.getServletContext().getRealPath("/"); 
			path += "WEB-INF/view/Activity/upload/"; 
			File file = new File(path+ filedelete); 
			if(file.exists()) {
				file.delete();
			}
		
		}

		Integer result = adminRepository.activityFalse(activityNum);
		System.out.println(result);
		return result;
	}
	
}
