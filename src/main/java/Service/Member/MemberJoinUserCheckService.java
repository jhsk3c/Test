package Service.Member;

import org.springframework.beans.factory.annotation.Autowired;

import CommandMember.MemberCommand;
import Model.DTO.MemberDTO;
import Repository.Member.MemberRepository;

public class MemberJoinUserCheckService {
	
	@Autowired
	private MemberRepository memberRepository;

	public Integer getUserCheck(MemberCommand memberCommand) {
		
		MemberDTO member = new MemberDTO();
		
		member.setMemId(memberCommand.getMemId());
		
		member = memberRepository.UserCheck(member);
		
		Integer result = 0;
		
		if(member == null) {
			result = 0;
		} else {
			result = 1;
		}
		
		return result;
	}

}
