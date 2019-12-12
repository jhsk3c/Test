package Model.DTO;

public class AuthInfo {
	private String Id;
	private String Pw;
	private String Email;
	private String Name;
	
	
	
	public AuthInfo( String id, String pw, String email, String name) {
		super();
		Id = id;
		Pw = pw;
		Email = email;
		Name = name;
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
