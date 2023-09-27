package basic;

import java.util.*;
//import java.util.Scanner;

//import java.util.Scanner;

public class WhileEx1 {
	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println(System.identityHashCode(scanner));
		
		
		
//		String inputText = scanner.nextLine();
//		
//		System.out.println(inputText);
		
		// do while문은 무조건 시작하자마자 뭔가를 하고 판단하라는 것이므로 가장 많이 쓰이는 패턴은 값을 입력받고 판단할 경우
		String inputText;
		do {
			System.out.print(">");
			inputText = scanner.nextLine();
			System.out.println(inputText);
		}while(!inputText.equals("q"));
		
	}

}







