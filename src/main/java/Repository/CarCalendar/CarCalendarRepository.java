package Repository.CarCalendar;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Command.Car.CarCalendarCommand;
import Model.DTO.CarCalendarDTO;
import Model.DTO.CarCalendarJoinDTO;




@Repository
public class CarCalendarRepository {

	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "Repository.Car.CarCalendarMapper";
	
	public Integer driveNumSelect(String userName) {
		
	Integer driveNum = null;
	 String statement = namespace + ".carCalendarDriveNumSelect";
	 driveNum = sqlSession.selectOne(statement,userName);
		return driveNum;
	}
	
	public void carCalendarInsert(CarCalendarDTO carCalendar) {
		
		 String statement = namespace + ".carCalendarInsert";
		 sqlSession.insert(statement,carCalendar);
		}
	
	public List<CarCalendarJoinDTO> calendarAllList(CarCalendarJoinDTO carCalendarJoinDTO) { //일정 등록 리스트
		
		String statement = namespace + ".calendarAllList";
		 
		return sqlSession.selectList(statement,carCalendarJoinDTO); 
	}
	
}
