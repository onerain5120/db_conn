package basic4;

public class PrEx3 {  // 배열

	public static void main(String[] args) {
		
		int tot = 0;
		int avg;
		int arrs[] = new int [3];
		
		arrs[0] = 90;
		arrs[1] = 50;
		arrs[2] = 40;
		
//		for ( int arr : arrs ) {
//			tot = tot + arr;
//		}
		
		for ( int i = 0 ; i < arrs.length ; i++ ) {
			tot = tot + arrs[i];
		}
		
		System.out.println("총점 : " + tot);
		avg = tot / arrs.length;
		System.out.println("평균 : " + avg);
		
	}
	
}
