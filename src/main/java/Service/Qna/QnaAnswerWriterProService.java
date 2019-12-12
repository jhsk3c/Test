package Service.Qna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.Qna.QnaAnswerReplyCommand;
import Model.DTO.QnaDTO;
import Repository.Qna.QnaRepository;

@Service
public class QnaAnswerWriterProService {
	@Autowired
	QnaRepository qnaRepository;

	public void answerReplyPro(QnaAnswerReplyCommand qnaAnswerReplyCommand) {
		
		QnaDTO qna = new QnaDTO();
		
		qna.setQnaBoardNum(Long.valueOf(qnaAnswerReplyCommand.getQnaBoardNum()));
		System.out.println(qna.getQnaBoardNum());
		qna.setQnaBoardReRef(Long.valueOf(qnaAnswerReplyCommand.getQnaBoardReRef()));
		System.out.println(qna.getQnaBoardReRef());
		qna.setQnaBoardReLev(Long.valueOf(qnaAnswerReplyCommand.getQnaBoardReLev()));
		System.out.println(qna.getQnaBoardReLev());
		qna.setQnaBoardReSeq(Long.valueOf(qnaAnswerReplyCommand.getQnaBoardReSeq()));
		System.out.println(qna.getQnaBoardReSeq());
		qna.setQnaBoardSubject(qnaAnswerReplyCommand.getQnaCommand().getQnaSubject());
		System.out.println(qna.getQnaBoardSubject());
		qna.setQnaBoardContent(qnaAnswerReplyCommand.getQnaCommand().getQnaContent());
		System.out.println(qna.getQnaBoardContent());
		qna.setQnaClassiFication(qnaAnswerReplyCommand.getQnaCommand().getQnaClassiFication());
		System.out.println(qna.getQnaClassiFication());
		Integer result = qnaRepository.qnAnswerReplyUpdate(qna);
		if(result > 0) {
			System.out.println("등록");
		}else {
			System.out.println("실패");
		}
		qnaRepository.qnaAnswerReplyInsert(qna);
		
		
		
	}
}
