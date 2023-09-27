package pack1;

import pack2.B;
import pack3.C;

public class A {

	public void method() {
		System.out.println("A-m");
		
		
	// B 클래스 사용
		
		B b = new B();
		b.method();
	
	
	
	
	}
	
	
	public C getC() {
		C c = new C();
		return c;
	}
	
}
