package inheritance2;

public class Car {

	
	// 필(기본형, 참조(배열, 열거, 클래스, 인터페이스))
	String company;
	String model;
	Person person;  // 클래스
	
	// 부품(집합)관계, 타이어는 차의 부품이다. 타이어, 핸들, 엔진 이런 것들이 집합(모임)이 되면 차가 완성이 된다.
	// 부품 관계는 큰 틀(자동차) 안에 부품이(타이어) 객체로서 초기화 되어야 함
	Tire frontLeft = new Tire("앞 왼쪽", 6);
	Tire frontRight = new Tire("앞 오른쪽", 2);
	Tire BackLeft = new Tire("뒤 왼쪽", 3);
	Tire BackRight = new Tire("뒤 오른쪽", 4);
	
	
	
	public Car() {
		
	}

	public Car(String company, String model) {
//		super();
		this.company = company;
		this.model = model;
	}

	// 매개변수(변수, 지역(local, 함수 내에서만 사용하는) 변수
	// 매개변수를 통해서 객체와 객체간
	void drive1(String person) {
		System.out.println(person + "운전함");
	}
	
	void drive1(Person person) {
		this.person = person;
		System.out.println(this.person.name + "운전함");
	}
	// 매개변수를 통해서 객체와 객체간의 관계를 맺기 위해서는 사용하고자 하는 객체와 같은 타입의 매개변수로 
	
//	public void owner(Person person) {
//		this.person = person;
//		System.out.println("이 차의 주인은" + this.person.name + "이다");
//	}

	// 차를 탄다
	String take() {
		
		
		return this.company + "회사의 " + this.model + "차를 탄다.";
	}

	// 타이어의 회전 수가 유효한 동안 자동차가 달리도록
	int run() {
		System.out.println("자동차 달림");
		
		if(frontLeft.roll() == false) {
			stop();
			return 1;
		}
		
		if(frontRight.roll() == false) {
			stop();
			return 2;
		}
		
		if(BackLeft.roll() == false) {
			stop();
			return 3;
		}
		
		if(BackRight.roll() == false) {
			stop();
			return 4;
		}

		return 0;
	}
	
	// 펑크 났을 때 실행되도록
	void stop() {
		System.out.println("자동차 멈춤");
	}



}
