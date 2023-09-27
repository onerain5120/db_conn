package basic;

public class SumEx2 {

	public static void main(String[] args) {
		
		
		int score = 70,
			tot = 0;
		int av = 0;
		
		for( int i = 1 ; i <= 3 ; i++ ) {
			
			
			if(i == 0) {
				System.out.println("     국어 영어 수학");
				System.out.print("홍일동 ");	
			}else if (i == 1) {
				System.out.print("홍이동 ");
			}else {
				System.out.print("홍삼동 ");
			}
			
			for( int j = 1 ; j <= 3 ; j++ ) {
				
				System.out.print(score + "  ");
				tot += score;
				av = tot/(j * i);
			}
			score += 10;
			System.out.println();
		}
		System.out.println("------------------------");
		System.out.printf("평균 : %d", av);
		
	}
}
