package ex;

import java.sql.Date;

public class MemberVO {

	// 필(id, pwd, name, email, joinDate)
	//
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String joinDate;

	
	
	// 생
	
	// 메
	// GetterSetter메서드
	
	
	// id에 대한 Getter(id를 접근하게 하는 메서드)  // 메서드 get필드명(필드명 첫글자 대문자)
	
	public String getId() {
		return id;
	}
	
	
	// id에 대한 Setter(id 값을 접근하게 하는 메서드)  // 메서드 set필드명(필드명 첫글자 대문자)
	
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getPwd() {
		return pwd;
	}
	
//	public void setId(String pwd) {
//		this.pwd = pwd;
//	}
	
	public String getName() {
		return name;
	}
	
//	public void setId(String name) {
//		this.name = name;
//	}
	
	public String getEmail() {
		return email;
	}
	
//	public void setId(String email) {
//		this.email = email;
//	}
	
	public String getJoinDate() {
		return joinDate;
	}
	
//	public void setId(String joinDate) {
//		this.joinDate = joinDate;
//	}
	
	
}



