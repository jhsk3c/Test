package Repository.Activity;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import DTO.Activity.ActivityDTO;

@Repository
public class ActivityRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace ="actiMapper";
	
		public Integer activituInsert1(ActivityDTO acti) {
			String statement = namespace + ".activityInsert1";
			return sqlSession.insert(statement, acti);
			
		}

		public Integer activityInsert2(ActivityDTO acti) {
			String statement = namespace + ".activityInsert2";
			return sqlSession.insert(statement, acti);
		}

		public List<ActivityDTO> activityList() {
			String statement = namespace + ".activityList";
			return sqlSession.selectList(statement);
		}
		
		
		
		
		
}
