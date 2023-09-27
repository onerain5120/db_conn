package chapter8;

public class Q5_Tv implements Q5_Remocon{
	
	@Override
	public void powerOn() {
		System.out.println("TV를 켰습니다.");
	}
	
	public static void main(String[] args) {
		Q5_Remocon r = new Q5_Tv();
		r.powerOn();
	}

}
