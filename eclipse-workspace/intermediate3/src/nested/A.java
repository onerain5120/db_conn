package nested;

public class A {

	// 필
	// 생
	


	
	
	// 인스턴스멤버클래스 : A 객체를 생성해야만 AA 객체를 만들 수 있다.
	class AA{
		
	}
	
	// 정적 멤버 클래스 : A 객체를 생성하지 않아도 AA 객체를 만들 수 있다.
	static class AAA {
		
		
		
	}
	
	
	//메
	
	void method() {  // 메서드 안의 영역을 local이라고 함.
		
		// 로컬 클래스 : B 객체를 생성하고자 하려면, method가 실행되어야 함. (method()가 실행할 때만 B 객체를 생성할 수 있음)
		class AAAA {
			
		}
	}
	
	
}
