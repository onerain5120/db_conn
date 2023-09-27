package basic;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		
		
		// 기본형 bsil fd cb
		// 나머지 참조형 : 클래스 타입
		
		// 클래스 타입으로 변수를 선언하고자 할 경우, 어떤 새로운 주소를 할당한다는 연산자인
		// new 연산자 사용
		
		Scanner scanner = new Scanner(System.in);
		
		// scanner 변수는 입력을 받을 수 있는 변수
		int input = scanner.nextInt();
		System.out.println(input);
		

	}

}



