package Service.Contest;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import Command.Contest.ContestCommand;
import Model.DTO.ContestDTO;
import Repository.Contest.ContestRepository;

@Service
public class ContestInsertService {
	@Autowired
	ContestRepository contestRepository;

	String original = null;
	String originalFileExtension = null;
	String store = null;
	String fileSize = null;

	public Integer contestInsert(ContestCommand contestCommand, HttpServletRequest request) {
		ContestDTO dto = new ContestDTO();

		String originalTotal = "";
		String storeTotal = "";

		for (MultipartFile mf : contestCommand.getContestPoster()) {
			original = mf.getOriginalFilename();
			originalFileExtension = original.substring(original.lastIndexOf("."));
			store = UUID.randomUUID().toString().replaceAll("-", "") + originalFileExtension;
			originalTotal += original + "-";
			storeTotal += store + "-";

			String path = request.getServletContext().getRealPath("/");
			path += "WEB-INF/view/contest/upload/";
			System.out.println();
			System.out.println("업로드 Path ::::::::" + path);
			System.out.println();
			File file = new File(path + store);
			try {
				mf.transferTo(file);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		dto.setContestPoster(originalTotal); // originalFileName
		dto.setContestStorePoster(storeTotal); // storeFileName
		// dto.setUserId(세션으로받아야함);
		dto.setContestOrganizer(contestCommand.getContestOrganizer());
		dto.setContestName(contestCommand.getContestName());
		dto.setContestSubject(contestCommand.getContestSubject());
		dto.setContestContent(contestCommand.getContestContent());
		dto.setContestCondition(contestCommand.getContestCondition());
		dto.setContestEntryWay(contestCommand.getContestEntryWay());
		dto.setContestPeoples(Integer.parseInt(contestCommand.getContestPeoples()));
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date contestStart;
			Date contestEnd;
			contestStart = format.parse(contestCommand.getContestStart());
			contestEnd = format.parse(contestCommand.getContestEnd());
			dto.setContestStart(contestStart);
			dto.setContestEnd(contestEnd);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		dto.setContestPrizeWay(contestCommand.getContestPrizeWay());
		dto.setContestPrize(Integer.parseInt(contestCommand.getContestPrize()));

//		System.out.println("organizer dto ::::::::::: " + dto.getContestOrganizer());
//		System.out.println("name dto ::::::::::: " + dto.getContestName());
//		System.out.println("content dto ::::::::::: " + dto.getContestContent());
//		System.out.println("subject dto ::::::::::: " + dto.getContestSubject());
//		System.out.println("condition dto ::::::::::: " + dto.getContestCondition());
//		System.out.println("entryWay dto ::::::::::: " + dto.getContestEntryWay());
//		System.out.println("peoples dto ::::::::::: " + dto.getContestPeoples());
//		System.out.println("prizeWay dto ::::::::::: " + dto.getContestPrizeWay());
//		System.out.println("prize dto ::::::::::: " + dto.getContestPrize());
//		System.out.println("start Time dto ::::::::::" + dto.getContestStart());
//		System.out.println("end Time dto ::::::::::" + dto.getContestEnd());

		return contestRepository.contestInsert(dto);
	}
}
