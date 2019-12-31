package Command.Qna;

public class QnaAnswerReplyCommand {
	
	private QnaCommand qnaCommand;
	private String qnaBoardNum;
	private String qnaBoardReRef;
	private String qnaBoardReLev;
	private String qnaBoardReSeq;
	
	public QnaAnswerReplyCommand() {
		qnaCommand = new QnaCommand();
	}
	
	public QnaCommand getQnaCommand() {
		return qnaCommand;
	}
	public void setQnaCommand(QnaCommand qnaCommand) {
		this.qnaCommand = qnaCommand;
	}
	public String getQnaBoardNum() {
		return qnaBoardNum;
	}
	public void setQnaBoardNum(String qnaBoardNum) {
		this.qnaBoardNum = qnaBoardNum;
	}
	public String getQnaBoardReRef() {
		return qnaBoardReRef;
	}
	public void setQnaBoardReRef(String qnaBoardReRef) {
		this.qnaBoardReRef = qnaBoardReRef;
	}
	public String getQnaBoardReLev() {
		return qnaBoardReLev;
	}
	public void setQnaBoardReLev(String qnaBoardReLev) {
		this.qnaBoardReLev = qnaBoardReLev;
	}
	public String getQnaBoardReSeq() {
		return qnaBoardReSeq;
	}
	public void setQnaBoardReSeq(String qnaBoardReSeq) {
		this.qnaBoardReSeq = qnaBoardReSeq;
	}
	
}
