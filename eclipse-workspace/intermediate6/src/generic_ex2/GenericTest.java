package generic_ex2;

public class GenericTest {

	public static void main(String[] args) {
		
//		HomeAgency homeAgency = new HomeAgency();
		Home home = new HomeAgency().rent();
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.Drive();
		
	}
	
}
