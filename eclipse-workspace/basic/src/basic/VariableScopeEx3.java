package basic;

public class VariableScopeEx3 {

	public static void main(String[] args) {

		
		int var = 15;
		
		// 제어문 ( if(조건), for와 while(반복문) )
		
		
		// if문의 가장 기본 형태
		if(true) {
			int var2 = 20;
			System.out.println(var);
			System.out.println(var2);
			}
		
		
//		System.out.println(var2); 변수 {} 범위(영역), 영역에서만 인식되는 개념이 있다. name scope(변수명이 인식되는 범위)
		
	
//		if(false) {
//			System.out.println("이것은 참이므로 찍힌다.");
//		}
		
		
		
		
		
	}

}
