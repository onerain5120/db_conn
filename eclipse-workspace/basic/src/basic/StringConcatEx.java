package basic;

public class StringConcatEx {

	public static void main(String[] args) {
		
//		// 언어에서 문자열과 문자열을 + 할 경우 + 연산자를 연결하도록 재정의함
//		System.out.println("hi" + "nice");	// 형변환
//
//		// 문자열 + 정수
//		// + 라는 연산자가 
//		System.out.println("hi" + 3);	// 정수가 문자열로 형변환이 일어날 경우에 변하므로 "3" 변환 후 연결됨
//		
//		System.out.println("hi" + 3);
//		
//		System.out.println("hi" + true);	// 자바에서 보라색은 예약어
//		System.out.println("hi" + false);
//		
//		
//		System.out.println("hi" + 'A');
//		
//		
//		
//		
//		// 기본형(primitive) bsil fd cb
//		
//		// 프로그래밍 하다보면 문자열을 기본타입으로 변환하는 경우가 매우 많다.
//		System.out.println("안녕");
//		
//		System.out.println("10" + 1);
//		
//		System.out.println(Integer.parseInt("10") + 1);
//		
////		System.out.println(Integer.parseInt("십") + 1);
//		
//		System.out.println(Double.parseDouble("3.1"));
//		
//		System.out.println(Double.parseDouble("3.1" + 0.1));
//		
		System.out.println("-----------------------논리 연산자 &&-------------------------");
		
		System.out.println(Boolean.parseBoolean("true"));
		
		// 비교 ( >  <  >=  <=  == != ) 연산의 결과의 데이터 타입은 무조건 boolean
		
		System.out.println(2 > 1);
		System.out.println(2 < 1);
		System.out.println(2 == 1);
		System.out.println(2 != 1);
		
		System.out.println("------------------------논리 연산자 ||------------------------");
		
		System.out.println(Boolean.parseBoolean("true"));
		
		
		// 논리 연산자 ( &&  || )
		
		System.out.println( true && true );
		System.out.println( false && true );
		System.out.println( true && false );
		System.out.println( false && false );
		
		System.out.println( true || true );
		System.out.println( false || true );
		System.out.println( true || false );
		System.out.println( false || false );
		
		System.out.println("------------------------------------------------");
		
//		System.out.println("true" && true);
		System.out.println("true" + true);
		System.out.println(Boolean.parseBoolean("true") && true);
		
		System.out.println("--------------------기본형 타입을 문자열 변환---------------------");
		// 10hi
		int var1 = 10;
		
		// var1 변수를 String 타입으로 변환시켜 보자!!!!!
		
		
		
		
		
		
	}

}
