package chapter12;

public class Test {

	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (Exception e) {
			System.out.println("예외 처리 : " + e.toString());
		}
	}
	
	
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
	
	
}


