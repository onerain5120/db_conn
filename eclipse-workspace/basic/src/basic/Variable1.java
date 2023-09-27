package basic;

public class Variable1 {
	public static void main(String args[]) {
		// 초기화(initialization) : 처음에 그 변수 안에 값을 넣어놓고 시작해서 초기값을 설정 
		// 1.초기화 1(선언과 값 할당을 나누어서 하는 방법)
		// 변수 선언 : 변수명을 씀, 데이터 타입(정수, int)도 꼭 써야 함
		int age;
		// 값을 할당함
		age = 30;
		
		// 2.초기화 2(선언과 값 할당을 한꺼번에 하는 방법)
		int height=175;
		
//		System.out.println(age);
//		System.out.print(height);
		
		
		// escape sequence	\n
		System.out.println("hi" + "\n" + "nice");
		System.out.print("hi" + "\t" + "nice");
	}
}
