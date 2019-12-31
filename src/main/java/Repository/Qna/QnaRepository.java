package Repository.Qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Command.Qna.QnaCommand;
import Model.DTO.QnaDTO;

@Repository
public class QnaRepository {
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "Repository.Qna.QnaMapper";
	
	public Integer qnaInsert(QnaDTO qna) { //qna 문의 게시판 글 등록
		
		Integer result = null;
		String statement = namespace + ".insertQna";
		result = sqlSession.insert(statement,qna);
		return result;
	}
	
	public List<QnaDTO> allSelectQnaList(QnaCommand qnaCommand) { //qna 문의 게시판 리스트
		
		String statement = namespace + ".allSelectQna";
		 
		return sqlSession.selectList(statement,qnaCommand); 
	}
	
	public QnaDTO oneSelect(QnaDTO qna) { //qna 상세보기 
		
		String statement = namespace + ".oneSelectQna";
		
		return sqlSession.selectOne(statement,qna);
	}
	public QnaDTO oneSelectAdmin(QnaDTO qna) { //관리자 상세보기
		
		String statement = namespace + ".oneSelectQnaAdmin";
		
		return sqlSession.selectOne(statement,qna);
	}
	
	public Integer qnAnswerReplyUpdate(QnaDTO qna) {
		Integer result = null;
		String statement = namespace + ".answerReplyUpdateQna";
		result = sqlSession.update(statement,qna);
		return result;
	}
	
	public Integer qnaAnswerReplyInsert(QnaDTO qna) { //답변글 작성
		Integer result = null;
		System.out.println("확인1");
		String statement = namespace + ".answerReplyinsertQna";
		System.out.println("확인2");
		result = sqlSession.insert(statement,qna);
		System.out.println("제목"+qna.getQnaBoardSubject());
		return result;
	}


}
