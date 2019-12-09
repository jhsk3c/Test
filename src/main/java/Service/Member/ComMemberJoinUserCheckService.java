package Service.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.Member.MemberRepository;

@Service
public class ComMemberJoinUserCheckService {

	@Autowired
	private MemberRepository memberRepository;
	
	public Integer getComCheck(String comId) {
	
		System.out.println("service 접근확인 및 아이디" + comId);
		int idcheck1 = memberRepository.ComCheck(comId);
		System.out.println(" 넘어온 comId 개수 확인. " + idcheck1);
		return idcheck1;
		
	}

}
