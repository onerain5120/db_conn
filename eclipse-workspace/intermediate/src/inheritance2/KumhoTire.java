package inheritance2;

public class KumhoTire extends Tire{

	// 자식 클래스인 KumhoTire 는 생성자 내에서 부모의 생성자를 사용할 수 있다.
	
	public KumhoTire() {
		
	}
	
	// 자식은 부모가 가진 필드와 생성자를 통해서 객체를 초기화 할 수 있다.
	// 자기 자신을 가리키는 this와 같이 부모를 가리키는 예약에 super
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
}
