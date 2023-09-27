package basic;

public class ForEx4 {
	
	public static void main(String[] args) {
		
//		for (int i = 0; i < 10 ; i++) {
//			
//			System.out.println(i);
//			
//			if(i == 7) {
//				continue;
//				
//			}
//			
//			System.out.println("----------");
//			
//		}

		
//		for (int i = 0; i < 10 ; i++) {
//			
//			// 반복하다가 continue 를 만나면 그 밑 부분은 건너뛰고 다시 돌아라!!!!!
//			
////			System.out.println(i);
//			
//			if(true) {
//				continue;
//			}
//			
//			System.out.println(i);
//			
//		}
		
		
		
		for (int i = 1; i < 10 ; i++) {
			
			// 반복하다가 continue 를 만나면 그 밑 부분은 모두 건너뛰고 for 문을 다시 돌아라!!!!!
			
			
			if(i % 2 == 0) {
				continue;
			}

			System.out.println(i);
		}
		
	}

}
