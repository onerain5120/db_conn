package calcV2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		String cal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 1 : ");
		num1 = sc.nextInt();
		
		System.out.print("연산자(+, -, *, / 중에 하나를 선택하세요) : ");
		cal = sc.next();

		System.out.print("숫자 2 : ");
		num2 = sc.nextInt();
		

		while(true) {
			
			
			if(cal.equals("+") || cal.equals("-") || cal.equals("*") || cal.equals("/")) {
				if(cal.equals("+")) {
					System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
					break;
				} else if(cal.equals("-")) {
					System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
					break;
				} else if(cal.equals("*")) {
					System.out.printf("%d x %d = %d", num1, num2, num1 * num2);
					break;
				} else {
					System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
					break;
				}
				
			} else {
				System.out.println("연산자를 다시 입력하세요");
				break;
			}
		}
		
		sc.close();
		
	}
	
}
