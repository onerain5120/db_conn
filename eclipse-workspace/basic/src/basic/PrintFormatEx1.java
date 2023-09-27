package basic;

public class PrintFormatEx1 {

	public static void main(String[] args) {
		
		// d : digit(숫자) f(실수, float는 소수점 이하 형식 선언)
		// 출력 포맷 : "%d"
		int value = 123;
		System.out.printf("%d", value);
		System.out.println();
		System.out.printf("%6d", value);
		System.out.println();
		System.out.printf("%06d\n", value);
		
		
		double area = 3.141592 * 10 * 10;
		System.out.println(area);
		System.out.printf("%.1f\n",area);
		System.out.printf("%.2f\n",area);
		
		
		
		
		
	}

}
