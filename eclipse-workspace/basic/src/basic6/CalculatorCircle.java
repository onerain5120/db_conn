package basic6;


// 틀을 어떤 것으로 정의할 것인가
public class CalculatorCircle {

	
	// 필
	// 원의 면적을 계산(반지름, pi)하는 클래스가 저장하고 있어야 할 값(pi)의 이름들을 선언, pi값은 값이 객체마다 가지고 있을 필요가 없다. 당연히 CalculatorCircle가 가지고 있어야 할
	// 공통적인 필드다. 객체마다 가지고 있을 필요성이 없는 공용적인 필드는 정적 필드로 선언하는 것이 좋다.
	String color;					// instance 필드
	static double pi = 3.14159;		// static 필드
	
	
	// 생
	public CalculatorCircle() {
		
	}
	
	
	
	// 메

	// 인스턴스 메서드
	// static 메서드 : 인스턴스 필드를 이용하지 않는 메소드는 정적(static) 메서드로 선언하는 것이 좋다.
	
	static int plus(int num1, int num2) {
		return num1+num2;
	}




}
