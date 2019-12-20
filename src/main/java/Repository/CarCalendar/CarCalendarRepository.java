package Repository.CarCalendar;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




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
}
