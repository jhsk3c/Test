package Repository.Car;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Command.Car.CarWriterCommand;
import Command.Qna.QnaCommand;
import Model.DTO.CarDTO;
import Model.DTO.DriveInfoDTO;
import Model.DTO.QnaDTO;

@Repository
public class CarRepository {

	@Autowired
	private SqlSession sqlSession;
	private final String namespace = "Repository.Car.CarWriterMapper";
	
	public Integer carMemNumCheck(CarDTO car) { //차등록 중복 방지  회원넘버 찾기.
		
		Integer i = null;
		
	 String statement = namespace + ".carMemNumCheckOneSelect";
		i = sqlSession.selectOne(statement,car);
		return i;
	}
	
	
	public Integer carWriterInsert(CarDTO car) { //차등록
		
		Integer i = null;
		
	 String statement = namespace + ".insertCarWriter";
		i = sqlSession.insert(statement,car);
		return i;
	}
	
	public Integer driveInfoInsert(DriveInfoDTO driveInfoDTO) { //차등록한사람 파일 등록
		
		Integer result = null;
		String statement = namespace + ".insertdriveInfo";
		result  = sqlSession.insert(statement,driveInfoDTO);
		return result;
	}
	
	public Long carOneDriveNumSelect(Long memNum) {
		
		String statement = namespace + ".OneSelectCarDriveNum";
		Long  driveNum = sqlSession.selectOne(statement,memNum);
		return driveNum;
	}
	
	public List<CarDTO> carEnrollmentAllSelect(CarWriterCommand carWriterCommand) { //car 등록서  리스트
		
		String statement = namespace + ".allSelectCarEnrollmentList";
		 
		return sqlSession.selectList(statement,carWriterCommand); 
	}
	
	public List<CarDTO> carEnrollmentAllSelectAdmin(CarWriterCommand carWriterCommand) { //car 등록서  리스트
		
		String statement = namespace + ".allSelectCarEnrollmentListAdmin";
		 
		return sqlSession.selectList(statement,carWriterCommand); 
	}
	
	
	public CarDTO carDetailOneSelect(Integer driveNum ) {
		
		String statement = namespace + ".carDetailOneSelect";
		
		return  sqlSession.selectOne(statement,driveNum ); 
	}
	
	public void approvalUpdate(CarDTO carDTO) {
		
		String statement = namespace + ".approvalUpdate";
		 sqlSession.update(statement,carDTO);
	}
	
	public void memLevUpdate(CarDTO carDTO) {
		
		String statement = namespace + ".memLevUpdate"; //회원 등업
		 sqlSession.update(statement,carDTO);
	}
	
	public void carModifyUpdate(CarDTO carDTO) {
		
		String statement = namespace + ".carModifyUpdate";
		 sqlSession.update(statement,carDTO);
	}
	
	public void driveInfoInUpdate(DriveInfoDTO driveInfoDTO) {
		
		String statement = namespace + ".driveInfoInUpdate";
		 sqlSession.update(statement,driveInfoDTO);
	}
	
	public void carInfoDelete(CarDTO carDTO) {
		
		String statement = namespace + ".cardriveInfoDelete";
		sqlSession.delete(statement,carDTO);
	
	}
	
	public void carDriveInfoDelete(CarDTO carDTO) {
		
		String statement = namespace + ".driveInfoDelete";
		sqlSession.delete(statement,carDTO);
	
	}
	
	
	
}
