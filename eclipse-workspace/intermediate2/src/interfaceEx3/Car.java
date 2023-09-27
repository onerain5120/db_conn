package interfaceEx3;

public class Car {
	
	Tire tire = new HankookTire();
	
	void run() {
		tire.roll();
	}

}
