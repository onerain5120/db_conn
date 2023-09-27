package basic3;

public class Car {

	// 필
	String company = "hyundai";
	String model;
	String color;
	int maxSpeed;
	
	
	// 생성자 : 개발자가 생성자를 선언하는 이유는 객체를 처음부터 이 Car라는 클래스는 아래와 같은 형태로 필드를 초기화 할 수 있도록 다양한 형태를 미리 제한해놓을 수 있다.
	
	public Car() {
		
	}
	
	
	
	// Constructor Overloading : 매개변수의 타입, 개수, 순서가 다르게 여러 개의 생성자 선언 
	
	public Car(String model) {
		this.model = model;
	}


	public Car(String model, String color) {
		// this 라는 Car라는 자기 자신을 나타내는 예약어
		this.model = model;
		this.color = color;
	}
	
	
	public Car(String model, String color, int maxSpeed) {
		// this 라는 Car라는 자기 자신을 나타내는 예약어
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public Car(String model, int maxSpeed, String color) {
		// this 라는 Car라는 자기 자신을 나타내는 예약어
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
	// 메
	
	
}
