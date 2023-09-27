package basic6;

public class CalculatorCircleTest {

	public static void main(String[] args) {
		
		// 원마다의 색깔은 객체를 여러개 만들어서 원 객체의 색깔을 넣어줌
		
		CalculatorCircle calculatorCircle = new CalculatorCircle();
		calculatorCircle.color = "파랑";
		
		System.out.println(calculatorCircle.color);
		
		CalculatorCircle calculatorCircle2 = new CalculatorCircle();
		calculatorCircle2.color = "빨강";
	
		System.out.println(calculatorCircle2.color);
		
		
		double radius = 10.0;
		
		
		double result = CalculatorCircle.pi * radius * radius;
		System.out.println(result);
		
		
		
		int result2 = CalculatorCircle.plus(5, 6);
		System.out.println(result2);
		
		
	}
	
}
