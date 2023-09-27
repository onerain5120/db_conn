package basic4;

public class PrEx4Ttest {
	
	public static void main(String[] args) {
		
//		PrEx4 prex4 = new PrEx4();
		
//		PrEx4 prex4 = new PrEx4(4, 5);		// int 생성자를 호출
//		PrEx4 prex4 = new PrEx4(4.0, 5.0);	// double 생성자를 호출
		
//		double result = prex4.add();
//		System.out.println(result);
		
		
// -------------------------------------------------------------------------
		
		int arrs[] = new int[] {90, 80, 70};
		
		
//		for (int arr : arrs) {
//			System.out.println(arr);
//		}
		
		PrEx4 prex4 = new PrEx4(arrs);
		
//		System.out.println(prex4);
//		
//		System.out.println(prex4.arr);
//		System.out.println(prex4.arr[0]);
//		System.out.println(prex4.arr[1]);
//		System.out.println(prex4.arr[2]);
		
//		int result = prex4.accu(arrs);
//		System.out.println(result);
//		
//		double avg = (double) result / arrs.length;
//		System.out.println(avg);
	
//		double avg = prex4.avg(arrs);
//		System.out.println(avg);
		
		double result2 = prex4.accu(arrs);
		System.out.println(result2);
		
		double result = prex4.avg(arrs);
		System.out.println(result);
		
	}

}
