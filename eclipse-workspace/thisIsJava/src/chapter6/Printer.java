package chapter6;

public class Printer {

	
	// 생
	
	public Printer() {
		
	}

	
	
	// 메
	static void println(int a) {
		System.out.println(a);
	}

	static void println(boolean b) {
		System.out.println(b);
	}
	
	static void println(double c) {
		System.out.println(c);
	}
	
	static void println(String d) {
		System.out.println(d);
	}
	
	
	public static void main(String[] args) {
		
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
		
	}
	
}
