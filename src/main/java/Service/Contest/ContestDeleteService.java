package Service.Contest;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.DTO.ContestDTO;
import Repository.Contest.ContestRepository;

@Service
public class ContestDeleteService {
	@Autowired
	ContestRepository contestRepository;

	public Integer contestDelete(String contestNum, HttpServletRequest req) {
		Integer result = contestRepository.delete(contestNum);
		String realPath = req.getRealPath("/WEB-INF/view/Contest/upload");
		ContestDTO  contest = new ContestDTO();
		String contestStorePoster = contest.getContestStorePoster();
		// 삭제 알고리즘
		if (result > 0) {
			String filePath = realPath + "/" + contestStorePoster;
			File f = new File(filePath);
			if (f.exists()) {
				f.delete();
				System.out.println("파일삭제 완료");
			}
		}
		System.out.println("/Contest/upload : " + realPath);
		
		return result;
	}
}
