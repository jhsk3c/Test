package Service.ComManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Repository.Admin.AdminRepository;

@Service
public class ComTrueService {

	@Autowired
	private AdminRepository adminRepository;

	@Transactional
	public Integer comTrue(String comNum) {
		System.out.println(comNum);
		Integer result = adminRepository.comTrue(comNum);
		System.out.println(result);
		return result;
	}

}
