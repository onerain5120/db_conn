package basic;

public class SumEx1 {

	public static void main(String[] args) {
		
		int tot = 0;
		// 1 ~ 10
		for( int i = 1 ; i <= 10 ; i++ ) {
//			System.out.println(i);
//			tot = tot + i
			tot += i;
		}
		
		System.out.println(tot);
		
	}
}


