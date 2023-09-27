package package2;

import package1.A;

public class C {

	
	
	public void method() {
		
		A a = new A();
		a.field1 = 1;
//		a.field2 = 3;
//		a.field3 = 1;  // 패키지가 동일하나 클래스가 다르므로 private 접근 불가
		
		
		a.method1();
//		a.method2();
//		a.method3();  // 패키지가 동일하나 클래스가 다르므로 private 접근 불가
	}
	
}
