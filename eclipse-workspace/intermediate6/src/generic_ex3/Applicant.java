package generic_ex3;

public class Applicant<T> {

	// 지원자 종류가 kind
	// 지원자 종류의 타입이 어떤지 모른 상태임, 
	// 거기에는 Person 타입 및 Person의 자식 클래스인(Worker, Student, HighStudent, MiddleStudent) 
	// 으로 들어갈 수 있게 하고자 함
	
	
	// 필
	public T kind;  // T 타입의 변수 kind
	
	
	
	
	
	
	// 생
	public Applicant() {  // 기본 생성자
		
	}
	
	public Applicant(T kind) {  // 필드로 만든 생성자, setter 같은 역할임
		this.kind = kind;
	}
	
	
	
	
	// 메
	
}


