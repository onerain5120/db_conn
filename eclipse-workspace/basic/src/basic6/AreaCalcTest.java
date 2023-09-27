package basic6;

public class AreaCalcTest {

	public static void main(String[] args) {
		
		
		// 객체를 만드는 행위
		// 객체를 만들기 위해선 틀이 있어야 함
		// 틀 정의
		// 틀에서 빠져나오는 행위(생성한다.)
		
		// 생성하는 형태
		// 기본 생성자를 이용할 수도 있고
		// 다양한 생성자를 만들어서 객체 초기화한 후에 그 객체를 가지고 필드나 메서드에 접근해서(.) 필드의 값을 변경하거나
		// 메서드를 실행함
		
		
		AreaCalc areaCalc = new AreaCalc();
		
		//areaCalc
		
		double result = areaCalc.areaRctangle(10);
		System.out.println(result);
		
		
		double result2 = areaCalc.areaRctangle(10, 20);
		System.out.println(result2);
	}
	
}
