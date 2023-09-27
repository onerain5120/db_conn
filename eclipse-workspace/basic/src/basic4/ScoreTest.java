package basic4;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[3];
		
		System.out.print("국어 점수를 입력하세요 : ");
		arr[0] = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		arr[1] = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		arr[2] = sc.nextInt();
		
		System.out.println("");		
		
		Score cul= new Score(arr);
		
		int tot = cul.add(arr);
		double avg = cul.avg(arr);
		
		System.out.println("합계 : " + tot);
		System.out.println("평균 : " + avg);

		sc.close();
		
	}
}
