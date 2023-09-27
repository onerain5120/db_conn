package generic_ex;

public class GenericEx {

	public static void main(String[] args) {
		
		Box box1 = new Box();
		
		box1.content = "apple";
		
		box1.content = 10;
		System.out.println(box1.content);
		
		
		// 정확한 사용법은 아래와 같다.	Box<String>를 데이터 타입으로 보는 것이 편함
		// Box 객체가 생성된 시점에 다른 타입으로 대체됨, 타입 체크 후 형변환 미리 해놓음
		Box<String> box2 = new Box<String>();
//		box2.content = 10;
		box2.content = "banana";
		
		// 이번에는 당연히 정수도 들어갈 수 있다.
		Box<Integer> box3 = new Box<>();
//		box3.content = "tomato";
		box3.content = 3;
		
	}
	
}
