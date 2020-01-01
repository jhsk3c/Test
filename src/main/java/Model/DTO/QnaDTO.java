package Model.DTO;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class QnaDTO implements Serializable{ //implements Serializable 는 스프링과 마이바티스할때 필요하다 직렬화시켜주는것이다.
	
	private Long qnaBoardNum; //글번호
	private String memNum; //회원번호
	private String qnaBoardSubject; //글제목
	private String qnaBoardContent; //글 내용
	private String qnaBoardOriginalFileName; //오리지날 파일이름
	private String qnaBoardStoryFileName; // 스토리 파일 이름
	private String qnaClassiFication; // 분류 
	private String qnaFileSize; // 파일 사이즈
	private Long qnaBoardReRef; 
	private Long qnaBoardReLev; 
	private Long qnaBoardReSeq;
	private Timestamp qnaRegist; //현재시간
	private String qnaAnswerCheck; //답변여부 
	public Long getQnaBoardNum() {
		return qnaBoardNum;
	}
	public void setQnaBoardNum(Long qnaBoardNum) {
		this.qnaBoardNum = qnaBoardNum;
	}
	public String getMemNum() {
		return memNum;
	}
	public void setMemNum(String memNum) {
		this.memNum = memNum;
	}
	public String getQnaBoardSubject() {
		return qnaBoardSubject;
	}
	public void setQnaBoardSubject(String qnaBoardSubject) {
		this.qnaBoardSubject = qnaBoardSubject;
	}
	public String getQnaBoardContent() {
		return qnaBoardContent;
	}
	public void setQnaBoardContent(String qnaBoardContent) {
		this.qnaBoardContent = qnaBoardContent;
	}
	public String getQnaBoardOriginalFileName() {
		return qnaBoardOriginalFileName;
	}
	public void setQnaBoardOriginalFileName(String qnaBoardOriginalFileName) {
		this.qnaBoardOriginalFileName = qnaBoardOriginalFileName;
	}
	public String getQnaBoardStoryFileName() {
		return qnaBoardStoryFileName;
	}
	public void setQnaBoardStoryFileName(String qnaBoardStoryFileName) {
		this.qnaBoardStoryFileName = qnaBoardStoryFileName;
	}
	public String getQnaClassiFication() {
		return qnaClassiFication;
	}
	public void setQnaClassiFication(String qnaClassiFication) {
		this.qnaClassiFication = qnaClassiFication;
	}
	public String getQnaFileSize() {
		return qnaFileSize;
	}
	public void setQnaFileSize(String qnaFileSize) {
		this.qnaFileSize = qnaFileSize;
	}
	public Long getQnaBoardReRef() {
		return qnaBoardReRef;
	}
	public void setQnaBoardReRef(Long qnaBoardReRef) {
		this.qnaBoardReRef = qnaBoardReRef;
	}
	public Long getQnaBoardReLev() {
		return qnaBoardReLev;
	}
	public void setQnaBoardReLev(Long qnaBoardReLev) {
		this.qnaBoardReLev = qnaBoardReLev;
	}
	public Long getQnaBoardReSeq() {
		return qnaBoardReSeq;
	}
	public void setQnaBoardReSeq(Long qnaBoardReSeq) {
		this.qnaBoardReSeq = qnaBoardReSeq;
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
