package Service.CarPayment;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

import Command.CarPayment.CarPaymentCommand;
import Model.DTO.CarPaymentDTO;

@Service
public class CarPaymentInsertService {
	
	public void carPaymentInsertPro(CarPaymentCommand carPaymentCommand) {
		
		try {
				CarPaymentDTO carPaymentDTO = new CarPaymentDTO();
				
				
				
				SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
				Date date = (Date) dt.parse(carPaymentCommand.getCardExpirationDate());
				Timestamp CardExpirationDate = new Timestamp(date.getTime());
				carPaymentDTO.setCardExpirationDate(CardExpirationDate);
				carPaymentDTO.setCardNumber(carPaymentCommand.getCardNumber());
				carPaymentDTO.setCardSelection(carPaymentCommand.getCardSelection());
				carPaymentDTO.setCarPrice(Integer.parseInt(carPaymentCommand.getCarPrice()));

			}catch (Exception e) {
			// TODO: handle exception
				e.printStackTrace();
		}

	
	}

}
