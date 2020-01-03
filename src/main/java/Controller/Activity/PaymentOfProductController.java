package Controller.Activity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PaymentOfProductController {
	


	@ModelAttribute("amountOfProduct")
	protected List<Integer> referData2() throws Exception {
		List<Integer> amountOfProduct = new ArrayList<Integer>();
		amountOfProduct.add(1);
		amountOfProduct.add(2);
		amountOfProduct.add(3);
		amountOfProduct.add(4);
		amountOfProduct.add(5);
		amountOfProduct.add(6);
		amountOfProduct.add(7);
		amountOfProduct.add(8);
		amountOfProduct.add(9);
		amountOfProduct.add(10);
		return amountOfProduct;
	}
	
	
	
}
