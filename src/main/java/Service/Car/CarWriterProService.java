package Service.Car;

import java.io.File;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import Command.Car.CarWriterCommand;
import Model.DTO.AuthInfo;
import Model.DTO.CarDTO;
import Model.DTO.DriveInfoDTO;
import Repository.Car.CarRepository;

@Service
public class CarWriterProService { // 차 등록 서비스

	@Autowired
	CarRepository carRepository;
	// 파일 변수명 ---
	String driveLicenseOriginal = null;
	String driveLicenseFileExtension = null;
	String driveLicenseStore = null;
	String driveLicenseSize = null;

	String driveInsurance = null;
	String driveInsuranceFileExtension = null;
	String driveInsuranceStore = null;
	String driveInsuranceSize = null;

	String driveCarCheck = null;
	String driveCarCheckFileExtension = null;
	String driveCarCheckStore = null;
	String driveCarCheckSize = null;

	String carImage = null;
	String carImageFileExtension = null;
	String carImageStore = null;
	String carImageSize = null;

	// ------------------------------------------------

	public void carWriterPro(CarWriterCommand carWriterCommand, HttpServletRequest request, HttpSession session) {

		CarDTO car = new CarDTO(); // 차량 등록
		DriveInfoDTO driveInfoDTO = new DriveInfoDTO(); // 파일정보
		car.setMemNum(((AuthInfo) session.getAttribute("authInfo")).getNum());
		car.setDriveName(carWriterCommand.getDriveName());
		System.out.println(carWriterCommand.getDriveName());
		car.setDriveAge(carWriterCommand.getDriveAge());
		System.out.println(carWriterCommand.getDriveAge());
		car.setDriveLicenseInfo(carWriterCommand.getDriveLicenseInfo());
		System.out.println(carWriterCommand.getDriveLicenseInfo());
		car.setCarName(carWriterCommand.getCarName());
		System.out.println(carWriterCommand.getCarName());
		car.setCarNum(carWriterCommand.getCarNum());
		System.out.println(carWriterCommand.getCarNum());
		car.setCarSize(Long.valueOf(carWriterCommand.getCarSize()));
		System.out.println(carWriterCommand.getCarSize());
		car.setCarKinds(carWriterCommand.getCarKinds());
		System.out.println(carWriterCommand.getCarKinds());
		car.setCarContent(carWriterCommand.getCarContent());
		System.out.println(carWriterCommand.getCarContent());
		// 파일 dto에 넣기 ----------------------------------------
		String driveLicenseTotal = "";
		String driveLicenseStoreTotal = "";
		String driveLicenseSizeTotal = "";

		String driveInsuranceTotal = "";
		String driveInsuranceStoreTotal = "";
		String driveInsuranceSizeTotal = "";

		String driveCarCheckTotal = "";
		String driveCarCheckStoreTotal = "";
		String driveCarCheckSizeTotal = "";

		String carImageTotal = "";
		String carImageStoreTotal = "";
		String carImageSizeTotal = "";

		for (MultipartFile multiFile : carWriterCommand.getDriveLicense()) {
			driveLicenseOriginal = multiFile.getOriginalFilename();
			driveLicenseFileExtension = driveLicenseOriginal.substring(driveLicenseOriginal.lastIndexOf(".")); // 확장자
																												// 가져오기
			driveLicenseStore = UUID.randomUUID().toString().replaceAll("-", "") + driveLicenseFileExtension;
			driveLicenseSize = Long.toString(multiFile.getSize());

			driveLicenseTotal += driveLicenseOriginal + "-";
			driveLicenseStoreTotal += driveLicenseStore + "-";
			driveLicenseSizeTotal += driveLicenseSize + "-";

			String path = request.getServletContext().getRealPath("/");
			path += "WEB-INF/view/Car/upload/";
			System.out.println(path);
			File file = new File(path + driveLicenseStore);
			try {
				multiFile.transferTo(file);
			} catch (Exception e) {
				// TODO: handle exception
			}

			driveInfoDTO.setDriveLicense(driveLicenseTotal);
			driveInfoDTO.setDriveLicenseStore(driveLicenseStoreTotal);
			driveInfoDTO.setDriveLicenseSize(driveLicenseSizeTotal);
			System.out.println(carWriterCommand.getDriveLicense());
		}

		for (MultipartFile multiFile2 : carWriterCommand.getDriveInsurance()) {
			driveInsurance = multiFile2.getOriginalFilename();
			driveInsuranceFileExtension = driveInsurance.substring(driveInsurance.lastIndexOf(".")); // 확장자 가져오기
			driveInsuranceStore = UUID.randomUUID().toString().replaceAll("-", "") + driveInsuranceFileExtension;
			driveInsuranceSize = Long.toString(multiFile2.getSize());
			driveInsuranceTotal += driveInsurance + "-";
			driveInsuranceStoreTotal += driveInsuranceStore + "-";
			driveInsuranceSizeTotal += driveInsuranceSize + "-";

			String path2 = request.getServletContext().getRealPath("/");
			path2 += "WEB-INF/view/Car/upload/";
			System.out.println(path2);
			File file2 = new File(path2 + driveInsuranceStore);
			try {
				multiFile2.transferTo(file2);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		driveInfoDTO.setDriveInsurance(driveInsuranceTotal);
		driveInfoDTO.setDriveInsuranceStore(driveInsuranceStoreTotal);
		driveInfoDTO.setDriveInsuranceSize(driveInsuranceSizeTotal);
		System.out.println(carWriterCommand.getDriveInsurance());

		for (MultipartFile multiFile3 : carWriterCommand.getDriveCarCheck()) {
			driveCarCheck = multiFile3.getOriginalFilename();
			driveCarCheckFileExtension = driveCarCheck.substring(driveCarCheck.lastIndexOf(".")); // 확장자 가져오기
			driveCarCheckStore = UUID.randomUUID().toString().replaceAll("-", "") + driveCarCheckFileExtension;
			driveCarCheckSize = Long.toString(multiFile3.getSize());
			driveCarCheckTotal += driveCarCheck + "-";
			driveCarCheckStoreTotal += driveCarCheckStore + "-";
			driveCarCheckSizeTotal += driveCarCheckSize + "-";

			String path3 = request.getServletContext().getRealPath("/");
			path3 += "WEB-INF/view/Car/upload/";
			System.out.println(path3);
			File file3 = new File(path3 + driveCarCheckStore);
			try {
				multiFile3.transferTo(file3);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		driveInfoDTO.setDriveCarcheck(driveCarCheckTotal);
		driveInfoDTO.setDriveCarcheckStore(driveCarCheckStoreTotal);
		driveInfoDTO.setDriveCarcheckSize(driveCarCheckSizeTotal);
		System.out.println(carWriterCommand.getDriveCarCheck());

		for (MultipartFile multiFile4 : carWriterCommand.getCarImage()) {
			carImage = multiFile4.getOriginalFilename();
			carImageFileExtension = carImage.substring(carImage.lastIndexOf(".")); // 확장자 가져오기
			carImageStore = UUID.randomUUID().toString().replaceAll("-", "") + carImageFileExtension;
			carImageSize = Long.toString(multiFile4.getSize());
			carImageTotal += carImage + "-";
			carImageStoreTotal += carImageStore + "-";
			carImageSizeTotal += carImageSize + "-";
			String path4 = request.getServletContext().getRealPath("/");
			path4 += "WEB-INF/view/Car/upload/";
			System.out.println(path4);
			File file4 = new File(path4 + carImage);
			try {
				multiFile4.transferTo(file4);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		car.setCarImage(carImageTotal);
		car.setCarImageStore(carImageStoreTotal);
		car.setCarImageSize(carImageSizeTotal);
		System.out.println(carWriterCommand.getCarImage());
		// ----------------------------------------
		
			carRepository.carWriterInsert(car);
		
		
		car.setMemNum(((AuthInfo) session.getAttribute("authInfo")).getNum());
		System.out.println("멤버 넘 : " + car.getMemNum());
		 Long driveNum = carRepository.carOneDriveNumSelect(Long.parseLong(car.getMemNum()));
		System.out.println("드라이브넘 : " + driveNum);
		driveInfoDTO.setDriveNum(driveNum);
		carRepository.driveInfoInsert(driveInfoDTO);
	}

}
