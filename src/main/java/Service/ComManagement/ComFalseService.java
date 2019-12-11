package Service.ComManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.Admin.AdminRepository;

@Service
public class ComFalseService {
	
	@Autowired
	private AdminRepository adminRepository;

	public Integer comFalse(String comNum) {
		
		System.out.println(comNum);
		Integer result = adminRepository.comFalse(comNum);
		System.out.println(result);
		return result;
	}

}
