package base_ex4;

public class ClassEx {

	
	public static void main(String[] args) {
		
		
		// 객체 만든 후 그 객체에 대한 메타 데이터 가져오기
//		Car car = new Car();
//		Class cls = car.getClass();
//		System.out.println(cls);
//		System.out.println(" Car 객체의 메타 데이터에서 이름 : " + cls.getName());
//		System.out.println(" Car 객체의 메타 데이터에서 간단한 이름 : " + cls.getSimpleName());
//		System.out.println(" Car 객체의 메타 데이터에서 간단한 패키지 : " + cls.getPackageName());
	
		// 객체 만들지 않고 하는 메타 데이터 가져오는 방식
		
		
		
		
		try {
			Class cls = Class.forName("base_ex4.Car");
			
			
			System.out.println(cls.getName());
		} catch (Exception e) {
			System.out.println("그런 클래스는 없어요.");
			e.printStackTrace();
		}
	}
}
