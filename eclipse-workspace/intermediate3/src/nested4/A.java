package nested4;

public class A {

	// 필
	
	
	
	
	// 생
	
	public A() {
		
		class B {}
		
	}
	
	
	
	// 메
	void method() {
		
		// 로컬 클래스
		class B {
			
			// 필
			int num1 = 1;
			static int num2 = 2;
			
			// 생
			public B() {
				System.out.println("이것은 B 기본 생성자");
			}
			
			// 메
			void m1() {System.out.println("B-m1");}
			static void m2() {System.out.println("B-m2");}
		}
		
		B b = new B();
		System.out.println(b.num1);
		System.out.println(B.num2);
		b.m1();
		B.m2();
		
	}
	
}
