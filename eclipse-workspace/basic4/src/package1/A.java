package package1;

public class A {

	// 필
	// public 필드
	public int field1;
	
	// default 필드
	int field2;
	
	// private 필드
	private int field3;
	
	
	// 생
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();  // 클래스 내부이므로 접근제한자의 영향을 받지 않는다.		
		
	}
	
	
	// 메
	// public 필드
	public void method1() {
		
	}
	
	// default 필드
	void method2() {
		
	}
	
	// private 필드
	private void method3() {
		
	}
	
	
}
