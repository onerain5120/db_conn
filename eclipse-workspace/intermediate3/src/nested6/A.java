package nested6;

public class A {

	String field = "A-field";
	
	void method() {
		System.out.println("A-m");
	}
	
	
	void useB() {
		B b = new B();
		b.print();
	}
	
	class B {
		String field = "B-field";
	
		void method() {
			System.out.println("B-m");
		}
		
		void print() {
//			System.out.println(field);
//			System.out.println(this.field);
			method();
			this.method();
			System.out.println("------------------");
//			System.out.println(A.this.field);
			A.this.method();
		}
		
		
	}
	
	
	
	
}
