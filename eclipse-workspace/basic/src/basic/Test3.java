package basic;

public class Test3 {

	public static void main(String[] args) {
	
		Person person = new Person();
		
		person.action(new Workable() {
			
			@Override
			public void work() {
				System.out.println("공부하자구요!!!!!");
			}
		});
		
		
	}
	
}




