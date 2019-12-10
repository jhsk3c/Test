package Command.Login;

public class ComLoginCommand {
	
	private String comId;
	private boolean inputIdStore;
	private String comPw;
	
	

	public String getComId() {
		return comId;
	}
	public void setComId(String comId) {
		this.comId = comId;
	}
	public String getComPw() {
		return comPw;
	}
	public void setComPw(String comPw) {
		this.comPw = comPw;
	}
	
	public boolean getInputIdStore() {
		return inputIdStore;
	}
	public void setInputIdStore(boolean inputIdStore) {
		this.inputIdStore = inputIdStore;
	}
}
