package Service.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import CommandMember.MemberCommand;
import Model.DTO.MemberDTO;
import Repository.Member.MemberRepository;

@Service
public class MemberJoinUserCheckService {
	
	@Autowired
	private MemberRepository memberRepository;

	@Transactional
	public Integer getMemCheck(String memId) {
		System.out.println("service 접근확인 및 아이디" + memId);
		int idcheck = memberRepository.MemCheck(memId);
		System.out.println(" 넘어온 memId 개수 확인. " + idcheck);
		return idcheck;
		
		
	}
	
}
