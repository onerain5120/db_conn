package base_ex;

public class ObjectEx {

	
	public static void main(String[] args) {
	
//		System.out.println(new Object());
//		System.out.println(new Object().toString());
	
		Object obj1 = new Object();
		System.out.println(obj1);
		System.out.println(obj1.toString());
	
		System.out.println("=================");
		Object obj2 = obj1;
		
		System.out.println(obj2);
		
		// Object의 equals()메서드는 비교 연산자인 ==과 동일한 결과 리턴
//		System.out.println(obj1.equals(obj2));
//		System.out.println(obj1 == obj2);
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		System.out.println("=================");
		
		// Object의 equals()	String equals() 관계
		// String은 equals() 메서드를 재정의해서 내부 문자열이 같은지를 비교함
		
//		String str1 = new String("hong");
//		String str2 = new String("hong");
//		
//		System.out.println(System.identityHashCode(str1));
//		System.out.println(System.identityHashCode(str2));
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//		
//		System.out.println(str1 == str2 );
//		
//		
//		
//		System.out.println(str1.equals(str2));
		
		
//		동등 객체임을 판단할 경우 hashCode()와 equals() 메서드를 같이 사용 
		
	}
	
	
}





