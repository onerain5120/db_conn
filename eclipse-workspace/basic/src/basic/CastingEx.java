package basic;

public class CastingEx {

	public static void main(String[] args) {

		// 강제 형변환
		
		int var1 = 10;
		
		byte var2 = (byte)var1;
		
		long var3 = 300;
		
		int var4 = (int)var3;
		
		int var5 = 65;
		
		char ch1 = (char)var5;	//char 타입은 ASCII 값에 의해 정수형과 호환됨
		
		System.out.println(ch1);
		
		double var7 = 3.84;
		
		int var8 = (int)var7;
		
		System.out.println(var8);	// 자바에서 실수를 정수로 강제 형변환시 소수점 이하 다 날림!!!
		
		
	}

}
