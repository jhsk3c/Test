package Service.Participation;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import Command.Participation.ParticipationCommand;
import Model.DTO.AuthInfo;
import Model.DTO.ParticipationDTO;
import Repository.Particitpation.ParticipationRepository;

@Service
public class WriteService {
	@Autowired
	ParticipationRepository participationRepository;

	String original = null;
	String originalFileExtension = null;
	String store = null;
	public void write(String contestNum, ParticipationCommand participationCommand, HttpSession session, HttpServletRequest request) {
		ParticipationDTO dto = new ParticipationDTO();
		String sessionMemId = ((AuthInfo)session.getAttribute("authInfo")).getId();
		String sessionMemNum = ((AuthInfo)session.getAttribute("authInfo")).getNum();
		String sessionMemName = ((AuthInfo)session.getAttribute("authInfo")).getName();
//		System.out.println("회원 번호:::::::::::::::::" + memNum);
		dto.setMemNum(sessionMemNum); 
		dto.setMemId(sessionMemId);
		dto.setMemName(sessionMemName);
		dto.setContestNum(Integer.parseInt(contestNum));
		dto.setWorkName(participationCommand.getWorkName());
		dto.setWorkOutline(participationCommand.getWorkOutline());
		dto.setWorkContent(participationCommand.getWorkContent());
		
//		파일
		String originalTotal = "";
		String storeTotal = "";

		for (MultipartFile mf : participationCommand.getWorkImage()) {
			original = mf.getOriginalFilename();
			originalFileExtension = original.substring(original.lastIndexOf("."));
			store = UUID.randomUUID().toString().replaceAll("-", "") + originalFileExtension;
			originalTotal += original + "-";
			storeTotal += store + "-";
			
			System.out.println("originalTotal" + originalTotal);
			System.out.println("storeTotal" + storeTotal);
			
			String path = request.getServletContext().getRealPath("/");
			path += "WEB-INF/view/Participation/upload/";
			System.out.println("업로드 Path ::::::::" + path);
			File file = new File(path + store);
			
			try {
				mf.transferTo(file);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		dto.setWorkImage(storeTotal); // image파일 업로드
		Integer result = participationRepository.writeInsert(dto);
	}

}
