package interfaceEx3;

public class InstanceEx {
	
	static void ride(Vehicle vehicle) {
		if(vehicle instanceof Bus bus) {
			bus.checkFare();
		}
	}

	public static void main(String[] args) {
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		ride(bus);
//		ride(taxi);
		
	}
}
