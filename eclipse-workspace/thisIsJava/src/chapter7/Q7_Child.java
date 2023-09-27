package chapter7;

public class Q7_Child extends Q7_Parent{

	public String name;
	
	public Q7_Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Q7_Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
