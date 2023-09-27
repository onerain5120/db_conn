package basic6;

public class ClassName {
	
	// 정적 메서드와 정적 블록은 객체가 없어도 실행된다는 특징 때문에 내부에 인스턴스 필드나 인스턴스 메서드를 사용할 수 없다. (물과 기름의 관계다)
	// 또한 객체 자신의 참조인 this도 사용할 수 없다.
	
	// 필(인, 스)
	int field1;
	
	// static 필드
	static int field2;
	
	
	
	// static(정적) 블록
	
	static {
//		field1 = 10;
	}
	
	// 생
	public ClassName() {
		
	}
	
	
	
	
	public ClassName(int field1) {
		this.field1 = field1;
	}




	// 메(인, 스)
	// 인스턴스 메서드
	void method1() {
		
	}
	
	
	// static 메서드
	static void method2() {
//		field1 = 5;
		
//		this.field1 = 8;
		
		// 그럼에도 불구하고 정적 메서드와 정적블록에서 인스턴스 멤버를 사용하고 싶다면 객체를 먼저 생성 후 참조 변수로 접근(좋은 방법이진 않다.)
		
		ClassName className = new ClassName();
		className.field1 = 10;
		className.method1();
	}
}
