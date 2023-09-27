package basic4;

// 계산기 틀 클래스
public class PrEx5 {  // 계산기
	
// 필드는 기본형, 참조형(배열, 열거, 클래서, 인터페이스)
	
	int arr[];
	
//---------------------------------------------------------------------------	
	
	// 생(기본) : 객체를 초기화
	public PrEx5() {
		
	}
	
	public PrEx5(int arr[]) { // 대괄호 위치는 상관없음
		this.arr = arr;
	}
	
//---------------------------------------------------------------------------	
		
	// 메소드(함수) 누적해라!!!, 동사는 기능(함수)을 가지고 있어야 함
	int accu(int arr[]) {
//		this.arr = arr;
		
		int tot = 0;
		for(int i = 0 ; i < arr.length ; i++ ) {
			tot = tot + arr[i];
		}
		return tot;
	}

	double avg(int arr[]) {
		int tot = accu(arr);
		return (double)tot / arr.length;
	}

}


