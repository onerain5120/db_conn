package basic4;

import java.util.Scanner;

//public class Cul {
//
//	// 필
//	static double arr[] = new double [2];
//	static String ys;
//	
//	// 생
//	public Cul() {
//		
//	}
//	
//	public Cul(double arr[]) {
//		this.arr = arr;
//	}
//	
//	// 메
//	
//	
//	void carculate() {
//		
//		while(true) {
//			Scanner sc = new Scanner(System.in);
//			System.out.print("숫자1 : ");
//			this.arr[0] = sc.nextDouble();
//			System.out.print("연산자 : ");
//			ys = sc.next();
//			System.out.print("숫자2 : ");
//			this.arr[1] = sc.nextDouble();
//		
//			if(arr[0] == 0 || arr[0] == 0 || ys.equals("0")) {
//				System.out.println("계산을 종료합니다");
//				break;
//			}
//		
//			if(ys.equals("+") || ys.equals("-") || ys.equals("*") || ys.equals("/")) {
//				if(ys.equals("+")) {
//					System.out.println(arr[0] + arr[1]);
//				} else if(ys.equals("-")) {
//					System.out.println(arr[0] - arr[1]);
//				} else if(ys.equals("*")) {
//					System.out.println(arr[0] * arr[1]);
//				} else {
//					System.out.println(arr[0] / arr[1]);
//				}
//			
//			} else {
//				System.out.println("연산자를 다시 입력하세요");
//			}
//		}
//	
//	}
//}


public class Cul {

	// 필
	double num;
	double num2;
	double result; 
	String ys;
	
	// 생
	public Cul() {
		
	}
	
	public Cul(double num) {
		this.num = num;
	}
	
	// 메
	
	
	void carculate() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 : ");
		this.num = sc.nextDouble();
		System.out.print("연산자 : ");
		ys = sc.next();
		System.out.print("숫자2 : ");
		this.num2 = sc.nextDouble();
		
		if(ys.equals("+") || ys.equals("-") || ys.equals("*") || ys.equals("/")) {
			if(ys.equals("+")) {
				result = num + num2;
				System.out.println(result);
			} else if(ys.equals("-")) {
				result = num - num2;
				System.out.println(result);
			} else if(ys.equals("*")) {
				result = num * num2;
				System.out.println(result);
			} else {
				result = num / num2;
				System.out.println(result);
			}
		
		} else {
			System.out.println("연산자를 다시 입력하세요");
		}
		
		while(true) {
			System.out.print("연산자 : ");
			ys = sc.next();
		
			if(ys.equals("+") || ys.equals("-") || ys.equals("*") || ys.equals("/")) {
				
				System.out.print("숫자 : ");
				this.num = sc.nextDouble();
				
				if(num != 0) {
					if(ys.equals("+")) {
						System.out.println(result + num);
						System.out.println();
						result = result + num;
					} else if(ys.equals("-")) {
						System.out.println(result - num);
						System.out.println();
						result = result - num;
					} else if(ys.equals("*")) {
						System.out.println(result * num);
						System.out.println();
						result = result * num;
					} else {
						System.out.println(result / num);
						System.out.println();
						result = result / num;
					}
				} else {
					System.out.println("계산을 종료합니다");
					break;
				}
				
			} else if (ys.equals("0")) { 
				System.out.println("계산을 종료합니다");
				break;
			} else if (ys.equals("=")) {
				// 연산자에 = 이 들어가면 계산을 처음부터 다시 시작하는 거에서 시작하면 됨
			} else {
				System.out.println("연산자를 다시 입력하세요");
			}
			
			
		}
	
	}
}