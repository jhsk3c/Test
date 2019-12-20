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

	public void approvalUpdate(String driveNum, String memNum, Integer carApproval, String carImage,
			String driveLicense, String driveInsurance, String driveCarcheck, HttpServletRequest request) {
		CarDTO carDTO = new CarDTO();
		carDTO.setDriveNum(Long.parseLong(driveNum));
		carDTO.setCarApproval(carApproval);
		carRepository.approvalUpdate(carDTO); // 승인여부
		if (carDTO.getCarApproval() == 1) {
			carDTO.setMemNum(memNum);
			carRepository.memLevUpdate(carDTO);
		} else {
			carDTO.setMemNum(memNum);
			carDTO.setDriveNum(Long.parseLong(driveNum));
			System.out.println(carImage);
			String path = request.getServletContext().getRealPath("/");
			path += "WEB-INF/view/Car/upload/";
			File file = new File(path + carImage.split("-"));
			if (file.exists()) {
				file.delete();
			}
			String path1 = request.getServletContext().getRealPath("/");
			path1 += "WEB-INF/view/Car/upload/";
			File file1 = new File(path1 + driveLicense.split("-"));
			if (file1.exists()) {
				file1.delete();
			}
			String path2 = request.getServletContext().getRealPath("/");
			path2 += "WEB-INF/view/Car/upload/";
			File file2 = new File(path2 + driveInsurance.split("-"));
			if (file2.exists()) {
				file2.delete();
			}
			String path3 = request.getServletContext().getRealPath("/");
			path3 += "WEB-INF/view/Car/upload/";
			File file3 = new File(path3 + driveCarcheck.split("-"));
			if (file3.exists()) {
				file3.delete();
			}
			System.out.println("file3 Name" + file3);
			carRepository.carDriveInfoDelete(carDTO);
			carRepository.carInfoDelete(carDTO);
		}

	}
}
