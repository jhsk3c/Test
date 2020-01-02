package Service.Qna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import Model.DTO.QnaDTO;
import Repository.Qna.QnaRepository;

@Service
public class QnaDetailService {
	
	@Autowired
	QnaRepository qnaRepository;
	
	@Transactional
	public void qnaDetail(Model model,Long num) {
		
		
		QnaDTO qna = new QnaDTO(); //유저 상세정보
		qna.setQnaBoardNum(num);
		
		 qna = qnaRepository.oneSelect(qna);
		
		qna.setQnaBoardContent(qna.getQnaBoardContent().replace("\n", "<br />")); 
		if(qna.getQnaBoardOriginalFileName() != null) {
			String [] original = qna.getQnaBoardOriginalFileName().split("-");
			String [] store = qna.getQnaBoardStoryFileName().split("-");
			System.out.println(store[0]);
			String [] fileSize = qna.getQnaFileSize().split("-");
			
			model.addAttribute("original",original);
			model.addAttribute("store", store);
			model.addAttribute("fileSize", fileSize);
			
		}
		model.addAttribute("qna", qna);
		//--------------------------------------------------------------------------------------
		
		if(!qna.getQnaAnswerCheck().equals("문의 접수")) {
			QnaDTO qnaAdmin = new QnaDTO(); //관리자 답변
			System.out.println(qnaAdmin.getQnaBoardContent());
			qnaAdmin.setQnaBoardNum(num);
			/*
			 * qnaAdmin.setUserId("관리자"); //답변글쓸때는 우선 관리자라고 작성할것. 세션 줄때는 세션값 관리자용 쓰기
			 */			qnaAdmin = qnaRepository.oneSelectAdmin(qnaAdmin);
			
			qnaAdmin.setQnaBoardContent(qnaAdmin.getQnaBoardContent().replace("\n", "<br />"));
			
			
			model.addAttribute("qnaAdmin", qnaAdmin);
		}
		
	}
}
