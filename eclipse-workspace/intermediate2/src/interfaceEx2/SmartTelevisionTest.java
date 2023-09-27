package interfaceEx2;

public class SmartTelevisionTest {
	
	public static void main(String[] args) {
		
		SmartTelevision smartTelevision = new SmartTelevision();
	
		smartTelevision.turnOn();
		smartTelevision.turnOff();
		smartTelevision.search("https://www.youtube.com");

	System.out.println("------------------------");
	
	RemoteControl rc = new SmartTelevision();
	
	rc.turnOn();
	rc.turnOff();
	
	Serchable sc = new SmartTelevision();
	sc.search("https://www.youtube.com");
	
	
	}

}
