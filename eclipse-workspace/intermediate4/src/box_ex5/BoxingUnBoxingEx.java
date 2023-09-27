package box_ex5;

public class BoxingUnBoxingEx {

	public static void main(String[] args) {
		
		// Boxing
		Integer obj = 100;
		System.out.println(obj);
		System.out.println(obj.intValue());
		
		
		// Unboxing
		int value = obj;
		System.out.println(value);
		
		
		// 연산 시 자동으로 Unboxing 됨
		
		int result = obj + 20;
		System.out.println(result);
	
		
		System.out.println(Integer.parseInt("10") + 10);
		
		System.out.println(Double.parseDouble("10.45") + 10);

		System.out.println(Boolean.parseBoolean("true"));
	}
	
	
}
