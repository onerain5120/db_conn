package chapter6;

public class MemberService {

	//필
	String name;
	String id;
	private String password;
	int age;
	
	
	//생
	
	
	//메
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	boolean login(String id, String password) {

		if(id == "hong" && password == "12345") {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
	
	
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
	
	
}
