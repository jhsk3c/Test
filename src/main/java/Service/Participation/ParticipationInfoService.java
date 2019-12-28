package Service.Participation;

import org.springframework.stereotype.Service;

import Model.DTO.ParticipationDTO;

@Service
public class ParticipationInfoService {

	public void info(String memId, String pNum) {
		ParticipationDTO dto = new ParticipationDTO();
		dto.setMemId(memId);
	}
	
}
