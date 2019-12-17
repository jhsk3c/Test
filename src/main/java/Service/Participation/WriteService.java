package Service.Participation;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.Participation.ParticipationCommand;
import Model.DTO.ParticipationDTO;
import Repository.Particitpation.ParticipationRepository;

@Service
public class WriteService {
	@Autowired
	ParticipationRepository participationRepository;

	public void write(String contestNum, ParticipationCommand participationCommand, HttpSession session) {
		ParticipationDTO dto = new ParticipationDTO();
		dto.setMemNum((String)session.getAttribute("authInfo")); // 여기다시해야댐
		dto.setContestNum(Integer.parseInt(contestNum));
		dto.setMemName(participationCommand.getMemName());
		dto.setWorkName(participationCommand.getWorkName());
		dto.setWorkOutline(participationCommand.getWorkOutline());
		dto.setWorkContent(participationCommand.getWorkContent());
		dto.setWorkImage(participationCommand.getWorkImage());
		
		Integer result = participationRepository.writeInsert(dto);
	}

}
