package Repository.Activity;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DTO.Activity.ActivityStoreDTO;

@Repository
public class StoreRepository {
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace ="actiMapper";

	
	
	public List<ActivityStoreDTO> storeList(ActivityStoreDTO storeDTO) {
			System.out.println("접근");
			System.out.println("접근_Repository_storeList");
			System.out.println("접근");
			System.out.println("접근");
		
		String statement = namespace + ".storeList";
	return sqlSession.selectList(statement, storeDTO);		
	}

//찾으려고 하는 상점 
	public List<ActivityStoreDTO> searchCity(ActivityStoreDTO storeDTO) {
			System.out.println("접근");
			System.out.println("접근_Repository_searchCity");
			System.out.println("접근");
			System.out.println("접근");
			System.out.println("접근");
			System.out.println("접근");
			System.out.println("상점 지역 : " + storeDTO.getStoreLoc1());
			
		String statement = namespace + ".searchCity";
	return sqlSession.selectList(statement, storeDTO);
	}
	
	
	
}
