package Service.Qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.Qna.QnaCommand;
import Model.DTO.QnaDTO;
import Repository.Qna.QnaRepository;

@Service
public class QnaListService {
	
	@Autowired 
	private QnaRepository qnaRepository;
	
	public String qnaAllSelect(QnaCommand qnaCommand, Model model) {
		
		List<QnaDTO> list = qnaRepository.allSelectQnaList(qnaCommand);
		
		model.addAttribute("qna",list);
		
		return "Qna/qnaList";
	}
	

}
