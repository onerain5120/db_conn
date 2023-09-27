package inheritance4;

import inheritance3.A;

public class D extends A{
	
	// 필
	
	
	// 생
	public D() {
//		super();
		System.out.println("D 객체 생성됨");
	}
	
	// 메
	@Override
	protected void pMethod() {
		System.out.println("재정의한 메서드");
	}
	
	public void method1() {
		field = "hi2";
		pMethod();
	}
	
	public void method2() {
		// new A(); 부모의 객체를 직접 생성해서 사용하는 것은 안됨
	}
}
