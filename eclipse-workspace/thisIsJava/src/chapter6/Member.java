package chapter6;

public class Member {

	//필
	String name;
	String id;
	private String password;
	int age;
	
	
	//생
	public Member() {
		
	}
	
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	
	
	//메
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	void login(String id, String password) {
		
	}
	
}
