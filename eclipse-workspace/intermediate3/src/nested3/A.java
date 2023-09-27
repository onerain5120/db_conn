package nested3;

public class A {

	
	
	static class B {
	
		// 필
		int field1 = 1;
		static int field2 = 2;
		
		// 생
		public B() {
			System.out.println("이것은 B 기본 생성자");
		}
		
		// 메
		void method1() {System.out.println("B-m1");}
		static void method2() {System.out.println("B-m2");}
	}
	
	
}
