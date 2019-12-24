package Repository.Activity;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DTO.Activity.ActivityDTO;


public class ActivityRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace ="actiMapper";
	
		public Integer activituInsert1(ActivityDTO acti) {
			String statement = namespace + ".activityInsert1";
			return sqlSession.insert(statement, acti);
			
		}
		
		
		
		
		
}
