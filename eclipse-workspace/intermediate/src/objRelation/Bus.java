package objRelation;

public class Bus {
	
// 필
	//버스 번호
	int busNumber;
	
	//승객수
	int passengerCount;
	
	//버스 수입
	int money;

	
	
// 생
	public Bus(int busNumber) {
		
		this.busNumber = busNumber;
	}
	
	
	
// 메
	void takeBus(int money){
		this.money +=money;
		passengerCount++;
	}
	
	void showInfo(){
		System.out.println("버스" + busNumber +"번의 승객은 "+ passengerCount +"명이고, 수입은 " +  money + "입니다.");
	}
	

}
