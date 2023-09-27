package basic6;

public class AreaCalc {

	// 필
	
	
	
	
	
	// 생
	
	
	
	
	
	// 메소드(함수) 기능(동사) ~를(목적격) ~하다. 목적격을 매개변수로 만들어서 코딩하는 연습을 많이 하시기 바랍니다.
	
	
//	면적(변의 길이)을 구하라   가로 width 세로 height
	// 정사각형
	double areaRctangle(double width) {
		return width * width;
	}
	
	
	// 직사각형
	// 메서드 overloading(메서드명 동일, 타입, 개수, 순서는 다름)
	double areaRctangle(double width, double height) {
		return width * height;
	}
}
