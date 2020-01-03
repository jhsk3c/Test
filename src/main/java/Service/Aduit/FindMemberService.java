package Service.Aduit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Model.DTO.AduitDTO;
import Model.DTO.MemberDTO;
import Repository.Aduit.AduitRepository;

@Service
public class FindMemberService {
	@Autowired
	AduitRepository aduitRepository;

	@Transactional
	public String findMember(MemberDTO member) {
		System.out.println("findMember : " + member.getMemId());
		String memEmail = aduitRepository.findMemEmail(member);
		return memEmail;
	}

}
