package charge;

public class Student {
	
	// v1
	// 필
	String name;
	int money;
	
	Bus bus = new Bus(100, 1 ,1000);
	Subway sub = new Subway(2, 1, 1500);
	
	// 생
	public Student() {
		
	}
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;		
	}
	
	// 메
	void info() {
		
		System.out.println(name + "님의 남은 돈은 " + (money - bus.bIncome) + "원 입니다.");
		System.out.println("버스 " + bus.bNum + "번의 승객은 1명이고, 수입은" + bus.bIncome + "원 입니다.");
	}

//	void subCharge() {
//		
//		System.out.println(name + "님의 남은 돈은 " + (money - sub.sIncome) + "원 입니다.");
//		System.out.println(bus.bNum + "호선 승객은 1명이고, 수입은 " + sub.sIncome + "원 입니다.");
//	}
	
}
