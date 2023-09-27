package ex;

public class SingletonEx {

	public static void main(String[] args) {
	
//		new Singleton();
		
		
		Singleton singleton = Singleton.getInstance();
		
		System.out.println(singleton);
		
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton2);
		
		System.out.println(singleton == singleton2);
		
		
	}
	
	
	                        
}

