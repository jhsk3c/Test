package Repository.CarPay;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.CarJoinDTO;

@Repository
public class CarPayRepository {
	
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "Repository.CarPay.CarPayMapper";
	
	public CarJoinDTO payInfoSelect(Integer calendarNumber) {
		String statement = namespace + ".payInfoSelect";
		return sqlSession.selectOne(statement,calendarNumber);
	}
}
