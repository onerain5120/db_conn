package basic;

import java.util.Random;
import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class UpDownGame {

	public static void main(String[] args) {
		
		int num;
		int input;
		
		Random rd = new Random();	
		Scanner sc = new Scanner(System.in);
	
		num = rd.nextInt(100) + 1;	
		
		
		while(true) {
			
			System.out.print("숫자를 입력하세요 : ");
			
			input = sc.nextInt();
			
			if(num == input) {
				System.out.println("\n정답입니다~!");
				System.out.printf("숫자 : %d", num);
				break;
			} else {
				System.out.println(num > input ? "up" : "down");
			}
		}
		
		
	}
	
}





