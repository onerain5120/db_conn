package chapter7;

public class Q12_Test {

	public static void action(Q12_A a) {
		a.method1();
		if(a instanceof Q12_C c) {
			c.method2();
		}
	}
	
	
	public static void main(String[] args) {
		
//		Q12_A a = new Q12_A();
//		a.method1();
//		
//		Q12_A b = new Q12_B();
//		b.method1();
//		
//		Q12_A c = new Q12_C();
//		c.method1();
		
		action(new Q12_A());
		action(new Q12_B());
		action(new Q12_C());
	}
}
