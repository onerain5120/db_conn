package abstractEx;


// 객체를 생성할 수 있는 클래스는 실체 클래스, 이 클래스들의 공통적인 필드나 메서드를 추출해서 선언한 클래스를 추상 클래스라고 함
// 추상클래스는 실체 큺래스의 부모(상속 필요)역할	

// 추상 메서드가 있냐 없냐로 추상클래스인지를 구분해도 크게 무리는 없을 듯 하다.
public abstract class Animal {

	// 추상 클래스도 필드, 생성자, 메서드를 선언할 수 있다.
	
	
	// 추상 메서드를 알기 위해서 다시 한 번 메서드에 대하여 공부해 보도록 하겠습니다.
	
	
	abstract void breathe();
	
// 위의 메서드를 두 부분으로 구분
// 1) void breathe()    // 선언부
// 2) { System.out.println("숨 쉰다."); }    // 구현부
	
	
	
	// 추상메서드
	
	public static void main(String[] args) {
		// 추상 클래스는 new 연산자를 이용해서 객체를 직접 만들지 못하고 상속을 통해 자식 클래스만 만들 수 있다.
//		new Animal();
		
	}
	
	
}

