package interfaceEx2;

public class CastingEx {

	public static void main(String[] args) {
		// 인터페이스를 구현한 클래스의 객체를 만든 후에는 타입을 가급적 인터페이스 타입으로 선언하는 습관을 들이셔요...
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
//		vehicle.checkFare();
		
		Bus bus = (Bus)vehicle; // 강제형변환을 통해 checkFare 메서드를 실행
		bus.checkFare();

	
	
	}
}
