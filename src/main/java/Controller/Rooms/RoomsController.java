package Controller.Rooms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoomsController {

	@RequestMapping("/Romms/rommsList")
	public String RommsList() {
		return "Romms/rommsList";
	}
}
