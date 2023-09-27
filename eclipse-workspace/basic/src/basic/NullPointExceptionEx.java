package basic;

public class NullPointExceptionEx {

	public static void main(String[] args) {
		
		String name = null;
		
		System.out.println(name);
		System.out.println(System.identityHashCode(name));
		
		System.out.println("------------------------");
		
		name="홍길동";
		
		System.out.println(name);
		System.out.println(System.identityHashCode(name));
		
		
		
	}

}
