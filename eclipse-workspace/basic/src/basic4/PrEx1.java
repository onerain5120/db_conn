package basic4;

public class PrEx1 {  // 매개변수, return 함수 호출

	//주고 받고
	// x   x
	// x   o
	// o   x
	// o   o
	
	// 필
	
	// 생
	
	static void sunja1() {
		System.out.println("안녕");
	}
	
	static String sunja2() {
		return "사과";
	}
	
	static void sunja3(String gift) {
		System.out.println(gift);
	}
	
	static String sunja4(String gift) {
		System.out.println(gift);
		return "포도";
	}
	
	
	// 메
	
	public static void main(String[] args) {
		sunja1();							// 1)
		String present = sunja2();
		System.out.println(present);		// 2)
		sunja3("수박");						// 3)
		String fruit = sunja4("샤인머스캣");
		System.out.println(fruit);			// 4)
	}
	
}
