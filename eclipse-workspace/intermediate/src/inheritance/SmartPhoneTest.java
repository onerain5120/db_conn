package inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		
		SmartPhone smartPhone = new SmartPhone("SS", "white");
		System.out.println(smartPhone.model + " " + smartPhone.color);
		
		smartPhone.sendVoice("오늘 점심 뭐 먹을래");
		
		smartPhone.receiveVoice("백반 먹자...");
		
		System.out.println(smartPhone.wifi);
		smartPhone.setWifi(true);
		System.out.println(smartPhone.wifi);
		smartPhone.internet();
	}
}
