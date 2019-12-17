package Service.Contest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.Contest.ContestCommand;
import Model.DTO.ContestDTO;
import Repository.Contest.ContestRepository;

@Service
public class ContestModifyService {
	@Autowired
	ContestRepository contestRepository;
	
	public Integer modify(String contestNum, ContestCommand contestCommand) {
		Integer result = null;
		ContestDTO contest = new ContestDTO();
		contest.setContestNum(contestNum);
		contest.setContestSubject(contestCommand.getContestSubject());
		contest.setContestContent(contestCommand.getContestContent());
		contest.setContestCondition(contestCommand.getContestCondition());
		contest.setContestEntryWay(contestCommand.getContestEntryWay());
		contest.setContestPeoples(Integer.parseInt(contestCommand.getContestPeoples()));
		contest.setContestPrizeWay(contestCommand.getContestPrizeWay());
		contest.setContestPrize(Integer.parseInt(contestCommand.getContestPrize()));
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date contestEnd;
			contestEnd = format.parse(contestCommand.getContestEnd());
			contest.setContestEnd(contestEnd);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("result = = = = " + result);
		System.out.println("#1 = == =  = " + contest.getContestSubject() );
		System.out.println("#2 = = = = = " + contest.getContestContent());
		System.out.println("#3 = = == == " + contest.getContestCondition());
		System.out.println("#4 = = == = =" + contest.getContestEntryWay());
		System.out.println("#5 = = = == =" + contest.getContestPeoples());
		System.out.println("#6 = = == == " + contest.getContestEnd());
		System.out.println("#7 = = = = = " + contest.getContestPrizeWay());
		System.out.println("#8 == = = = =" + contest.getContestPrize());
		System.out.println("#9 = = = = = " + contest.getContestNum());
		
		result = contestRepository.contestModify(contest);
		return result;
	}
}
