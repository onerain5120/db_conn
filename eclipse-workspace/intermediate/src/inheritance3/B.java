package inheritance3;

public class B {

	
	// 필
	A a = new A();
	
	
	
	
	// 생
//	public B() {
//		A a1 = new A();
//	}
	
	
	// 메
	public void method() {
		A a2 = new A();
		
		a.field = "hi";
		a.pMethod();
	}
}
