package basic;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		
		
		// 배열(고정되었고 각각 방에 들어갈 데이터 타입도 통일되었으므로 데이터 타입도 선언하고 방이 몇개인지도 선언)
		
		// 이 변수는 배열 변수
		
		int arr [] = new int[3 ];  // 배열도 참조형이기 때문에 new 선언함
		
		
		System.out.println(arr);
		System.out.println(System.identityHashCode(arr));
		
		arr[0] = 9;
		
		System.out.println(System.identityHashCode(arr[0]));
		
		arr[1] = 20;
		arr[2] = 30;

//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
		
		System.out.println("------------------------");
		
		System.out.println(arr.toString());
		
		System.out.println("------------------------");
		

		
	}

}
