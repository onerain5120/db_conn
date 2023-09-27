package basic3;

public class KoreanTest {
	
	public static void main(String[] args) {
		
		
		
		Korean honggildong = new Korean("홍길동", "900101-1111111");
	
		System.out.println(honggildong.nation);
		System.out.println(honggildong.name);
		System.out.println(honggildong.ssn);
		
		System.out.println("----------------------------------------------");
		
		Korean hongeedong = new Korean("홍이동", "900101-2111111");
		
		System.out.println(hongeedong.nation);
		System.out.println(hongeedong.name);
		System.out.println(hongeedong.ssn);
	
	}

}
