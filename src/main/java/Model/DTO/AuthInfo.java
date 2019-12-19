package Model.DTO;

public class AuthInfo {
	private String num;
	private String Id;
	private String Pw;
	private String Email;
	private String Name;
	private Integer memLev;

	public AuthInfo() {
	}

	public AuthInfo(String num, String Id, String Email, String Name, String Pw, Integer memLev) {
		super();
		this.num = num;
		this.Id = Id;
		this.Email = Email;
		this.Name = Name;
		this.Pw = Pw;
		this.memLev = memLev;
	}
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
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
	
	public Integer getMemLev() {
		return memLev;
	}

	public void setMemLev(Integer memLev) {
		this.memLev = memLev;
	}

}
