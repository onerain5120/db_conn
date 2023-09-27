package package1;


// 생성자의 접근 제한
public class A {

	// 필 (기본형, 참조형)
	
	A a = new A();
	
	A a1 = new A(true);
	A a2 = new A(5);
	A a3 = new A("hi");
	
	// 생
	public A() {
		
	}
	
	public A(boolean b) {  // public 생성자
			
		}
	
	A(int b) {  // default 생성자
		
	}
	
	private A(String s) {  // private 생성자(같츤 클래스 내에서는 생성자에 대한 접근에 제한이 없다.)
		
	}
	
	// 메
	
}
