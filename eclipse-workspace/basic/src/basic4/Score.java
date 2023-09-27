package basic4;

public class Score {  // 국어, 영어, 수학 점수의 합계와 평균 구하기

	// 필
	
	int arr[];
	
	// 생
	public Score() {
		
	}
	
	public Score(int arr[]) {
		this.arr = arr;
	}
	
	
	
	// 메
	int add(int arr[]) {
		
		int tot = 0;
		
		for ( int i = 0 ; i < arr.length ; i++ ) {
			tot = tot + arr[i];
		}
		
		return tot;
	}
	
	double avg(int arr[]) {
		int tot = add(arr);
		
		return (double)tot/arr.length;
	}
	
}