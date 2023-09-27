package nested2;

public class ATest {

	public static void main(String[] args) {
		
		A a = new A();
		
		A.B b = a.new B();
		
		A apple = new A();
		
		A.B banana = a.new B();

		b.num1 = 4;
		
		System.out.println(b.num1);
		
		b.bMethod();
		
		System.out.println(b.num2);
		
		
		System.out.println(A.B.num2);
		
		b.bstaticMethod();
		
		A.B.bstaticMethod();
	}
}
