package basic3;

public class CustomerTest {

	public static void main(String[] args) {
		
//		int num1 = 2;
//		System.out.println(num1);

		
		// 초기값을 제공하지 않을 경우 필드는 객체 생성시 자동으로 기본값(0, null)으로 초기화
		Customer cust1 = new Customer();
		
		System.out.println("--------------------기본형----------------------");
		
		System.out.println(cust1.byteVal);
		System.out.println(cust1.shortVal);
		System.out.println(cust1.intVal);
		System.out.println(cust1.longVal);

		System.out.println("------------------------------------------------");
		
		System.out.println(cust1.floatVal);
		System.out.println(cust1.doubleVal);

		System.out.println("------------------------------------------------");
		
		System.out.printf("[%c]\n", cust1.charVal);
		System.out.println(cust1.booleanVal);
		
		System.out.println("--------------------참조형(배열)----------------------");
		System.out.println(cust1.intArr);
		
		System.out.println(cust1.intArr[0]);
		System.out.println(cust1.intArr[1]);
		System.out.println(cust1.intArr[2]);
		
		System.out.println("--------------------참조형(클래스)----------------------");
		System.out.println(cust1.strArr);
		
		System.out.println(cust1.strArr[0]);
		System.out.println(cust1.strArr[1]);
		System.out.println(cust1.strArr[2]);
		
		
	}
}
