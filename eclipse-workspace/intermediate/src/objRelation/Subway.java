package objRelation;

public class Subway {

// 필
	//버스 번호
	int lineNumber;
		
	//승객수
	int passengerCount;
		
	//지하철 수입
	int money;

	
	
// 생
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
		
	
	
// 메
	void takeSubway(int money){
		this.money +=money;
		passengerCount++;
	}
		
	void showInfo(){
		System.out.println(lineNumber+"호선의 승객은 "+ passengerCount +"명이고, 수입은 " +  money + "원 입니다.");
	}
	
}
