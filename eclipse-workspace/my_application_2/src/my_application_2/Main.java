package my_application_2;

import pack1.A;
//import pack2.B;
import pack3.C;
import pack4.D;

public class Main {
	
	public static void main(String[] args) {
		
		A a = new A();
		a.method();
		
//		B b = new B();
//		b.method();
		
		
		C c = new C();
		c.method();
		
		C cobj = a.getC();
		cobj.method();
		
		
	}

}
