package Repository.CarCalendarReservation;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.CarCalendarJoinDTO;
import Model.DTO.CarCalendarReservationDTO;
import Model.DTO.CarJoinDTO;

@Repository
public class CarCalendarReservationRepository {
	
	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "Repository.CarCalendarReservation.CarCalendarReservationMapper";
	
	public void carCalendarReservationInsert(CarCalendarReservationDTO carCalendarReservationDTO) {
		
	 String statement = namespace + ".carCalendarReservationInsert";
	  sqlSession.insert(statement,carCalendarReservationDTO);
		
	}
	
	public Long calendarNumSelect(CarCalendarJoinDTO calendarJoinDTO) {
		
		 String statement = namespace + ".calendarNumSelect";
		 
			return sqlSession.selectOne(statement, calendarJoinDTO); 
		}
	
	public CarCalendarJoinDTO carNameSelect(CarCalendarJoinDTO carCalendarJoinDTO) {
		
		 String statement = namespace + ".carNameSelect";
		  
		 return sqlSession.selectOne(statement,carCalendarJoinDTO);	
		}
	
	public List<CarJoinDTO> selectCarReservationList(CarJoinDTO carJoinDTO) {
		
		 String statement = namespace + ".selectCarReservationList";
		  
		 return sqlSession.selectList(statement,carJoinDTO);	
		}
	
	public CarJoinDTO carCalendarReservationOneSelect(Integer calenderReservationNum) {
		
		 String statement = namespace + ".carCalendarReservationOneSelect";
		 
		 return  sqlSession.selectOne(statement, calenderReservationNum); 
		}
	
	

}
