package Controller.QnA;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Qna.QnaAnswerReplyCommand;
import Command.Qna.QnaCommand;
import Service.Qna.QanAnswerService;
import Service.Qna.QnaAnswerWriterProService;
import Service.Qna.QnaDetailService;
import Service.Qna.QnaListService;
import Service.Qna.QnaWriterProService;



@Controller
public class QnAController {
	
	@Autowired
	QnaWriterProService qnaWriterProService; // 글작성 서비스이다 .
	@Autowired
	QnaListService qnaListService; //데이터베이스 글 목록 보기  서비스 
	
	@Autowired
	QnaDetailService qnaDetailService; // 데이터베이스 문의 게시판 상세보기 서비스 
	
	@Autowired
	QanAnswerService qanAnswerService; //질문 할것을 답변하기 위해 불러오는  서비스
	
	@Autowired
	QnaAnswerWriterProService qnaAnswerWriterProService; //답변 작성 서비스
	
	@RequestMapping("/QnA/qnaList")
	public String qnaList(QnaCommand qnaCommand , Model model) { //1;1문의 qna 리스트 이동
		qnaListService.qnaAllSelect(qnaCommand,model);
		
		return "Qna/qnaList";
	}
	
	@RequestMapping("/QnA/qnaWriter") 
	public String qnaWrite(QnaCommand qnaCommand) { // 1;1문의 글작성 이동
		return "Qna/qnaWriter";
	}
	
	@RequestMapping("/QnA/qnaWriterPro")
	public String qnaWriteAction(QnaCommand qnaCommand ,HttpServletRequest request, HttpSession session ) { // 1;1문의 글 작성 서비스 컨트롤 작동.
	
		qnaWriterProService.qnaWriterPro(qnaCommand,request,session); //글작성 서비스
		
		return "redirect:/QnA/qnaList";
	}
	
	@RequestMapping("/QnA/qnaDetail") 
	public String qnaDetail(@RequestParam(value="num") Long num , Model model) { // 1;1문의 상세정보
		qnaDetailService.qnaDetail(model,num);
		return "Qna/qnaDetail";
	}
	
	@RequestMapping("/QnA/qnaBoardReply")  
	public String qnaBoardReply(@RequestParam(value="num") Long num , Model model) {		//1:1 문의 답변 페이지 이동
	
		 qanAnswerService.qnaAnswer(num,model);
		
		return "Qna/qnaAnswerWriter";
	}
	@RequestMapping("/QnA/qnaAnswerWriterPro")
	public String qnaAnswerWriterPro(QnaAnswerReplyCommand qnaAnswerReplyCommand) {		//1:1 문의 답변 작성
		
		 qnaAnswerWriterProService.answerReplyPro(qnaAnswerReplyCommand); 
		
		return "redirect:/QnA/qnaList";
	}


}
