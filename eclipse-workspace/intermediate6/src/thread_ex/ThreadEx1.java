package thread_ex;

public class ThreadEx1 {

	public static void main(String[] args) {
		
		// 1)
		Thread thread = new Thread(new Runnable() {  // 스레드를 실행하는 방법 : 스레드 클래스로 스레드 객체를 만들어 실행
													 // 매개변수 자리에는 Runnable 클래스를 만들고, 그 안에서 run 메서드로 재정의하여 원하는 코드 생성
			
			@Override
			public void run() {
				for ( int i = 0 ; i < 10 ; i++ ) {
					System.out.println("*");
					
					try {
					Thread.sleep(700);	// 해당 스레드를 원하는 시간만큼 멈춤 -> 예외처리를 사용하여 실행시켜야 함
					} catch(InterruptedException e) {
						
					}
					
				}
			}
		});
		
		
		thread.start();  // 스레드를 실행하려면 반드시 start 메서드를 이용하여 실행해야 함
		
		
		System.out.println("==================");
		
		// 위의 1)과 같음
		// 2)
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for ( int i = 0 ; i < 10 ; i++ ) {
					System.out.println("땅");
					
					try {
					Thread.sleep(600);
					} catch(InterruptedException e) {
						
					}
					
				}
			}
		});
		
		thread2.start();
		
// 스레드는 동시에 코드를 진행할 수 있기 때문에 게임을 만들 때 많이 쓰임 ex) 비행기가 동시에 날아다니는 게임, 우리가 했던 지렁이 게임
		
		
	}

}
