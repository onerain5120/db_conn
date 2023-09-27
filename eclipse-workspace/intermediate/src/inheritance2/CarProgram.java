package inheritance2;

public class CarProgram {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		for( int i = 1 ; i <= 5 ; i++ ) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1 : 
				System.out.println("앞 왼쪽 교체");
				break;
			case 2 : 
				System.out.println("앞 오른쪽 교체");
				break;
			case 3 : 
				System.out.println("뒤 왼쪽 교체");
				break;
			case 4 : 
				System.out.println("뒤 오른쪽 교체");
				break;
			}
			
			System.out.println("-------------");
		}
		
		
		
		
	}
}
