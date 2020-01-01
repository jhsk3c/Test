package Command.Qna;

import java.sql.Timestamp;

import org.springframework.web.multipart.MultipartFile;


public class QnaCommand { //QanWriter에 인풋값들을 대입할 커맨드 

	private String qnaSubject; //제목
	private String qnaClassiFication; //분류
	private String qnaContent; //내용
	private MultipartFile [] qnaFileName; //파일이름
	private Timestamp qnaRegist; // 현재시간
	private String qnaAnswerCheck; //답변체크
	
	
	public String getQnaSubject() {
		return qnaSubject;
	}
	public void setQnaSubject(String qnaSubject) {
		this.qnaSubject = qnaSubject;
	}
	public String getQnaClassiFication() {
		return qnaClassiFication;
	}
	public void setQnaClassiFication(String qnaClassiFication) {
		this.qnaClassiFication = qnaClassiFication;
	}
	public String getQnaContent() {
		return qnaContent;
	}
	public void setQnaContent(String qnaContent) {
		this.qnaContent = qnaContent;
	}
	public MultipartFile[] getQnaFileName() {
		return qnaFileName;
	}
	public void setQnaFileName(MultipartFile[] qnaFileName) {
		this.qnaFileName = qnaFileName;
	}
	public Timestamp getQnaRegist() {
		return qnaRegist;
	}
	public void setQnaRegist(Timestamp qnaRegist) {
		this.qnaRegist = qnaRegist;
	}
	public String getQnaAnswerCheck() {
		return qnaAnswerCheck;
	}
	public void setQnaAnswerCheck(String qnaAnswerCheck) {
		this.qnaAnswerCheck = qnaAnswerCheck;
	}
	
	
}
