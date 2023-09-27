package basic6;

public class Car {

	// 필
	int speed;  // 인스턴스 필드
	
	
	// 생
	
	void hi() { // 인스턴스 메서드
		
	}
	
	
	
	// 메
	
	public static void main(String[] args) {
//		speed = 70;
		
//		hi();
		
		Car car = new Car();  // 객체를 만든다.(인스턴스화 함)
	
		car.speed = 60;
		car.hi();
		
	}
}
