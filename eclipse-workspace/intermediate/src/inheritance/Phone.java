package inheritance;

public class Phone extends Machine {

	
	// 필
	public String model;
	public String color;
	
	// 생
	
	public Phone() {	
	}
	
	// 메
	public void sendVoice(String message) {
		System.out.println("내가 보내는 메세지 : " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대방이 나에게 보낸 메세지 : " + message);
	}
	
	
	public void hangup() {
		System.out.println("전화 끊다.");
	}
	
	
	
	
}




