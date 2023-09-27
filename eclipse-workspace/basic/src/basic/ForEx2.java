package basic;

public class ForEx2 {

	public static void main(String[] args) {
		
		
		// 이중(nested) for 문 (면, 2차원)
		
//		for(int i = 0 ; i < 3 ; i++) {  // 행
//			
//			for(int j = 0 ; j < 3 ; j++) {  // 열
//				System.out.printf("%d, %d ",i,j);
//			}
//			
//			System.out.println("");
//			
//		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		for( int i = 2 ; i <=9 ; i++) {
			System.out.printf("|    %d단     |", i);
		}
		
		System.out.println();
		
		for( int i = 1 ; i <= 9 ; i++ ) {  // 행
			for( int j = 1 ; j <= 9 ; j++ ) {  // 열
				System.out.printf("|%d X %d = %2d|", i, j, i * j);
			}
			System.out.println("\n------------------------------------------------------------------------------------------------------------");
		}
		
	}

}

