package inheritance6;

public class A {

	public static void main(String[] args) {
		
		
		
		A a = new A();
		System.out.println(a instanceof A);
		
		B b = new B();
		
		System.out.println(b instanceof B);
//		System.out.println(b instanceof A);
		
		
//		System.out.println(b instanceof A);
	}
}

