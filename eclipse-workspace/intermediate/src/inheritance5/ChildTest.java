
package inheritance5;

public class ChildTest {

	public static void main(String[] args) {
		
		// 자식 객체 생성
		Child child = new Child();
		
		// 자식의 주소
		System.out.println(child);
		
		// 자동형변환 후
		Parent parent = child;
		// 부모의 주소
		System.out.println(parent);
		
		System.out.println(parent == child);
	
		
		parent.method1();
		
		parent.method2();
		
		
//		parent.method3(); 호출이 불가능

		// 부모 타입이 Child로 강제형 변환 후에 자식 메서드에는 접근 가능
		Child pp3 = (Child)parent; 
		pp3.method3();
	}
}


