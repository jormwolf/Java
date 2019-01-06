package entity;

public class User {
	private int cno;
	private String user;
	private String passwd;
	
	public User(int cno, String user, String passwd) {
		super();
		this.cno = cno;
		this.user = user;
		this.passwd = passwd;
	}
	
	public User() {
		super();
	}
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	
	@Override
	public String toString() {
		return "User [cno=" + cno + ", user=" + user + ", passwd=" + passwd + "]";
	}
	

	
}
