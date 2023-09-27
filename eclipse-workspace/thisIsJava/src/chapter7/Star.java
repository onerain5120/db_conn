package chapter7;

public class Star {

	public static void main(String[] args) {
		
//		for(int i = 10 ; i > 1 ; i-- ) {
//		System.out.println("□");	
//		}
		
		
		for(int i = 0 ; i < 10 ; i++ ) {
			
			for(int j = 10 ; j > i + 1 ; j--) {
				System.out.print("□");	
			}
			
			for(int j = 10 ; j < 2*i + 1 ; j++) {
				System.out.print("*");	
			}
			
			System.out.println();
		}
		
		
	}
}










