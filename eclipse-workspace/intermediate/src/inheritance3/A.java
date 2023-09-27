package inheritance3;

public class A {

	protected String field;
	
	protected A() {
		System.out.println("A 객체 생성됨");
	}
	
	protected void pMethod() {
		System.out.println("이것은 부모 메서드가 실행된 것이여...");
		
	}
}
