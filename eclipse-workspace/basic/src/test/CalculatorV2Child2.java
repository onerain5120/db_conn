package test;

public class CalculatorV2Child2 {

	//필
	int tot;
	double avg;
	int scores[];
	
	//생
	public CalculatorV2Child2() {
	
	}
	
	CalculatorV2Child2(int ... scores){
		this.scores=scores;
	}
	
	
	
	
	//메서드
	
	//1) 누적합(국, 영, 수) 메서드
	int accuSum(int scores[]){  // int scores[] 가 매개변수
	
//		for(int score:scores) {
//			tot = tot + score;	
//		}
		
		for(int i = 0 ; i < scores.length ; i++) {
			tot = tot + scores[i];
		}
			
		return tot;
	}
	
	
	//2) 평균
	double average(){
		double avg =(double) tot / this.scores.length;
		return avg;
	}
	
}
