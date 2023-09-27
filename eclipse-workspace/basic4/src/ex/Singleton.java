package ex;


// 싱글톤 패턴
public class Singleton {

	// 필(인, 스, final), 접근(퍼 프 디 피)
	private static Singleton singleton = new Singleton();
	
	
	// 생
	private Singleton() {
		
	}
	
	
	// 메
	public static Singleton getInstance() {
		return singleton;
	}
	
	
}
