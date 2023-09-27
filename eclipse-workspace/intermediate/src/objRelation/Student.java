package objRelation;

public class Student {
	
//필
	public String studentName;
	int money;
	
	
	
//생
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	
//메
	//버스를 탄타

	void takeBus(Bus bus){
		bus.takeBus(1000);
		this.money=this.money-1000;    //this.money-=1000;
		
	}
	
	//전철을 탄다
	void takeSubway(Subway subway ){
		subway.takeSubway(1500);
		this.money=this.money-1500; 
	}
	
	//잔돈
	void showInfo() {
		System.out.println(studentName+"님의 남은돈은 " + money + "원 남음");
	}
	

}
