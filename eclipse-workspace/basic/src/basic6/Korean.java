package basic6;

public class Korean {

	// final 필드에 초기값을 주는 방법 : 1. 필드 선언시에 초기값 대입, 2. 생성자에서 초기값 대입
	
	// 필(인,스, final)
	final String nation = "대한민국";
	final String ssn;
	String name;
	
	// 생(기본, 기본X)
	
	public Korean() {
		this.ssn = "";  // ssn은 final 필드이기 때문에 초기화를 시켜줘야 함
	}

	
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	
	
	
	
	
	// 메(인, 스)
	
	
	
}
