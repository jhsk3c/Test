package Service.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CommandMember.ComMemberCommand;
import Encrypt.Encrypt;
import Model.DTO.ComMemberDTO;
import Repository.Member.MemberRepository;

@Service
public class ComMemberInfoService {
	
	@Autowired
	private MemberRepository memberRepository;

	public Integer InfoInsert(ComMemberCommand comMemberCommand) {
		
		ComMemberDTO comMember = new ComMemberDTO();
		
		comMember.setComId(comMemberCommand.getComId());
		comMember.setComPw(Encrypt.getEncryption(comMemberCommand.getComPw()));
		comMember.setComRepName(comMemberCommand.getComRepName());
		comMember.setLicenseNumber(comMemberCommand.getLicenseNumber());
		comMember.setComName(comMemberCommand.getComName());
		comMember.setComAddr(comMemberCommand.getComAddr1() + comMemberCommand.getComAddr2() + comMemberCommand.getComAddr3());
		comMember.setContactPhoneNum(comMemberCommand.getContactPhoneNum());
		comMember.setContactEmail(comMemberCommand.getContactEmail());

		Integer result = memberRepository.InfoInsert(comMember);
		
		
		return result;
		
		
	}

}
