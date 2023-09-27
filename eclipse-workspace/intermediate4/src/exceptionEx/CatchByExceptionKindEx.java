package exceptionEx;

public class CatchByExceptionKindEx {

	public static void main(String[] args) {
		
//		System.out.println(args[0]);
//		System.out.println(args[1]);
		
		int num1;
		int num2;
		
		
		// catch 블록이 여러개라고 할지라도 단 하나의 catch 블록만 실행됨.
		// 그 이유는 try 블록에서 동시 다발적으로 예외가 발생하지 않고,
		// 하나의 예외가 발생하면 즉시 실행을 멈추고 해당 블록으로 이동하기 때문이다. 
		try {
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			System.out.println(num1 + num2);
		} catch (NumberFormatException e) {
			System.out.println("숫자만 들어갈 수 있습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("매개변수는 꼭 두개를 넣어주세요.");
		} 
		
		
	}
	
}




