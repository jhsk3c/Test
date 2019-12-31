package Service.ComManagement;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.web.multipart.MultipartFile;

import Command.Activity.ActivityStoreCommand;
import DTO.Activity.ActivityStoreDTO;
import Repository.Admin.AdminRepository;



@Service
public class ActivityStoreInsertService {

	@Autowired
	private AdminRepository adminRepository;
	

	
	public Integer storeInsert(ActivityStoreCommand activityStoreCommand, HttpSession session, Errors errors) {
		
		ActivityStoreDTO actiStoreDTO = new ActivityStoreDTO();
		
		actiStoreDTO.setStoreName(activityStoreCommand.getStoreName());
		actiStoreDTO.setStoreLoc1(activityStoreCommand.getStoreLoc1());
		actiStoreDTO.setStoreLoc2(activityStoreCommand.getStoreLoc2());
		actiStoreDTO.setStoreTel(activityStoreCommand.getStoreTel());
		actiStoreDTO.setStoreBusinessNum(activityStoreCommand.getStoreBusinessNum());
		actiStoreDTO.setStoreOwner(activityStoreCommand.getStoreOwner());
		actiStoreDTO.setStoreMainProduct(activityStoreCommand.getStoreMainProduct());
		
				
		
		Integer result = adminRepository.activityStoreInsert(actiStoreDTO);
		
		return result;
	}

}
