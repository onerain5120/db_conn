package inheritance2;

// MainTest 틀이지만 이 프로그램을 실행만 하기 위한 틀
// 그래서 이 틀 안에는 필생메를 따로 정의할 필요는 없고
// 단지 메인 메서드만 넣어 놓고 실행만 하면 됨
// 실행하려고 보니
// 실제 세계에 있는 사람이 실제 차를 타고 다니는 상황을 묘사하고자 함
// 실체화 된 객체들이 현실게계에 돌아나닌다는 생각으로
// 틀에서 객체를 만들어내는 것이 우선임
// 그래서 사람 틀과 차 틀에서 실체화된 객체를 먼저 만들어 주고
// 둘 간의 관계를 생각해보자......
// 사람이 차를 소유하는 관계이므로 그런 메서드를 차에 선언해서
// 그 차의 소유자를 정해보자,,,,

public class MainTest {
	

	public static void main(String[] args) {
		Person hong = new Person("홍길동");
		System.out.println(hong.name);

		Car flmodel = new Car("F사", "람보**");
		System.out.println(flmodel.company + flmodel.model);
	
		
		flmodel.drive1("홍길동");
		
//		System.out.println();
		
		Person kim = new Person("김삿갓");
		flmodel.drive1(kim);
		
//		flmodel.owner(hong);
		
		String status = flmodel.take();
	
		System.out.println(hong.name + "사람이" + " " + status);
	
	}
}



