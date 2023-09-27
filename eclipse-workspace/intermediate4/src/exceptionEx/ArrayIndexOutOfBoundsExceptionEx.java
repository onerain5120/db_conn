package exceptionEx;

public class ArrayIndexOutOfBoundsExceptionEx {

	public static void main(String[] args) {
		
		int arr[] = new int[3];
		
		try {			
			System.out.println(arr[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스는 2를 초과할 수 없습니다.");
		}
		
	}
	
}



