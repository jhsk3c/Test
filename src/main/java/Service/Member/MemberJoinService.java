package Service.Member;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import CommandMember.MemberCommand;
import Encrypt.Encrypt;
import Model.DTO.MemberDTO;
import Repository.Member.MemberRepository;

@Service
public class MemberJoinService {
	
	@Autowired
	private MemberRepository memberRepository;

	@Transactional
	public Integer JoinInsert(MemberCommand memberCommand) {
		
		MemberDTO member = new MemberDTO();
		
		member.setMemId(memberCommand.getMemId());
		member.setMemPw(Encrypt.getEncryption(memberCommand.getMemPw()));
		member.setMemName(memberCommand.getMemName());
		
		SimpleDateFormat dt = new SimpleDateFormat("yyyyMMdd");
		Date date;
		try {
			date = dt.parse(memberCommand.getMemBirth());
			Timestamp MemBirth = new Timestamp(date.getTime());
			member.setMemBirth(MemBirth);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		member.setMemSex(memberCommand.getMemSex());
		member.setMemNationality(memberCommand.getMemNationality());
		member.setMemEmail(memberCommand.getMemEmail());
		member.setMemAddr(memberCommand.getMemAddr1() + memberCommand.getMemAddr2() + memberCommand.getMemAddr3());
		member.setMemTel(memberCommand.getMemTel());
		member.setMemPreferTrip(memberCommand.getMemPreferTrip());
		
		Integer result = memberRepository.JoinInsert(member);
		
		return result;
	}

}
