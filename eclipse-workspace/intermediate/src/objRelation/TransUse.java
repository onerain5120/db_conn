package objRelation;

public class TransUse {

	public static void main(String[] args) {

		
		//사람 객체
		
//		Student james =	new Student("제임스", 10000);
//		System.out.println("----오전--");
//		Bus bus=new Bus(100);		
//		james.takeBus(bus);		
//		james.showInfo();
//		bus.showInfo();
//		System.out.println("-----점심----");
//		Bus bus200=new Bus(200);
//		james.takeBus(bus200);	
//		james.showInfo();
//		bus200.showInfo();
//		
//		
//		Subway line2=  new Subway(2);
//		
//		james.takeSubway(line2);
//		james.showInfo();
//		line2.showInfo();
//		
//		james.takeSubway(line2);
//		james.showInfo();
//		line2.showInfo();
//		System.out.println("---- 마지막---");
//		james.takeBus(bus200);	
//		james.showInfo();
//		bus200.showInfo();
		
		System.out.println("============================================");
		Subway subway = new Subway(2);
		
		Student thomas = new Student("토마스", 10000);
		thomas.takeSubway(subway);
		thomas.showInfo();
		subway.showInfo();
		System.out.println("--------------------------------------------");
		
		
		Student hong1 =	new Student("홍일동", 7000);
		hong1.takeSubway(subway);
		hong1.showInfo();
		subway.showInfo();
		
		System.out.println("============================================");
		
		
		// 한번에 10명, 다 동일하게 돈을 5000원씩 , 100번 버스에 태우기
		
//		Student stu[]=new Student[100];
//		for(int i=0;i<stu.length;i++) {			
//			stu[i] = new Student( "김일동"+(i+1), 5000 );
//			stu[i].takeBus(bus);
//			stu[i].showInfo();
//			bus.showInfo();
//			System.out.println("===>한명씩 타고 있음");
//		}
		
		
		
		
		
		
		
	}

}
