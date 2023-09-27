package nested2;

public class A {

	// A의 인스턴스 필드 값으로 B 객체 대입
//	B field = new B();
	
	
	
	// 생
	public A() {
//		B b = new B();
	}
	
	
	// 인스턴스 멤버 클래스
	class B {
		
		int num1 = 3;
		
		// 인스턴스 멤버 클래스 안에서 정적 필드 허용(자바 17부터 허용)
		static int num2 = 2;
		
		public B() {
			System.out.println("여기는 B()기본 생성자");
		}
		
		void bMethod() {
			System.out.println("여기는 bMethod()야");
		}
		
		static void bstaticMethod() {
			System.out.println("여기는 bstaticMethod()야");
		}
	}
	
	
	// 메
	void method() {
		B b = new B();
		System.out.println(b.num1);
		b.bMethod();
		
		System.out.println(B.num2);
		B.bstaticMethod();
	}
	
	
}


