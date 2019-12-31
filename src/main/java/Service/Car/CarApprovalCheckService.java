package Service.Car;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Model.DTO.CarDTO;
import Repository.Car.CarRepository;

@Service
public class CarApprovalCheckService {

	@Autowired
	CarRepository carRepository;

	public void approvalUpdate(String driveNum, String memNum, Integer carApproval, HttpServletRequest request) {
		CarDTO carDTO = new CarDTO();
		carDTO.setMemNum(memNum);
		System.out.println("memNummemNummemNummemNummemNum"+memNum);
		carDTO.setDriveNum(Long.parseLong(driveNum));
		carDTO.setCarApproval(carApproval);
		carRepository.approvalUpdate(carDTO); // 승인여부
		if (carDTO.getCarApproval() == 1) {
			System.out.println("승인됫어어어어");
			carRepository.memLevUpdate(carDTO);
		} else { //관리자가 승인거부를 누를시 파일이 삭제
			System.out.println("제발제발 값이 들어가져라 " + carDTO.getDriveNum());
			System.out.println("멤버값이 들어와졋나?"+carDTO.getMemNum());
			carDTO = carRepository.driveFileOneSelect(carDTO);
			System.out.println("차이미지 들어가짐?" + carDTO.getCarImageStore());
			String [] fileStore = carDTO.getCarImageStore().split("-");
			for(String list : fileStore) {
				String fileDelete = list;
				String path = request.getServletContext().getRealPath("/");
				path += "WEB-INF/view/Car/upload/";
				File file = new File(path + fileDelete);
				if(file.exists()) {
					file.delete();
				}
				
			}
			String [] fileStore2 = carDTO.getDriveLicenseStore().split("-");
			for(String list2 : fileStore2) {
				String	fileDelete2 = list2;
				String path2 = request.getServletContext().getRealPath("/");
				path2 += "WEB-INF/view/Car/upload/";
				File file2 = new File(path2 + fileDelete2);
				if(file2.exists()) {
					file2.delete();
				}
			}
			String [] fileStore3 = carDTO.getDriveInsuranceStore().split("-");
			for(String list3 : fileStore3) {
				String	fileDelete3 = list3;
				String path3 = request.getServletContext().getRealPath("/");
				path3 += "WEB-INF/view/Car/upload/";
				File file3 = new File(path3 + fileDelete3);
				if(file3.exists()) {
					file3.delete();
				}
			}
			String [] fileStore4 = carDTO.getDriveCarcheckStore().split("-");
			for(String list4 : fileStore4) {
				String	fileDelete4 = list4;
				String path4 = request.getServletContext().getRealPath("/");
				path4 += "WEB-INF/view/Car/upload/";
				File file4 = new File(path4 + fileDelete4);
				if(file4.exists()) {
					file4.delete();
				}
			}
			//승인거부시 데이터 삭제.
			carRepository.carDriveInfoDelete(Long.parseLong(driveNum));
			carRepository.carInfoDelete(memNum);
		}
			
	}
}
