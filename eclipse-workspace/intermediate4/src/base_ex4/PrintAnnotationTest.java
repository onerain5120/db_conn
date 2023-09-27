package base_ex4;


// reflection : Class 객체로 관리하는 클래스와 인터페이스의 메타 정보를 프로그램에서 읽고 수정하는 것
// 메타 정보 : 패키지 정보, 타입 정보, 멤버(생성자, 필드, 메소드) 정보
import java.lang.reflect.Method;

public class PrintAnnotationTest {

	
	public static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation != null) {
			int number = printAnnotation.count();
			for( int i = 0 ; i < number ; i++ ) {
				String value = printAnnotation.value();
				System.out.print(value);
				
			}
			System.out.println();
		
		}
	}
	
	public static void main(String[] args) {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
//		System.out.println(declaredMethods);
		
		for (Method method : declaredMethods) {
//			System.out.println(method);
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
//			System.out.println(printAnnotation);
			printLine(printAnnotation);
		
		}
		
	}
}
