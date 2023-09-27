package basic;

public class StringClassEx {

	public static void main(String[] args) {
//		String st1 = "hi";
		
		
		// 1)
		System.out.println(System.identityHashCode(new String()));
		System.out.println("----------------------");

		// 2)
		String st1;
		st1 = new String();
		System.out.println(System.identityHashCode(st1));
		System.out.printf("[%s]", st1);
		System.out.println("----------------------");
		
		// 3)
		String st2 = new String("apple");
		System.out.println(System.identityHashCode(st2));

		String st3 = new String("apple");
		System.out.println(System.identityHashCode(st3));
		
		System.out.println(st2 == st3);
		// 단순히 == 연산자는 값이 아닌 주소가 같은 지를 판단함
		System.out.println(st2.equals(st3));
		// 그러므로 문자열에서는 값이 같은지를 확인해야하므로 equals()무조건 사용
	}

}
