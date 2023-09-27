package basic;

import java.util.Scanner;

public class StringEx3 {

	public static void main(String[] args) {
		
		// 주민등록 번호 형식에 관하여
		String input;
		String resNums[] = new String[] {"99XXXX-1XXXXXX", "99XXXX-2XXXXXX", "00XXXX-3XXXXXX", "00XXXX-4XXXXXX"};
		
		String rn1 = resNums[0];
		String rn2 = resNums[1];
		String rn3 = resNums[2];
		String rn4 = resNums[3];

		Scanner sc = new Scanner(System.in);
		input = sc.next();
		
		if(input.length() == 14 && input.charAt(6) == '-') {
			
		} else {
			
		}
		
		
//		if(true) {
//			System.out.println("2000년생 이전 남자입니다.");
//		} else {
//			System.out.println("2000년생 이전 여자입니다.");
//		}
		
		
	}
}

// 주민 번호 형식에 맞지 않습니다.
// 2000년도 이후 태생











