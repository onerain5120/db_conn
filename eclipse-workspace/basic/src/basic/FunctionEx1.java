package basic;

public class FunctionEx1 {

	static void sunja1(){	// 안 주고, 안 받고
		System.out.println("hi");
	}
	
	// 함수 안에서만 사용하는 변수를 지역(local) 변수라 한다. 매개변수도 지역변수이다. 그 함수 영역 안에서만 사용 가능
	static void sunja2(String gift){	// 주고, 안 받고
		System.out.println(gift);
	}
	
	static String sunja3(){	// 안 주고, 받고
		return "사탕";
	}
	
	static String sunja4(String gift){	// 주고, 받고
		System.out.println(gift + "를 받았습니다.");
		return "도너츠";
	}
	
	
	
	public static void main(String[] args) {
//		sunja1();
//		sunja2("초콜렛");
		
//		sunja3();
//		System.out.println(sunja3());
		
		// return 이 있는 함수로 정의된 경우 가급적 변수로 받아서 찍어보세요!!
		
		// 위의 코드보다는
//		String gift = sunja3();
//		System.out.println(gift);
		
		String gift = sunja4("바나나");
		
		System.out.println(gift + "를 반환했습니다...");
	}

}
