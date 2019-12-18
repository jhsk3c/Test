package Service.ComManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Repository.Admin.AdminRepository;

@Service
public class ActivityListTrueService {

	@Autowired
	private AdminRepository adminRepository;
	
	@Transactional
	public Integer True(String activityNum) {
		Integer result = adminRepository.activityTrue(activityNum);
		
		System.out.println(activityNum);
		System.out.println(activityNum);
		System.out.println(activityNum);
		System.out.println(activityNum);
		System.out.println("접근AmdinListTRUEService");
		System.out.println("접근");
		System.out.println("접근");
		System.out.println("접근");
		System.out.println("접근");
		System.out.println("접근");
		System.out.println("접근");
		System.out.println("접근");
		
		System.out.println(result);
		
		return result;
	}

}
