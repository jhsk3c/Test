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
	
	
//활동 등록
		public Integer activituInsert1(ActivityDTO acti) {
			String statement = namespace + ".activityInsert1";
		return sqlSession.insert(statement, acti);	
		}
		
//1차 정보 2차 때 보여주기
		public ActivityDTO show1to2(ActivityDTO actiDTO) {
			String statement = namespace + ".activityShowInfo";
			System.out.println("접근");
			System.out.println("접근_Repository_show1to2");
			System.out.println("접근");
			System.out.println("접근");
			System.out.println("접근");			
		return sqlSession.selectOne(statement, actiDTO);
		}

		
		public Integer activityInsert2(ActivityDTO acti) {
				System.out.println(acti.getActivityNum());
			String statement = namespace + ".activityInsert2";
		return sqlSession.insert(statement, acti);
		}
		
//memNum값 찾아요
		public ActivityDTO prpr(String memNum) {		
			System.out.println(memNum);
			System.out.println(memNum);
			System.out.println("접근memNum_activityRepository");
			System.out.println("접근");
			System.out.println("접근");
			System.out.println("접근");
			System.out.println("접근");
			System.out.println("접근");
			ActivityDTO actiDTO = new ActivityDTO();
			actiDTO.setMemNum(memNum);
			String statement = namespace + ".prpr";
		return sqlSession.selectOne(statement, actiDTO);
		}
		
		

		
//활동 목록
		public List<ActivityDTO> activityList() {
			String statement = namespace + ".activityList";
			ActivityDTO acti = new ActivityDTO();
		return sqlSession.selectList(statement, acti);
		}

		
//상세보기
		public ActivityDTO activityDetail(ActivityDTO acti) {
				System.out.println("활동넘값 : " + acti.getActivityNum());
				System.out.println("접근");
				System.out.println("접근_Repository_activityDetail");
				System.out.println("접근");
				System.out.println("접근");
				System.out.println("접근");
				
			String statement = namespace + ".activityDetail";
		return sqlSession.selectOne(statement, acti);
		}		
		
		
		
//프로필 !@!!
		public ActivityDTO activityProfile(ActivityDTO acti) {
				System.out.println("접급_myProfileRepository");
				System.out.println("접근 넘값 : " + acti.getMemNum() );
				System.out.println("접근 " + acti.getMemNum() );
				System.out.println("접근 " + acti.getMemNum( ));
			String statement = namespace + ".activityProfile";
		return sqlSession.selectOne(statement, acti);
		}

		public ActivityDTO whetherAvailability(ActivityDTO acti) {
				System.out.println("접근_whetherAvailability");
				System.out.println("접근 넘값 : " + acti.getMemNum() );
				System.out.println("접근 " + acti.getMemNum() );
				System.out.println("접근 " + acti.getMemNum( ));
				
			String statement = namespace + ".whetherAvailability";			
		return sqlSession.selectOne(statement, acti);
		}

		public ActivityDTO forToCheck(ActivityDTO acti) {
			String statement = namespace + ".forToCheck";
		return sqlSession.selectOne(statement, acti);
		}

		
		
//메인 
		public List<ActivityDTO> actiList(ActivityDTO acti) {
		
			String statement = namespace + ".ListOfActivity";
		return sqlSession.selectList(statement, acti);
		}


		
		
		
		
		
		
}
