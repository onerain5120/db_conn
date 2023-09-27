package inheritance2;

public class Tire {

	// 타이어의 위치  // FL, FR, BL, BR
	String location;
	// 최대 회전수(타이어 수명)
	int maxRotation;
	// 누적 회전수
	int accumulateRotatio;

	
	public Tire () {
		
	}
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	
	
	// 메소드
	public boolean roll() {
		++accumulateRotatio;
		// 1 < 6
		if(accumulateRotatio < maxRotation) {
			System.out.println(this.location + " Tire 수명 : " + (this.maxRotation - accumulateRotatio ) + "회");
			return true;
		} else {
			System.out.println(location + "위치 타이어가 펑크남");
			return false;
		}
		
	}
	
}
