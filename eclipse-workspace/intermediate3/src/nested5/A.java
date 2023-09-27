package nested5;

public class A {

	// 필
	int field1;
	static int field2;
	
	// 생
	
	// 메
	
	void method1() {}
	static void method2() {}
	
	
	
	// 인스턴스 멤버 클래스
	class B {
		// 필
		
		// 생
		
		// 메
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
		
	}
	
	// 정적(static) 멤버 클래스
	static class C {
		void method() {
//			field1 = 10; // 정적 멤버 클래스 내부에서는 바깥 클래스의 필드와 메소드를 사용할 때 제한이 따름
//			method1();
			
			field2 = 10;
			method2();
		}
		
	}
	
}
