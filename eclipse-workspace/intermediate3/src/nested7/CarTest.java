package nested7;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = new Car();
		
//		car.run1();
//		car.run2();
		
//		Tire tire = new Tire();
//		car.run3(tire);
		
		car.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire객체 3이 굴러감");
			}
		});
		
	}
}
