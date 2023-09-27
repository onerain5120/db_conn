package basic;

public class PromotionEx {
	public static void main(String[] args) {
		byte byteValue=10;
		
		int intValue=byteValue; // 자동 형(type) 변환(promotion)
		
//		System.out.println(intValue);
		
		
		
		
		char charValue='A';
		intValue=charValue;
		System.out.println(intValue);
		
		char charValue2='가';
		intValue=charValue2;
		System.out.println(intValue);
		
		intValue=500;
		
		long longValue=intValue;
		System.out.println(intValue);
		
		double doubleValue=intValue;
		System.out.println(intValue);
		
		
		
		
	}
}
