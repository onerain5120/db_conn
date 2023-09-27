package basic;

public class IfEx {

	public static void main(String[] args) {
		
		// 조건이 하나만 있는 세상
		
		if (true) {
			System.out.println("참이면 나올 결과");
		}
		
		// 조건에 두가지 (참과 거짓, 참일 수도 있고 거짓일 수도 있음) 있는 세상
		
		if(true) {
			System.out.println(" 1) 참이면 나올 결과");
		} else {
			System.out.println(" 2) 거짓이면 나올 결과");
		}

		
		
		// 조건이 세가지 이상 있는 세상
		
		if(false) {	// 1)
			System.out.println(" 1) 참이면 나올 결과");
		} else if (false) {	// 2)
			System.out.println(" 2) 거짓이면 나올 결과");
		} else {
			System.out.println(" 위 조건에 부합하지 않을 경우 나오는 나머지 부분");
		}
	}

}
