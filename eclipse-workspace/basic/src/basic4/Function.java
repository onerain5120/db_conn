package basic4;

public class Function {

	// 줌 받음
	// x  x
	// o  x
	// x  o 
	// o  o
	

	// 메서드 정의 함(메서드 정의가 되어 있어야 사용할 수 있으니 당연히 정의해야겠죠?)
	
	
	// 1) 메서드 이름(여러분이 적당하게 정해주시면 됨)을 쓴다.
	static void sunja1() {  // 매개변수 X, return X
		System.out.println("안녕 순자");  // 이것은 return 이 아니고 단지 모니터에 print 만 할 뿐이다.
		
	}
	
	// 2)
	static void sunja2(String gift) {  // 매개변수 O (gift), return X
		System.out.println(gift);  // main 함수에서 매개변수 gift 에 "사과"를 담았으므로 gift를 찍으면 "사과"가 나옴
	}

	// 3)
	static String sunja3() {  // 매개변수 X, return O
		return "포도";
	}
	
	// 4)
	static String sunja4(String gift) {  // 매개변수 O, return O
		return "수박";
	}
	
	
	public static void main(String[] args) {
		sunja1();
		sunja2("사과");
		String gift2 = sunja3();  // reutrn 값을 받을 방(String gift)을 만들어서 넣어줌
		System.out.println(gift2);
		String lunch = sunja4("탕후루");  // reutrn 값을 받을 방(String gift)을 만들어서 넣어줌
		System.out.println(lunch);
	}
	
	
	
	
	
	
}
