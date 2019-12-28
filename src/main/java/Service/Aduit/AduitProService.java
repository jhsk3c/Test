package Service.Aduit;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import Model.DTO.AduitDTO;
import Model.DTO.ParticipationDTO;
import Repository.Aduit.AduitRepository;
import Repository.Particitpation.ParticipationRepository;
import Service.Participation.AduitUpdateService;

@Service
public class AduitProService {
	@Autowired
	AduitRepository aduitRepository;
	@Autowired
	AduitUpdateService aduitUpdateService;

	@Transactional
	public Integer aduitPro(String memId, String pNum, String a, String b, Model model, HttpSession session) {
		AduitDTO dto = new AduitDTO();
		Integer auditOriginality = Integer.parseInt(a);
		Integer auditPracticality = Integer.parseInt(b);
		Float auditAvg = (float) ((auditOriginality + auditPracticality) / 2);
		pNum = pNum.trim();

		String contestNum = aduitRepository.findContestNum(pNum);
		String auditPass = null;

		if (auditAvg >= 4) {
			auditPass = "합격";
		} else if (auditAvg < 4) {
			auditPass = "불합격";
		}

		dto.setParticipationNum(Integer.parseInt(pNum));
		dto.setContestNum(Integer.parseInt(contestNum));
		dto.setMemId(memId);

		dto.setAuditOriginality(auditOriginality);
		dto.setAuditPracticality(auditPracticality);
		dto.setAuditAvg(auditAvg);
		dto.setAuditPass(auditPass);

		Integer result = aduitRepository.aduitInsert(dto);
		if (result == 1) {
			aduitUpdateService.auditUpdate(pNum, memId);
		} else {
			System.out.println("빠킹 ㅗ");
		}

		Integer result2 = null;
		if (dto.getAuditPass().equals("합격")) {
			result2 = 1;
		} else if (dto.getAuditPass().equals("불합격")) {
			result2 = 0;
		}
		model.addAttribute("contestNum", contestNum);
		model.addAttribute("audit", dto);
//		session.setAttribute("audit", dto);
		return result2;
	}

}
