package generic_ex01;

public class GenericEx {
	
	public static void main(String[] args) {
		Box box = new Box();
		
		box.content = 10;
		System.out.println(box.content + "는 정수입니다");
		
		box.content = "문자열";
		System.out.println("저는 " + box.content + "입니다.");
		
		Box<String> box2 = new Box<>();
		box2.content = "문자열";
		System.out.println("저는 " + box2.content + "밖에 안 들어갑니다.");
		
		Box<Integer> box3 = new Box<>();
		box3.content = 10;
		System.out.println("저는 " + box3.content + "같은 정수밖에 안 들어갑니다.");		
	}
}
