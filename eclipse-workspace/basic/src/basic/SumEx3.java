package basic;

public class SumEx3 {
	
	public static void main(String[] args) {
		
		int tot = 0;
		int avg;
		
		int arr1[] = new int[3];
		
		arr1[0]=70;
		arr1[0]=80;
		arr1[0]=90;
		
//		int arr1_1 [] = new int[] {70, 70, 70};
//		
//		// 이차원
//		// 1)
//		int arr2 [][] = new int [3][3];
//		arr2[0][0] = 70;
//		arr2[0][1] = 70;
//		arr2[0][2] = 70;
//		
//		arr2[1][0] = 80;
//		arr2[1][1] = 80;
//		arr2[1][2] = 80;
//		
//		arr2[2][0] = 90;
//		arr2[2][1] = 90;
//		arr2[2][2] = 90;
		
		// 이차원
		// 2)
		int arr2 [][] = new int[][] {{70,70,70},{80,80,80},{90,90,90}};
		
		// 행의 길이 (2차원 배열의 길이는 행의 길이를 나타냄)
//		System.out.println(arr2.length);
		
		
		// 열의 길이 (2차원 배열에서 열의 길이는 일단 행에 접근한 후에 길이를 찍어보세요.)
//		System.out.println(arr2[0].length);
		
		for (int i = 0; i < arr2.length; i++) {
			
			
			for (int j = 0; j < arr2[0].length; j++) {
				
				System.out.printf("( %d )", arr2[i][j]);
				tot += arr2[i][j];
			}
			
			System.out.println();
		}
		
		avg = tot / (arr2.length * arr2[0].length);
		System.out.println("------------------------");
		
		System.out.println(tot);
		System.out.println(avg);
		
	}
	

}
