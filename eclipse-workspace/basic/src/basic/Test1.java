package basic;

public class Test1 {
	public static void main(String args[]) {
		int a = 1;
		int b = 1;
		int c = 2;
		
		System.out.println(a == b);  // == 주소값이 같은가?
		System.out.println(a == c);
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));
		
		System.out.println("----------------------------------");
		
		System.out.println();
	
	}
}



