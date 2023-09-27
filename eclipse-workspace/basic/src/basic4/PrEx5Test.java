package basic4;

public class PrEx5Test {
	
	public static void main(String[] args) {
		
		int arrs[] = new int[] {90, 80, 70};

// -------------------------------------------------------------------------
		
		PrEx5 prex5 = new PrEx5(arrs);
		
// -------------------------------------------------------------------------
		
		double result2 = prex5.accu(arrs);
		System.out.println(result2);
		
		double result = prex5.avg(arrs);
		System.out.println(result);
		
	}
}




