package inheritance;



// 폰과 스마트 폰의 관계를 맺어보자
// 스마트폰(자식)은 폰(부모)이다. 이런 형태의 문장이 말이 되면 상속 관계를 맺을 수 있다.
public class SmartPhone extends Phone {

	
	// 필
	public boolean wifi;
	
	
	// 생
	public SmartPhone() {
		
	}
	
	public SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	
	// 메
	
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이상태 변경");
	}
	
	public void internet() {
		System.out.println("인터넷 연결");
	}
	
	
}
