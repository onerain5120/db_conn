package polymorphism;

public class CarTest {
	
	public static void main(String[] args) {
		
		
//		new Car();
		
		Car car = new Car();
		
		
//		car.run();
		
		// 카 객체에서 run을 실행하니 
		// 그 안에 타이어 객체가 있어야 하나 현재는 null인 상태이므로 NullPointerException 발생
		// 앞으로 NullPointerException 이 발생할 경우 아,, 해당 객체를 만들어줘야
		// 한다라는 것을 꼭 반드시 !!!!!!!!!!!!!!!!! 명심하시길 바랍니다.
		
//		Tire tire = new Tire();
		
//		System.out.println(tire);  // 5e91993f
		
		
//		car.tire = tire;
		
		
		car.tire = new Tire();

		car.run();
		
		car.tire = new HankookTire();
		car.run();
		
		
		car.tire = new KumhoTire();
		car.run();
	}

}
