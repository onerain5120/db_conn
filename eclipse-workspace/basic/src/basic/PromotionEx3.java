package basic;

public class PromotionEx3 {

	public static void main(String[] args) {
		byte v1 = 10;
		int v2 = 100;
		long v3 = 1000L;
		
//		int v4 = v1 + v2 + v3;
		
		long v4 = v1 + v2 + v3;	// 가장 큰 long 타입으로 변환 후 연산이 일어남
		
		
		
		char v6 = 0;
		char v7 = 65535;	// 0 ~ 65535 범위에서 정수와 호환
		
		char v5 = 'A';
		char v8 = 1;
		
		System.out.println(v5 + v8);	// char는 형변환 후 정수 연산 가능
		
		System.out.println((char) (v5 + v8));
		
		
		
		
		
		// 정수 연산시 주의해야 할 점(나누기)
		
		int v9 = 10;
		
		System.out.println(v9 / 4);
		System.out.println((double)v9 / 4);
		
		
		
		
		
		
	}

}
