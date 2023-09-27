package basic;

public class ArrayEx2 {
	public static void main(String[] args) {
		
		int arr[] = new int[] {9,20,30}; // 선언 시 중괄호를 사용하여 값을 지정해주면 따로 크기를 지정하지 않아도 됨
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
		
		
		for( int i = 0 ; i < arr.length ; i++ ) {
			System.out.println(arr[i]);
		}
		
		System.out.println("------------------------------------------");
		
		// 향상된 for문
		// for(값 : 배열객체)
		
		for(int num : arr) {  // num의 타입은 배열을 선언할 때 정한 그대로 해야 함, 배열의 인덱스 개수를 모를 때 유용
			System.out.println(num);
		}
		
		
	}

}



