package Model.DTO;

public class AuthInfo {
	private String Id;
	private String Pw;
	private String Email;
	private String Name;
	public AuthInfo() {}
	
	public AuthInfo(String Id, String Email, String Name, String Pw) {
			super();
			this.Id = Id;
			this.Email= Email;
			this.Name = Name;
			this.Pw = Pw;
	}
	
	
		
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getPw() {
		return Pw;
	}
	public void setPw(String pw) {
		Pw = pw;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
}
