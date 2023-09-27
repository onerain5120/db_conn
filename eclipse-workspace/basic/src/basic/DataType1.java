package basic;

public class DataType1 {
	public static void main(String[] args) {


		// DataType
		
		byte byteValue1=-128;
		byte byteValue2=0;
		byte byteValue3=127;
		
		short shortValue1=-32768;
		short shortValue2=0;
		short shortValue3=32767;
		
		int intValue1=-2147483648;
		int intValue2=0;
		int intValue3=2147483647;

		long longValue1 = 21474836478L;
				
		// 자바에서는 정수는 int, 실수는 double로 기본 설정됨;
		
		// 자바에서 실수 선언시 정밀도를 위해 double 로 선언하시고, 굳이 float로 선언하고 싶을 경우 끝에 f
		double doubleValue=0.1;
		
		float floatValue=0.1f;
		
		char ch1='a';
		
		boolean boolValue1=true;
		boolean boolValue2=false;
		
		System.out.println(ch1);
		
		System.out.println((int)ch1);
		
		
		// 자바는 유니코드 체계를 따르긴 하지만
		// ASCII 코드에 있던 값을 C언어에서 사용하고
		// 그 개념을 유지하기 위해 포용함.
		
		// 다른 언어코드 체계를 포용하기 위한 유니코드
		// 한글은 utf-8
		
		char ch2='가';
		System.out.println(ch2);
		
		
		
	}
}
