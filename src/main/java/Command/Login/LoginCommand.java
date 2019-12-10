package Command.Login;

public class LoginCommand {

	private String memId;
	private boolean inputIdStore;
	private String memPw;
	
	

	public String getMemPw() {
		return memPw;
	}
	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public boolean getInputIdStore() {
		return inputIdStore;
	}
	public void setInputIdStore(boolean inputIdStore) {
		this.inputIdStore = inputIdStore;
	}
}
