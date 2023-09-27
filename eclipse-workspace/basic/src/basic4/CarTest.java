package basic4;

public class CarTest {

	public static void main(String[] args) {

		Car car1 = new Car("자가용");

		System.out.println(car1.company + " " + car1.model + " " + car1.maxSpeed + " " + car1.color);
		
		
		Car car2 = new Car("자가용", "빨강");

		System.out.println(car2.company + " " + car2.model + " " + car2.maxSpeed + " " + car2.color);
		
		
		Car car3 = new Car("자가용", 400, "보라");

		System.out.println(car3.company + " " + car3.model + " " + car3.maxSpeed + " " + car3.color);
		
		
		
		
		
		
		
		
	}
	
}







