package chapter8;

public class Q6_SoundableExample {
	
	public static void printSound(Q6_Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	
	public static void main(String[] args) {
		
		printSound(new Q6_Cat());
		printSound(new Q6_Dog());
		
	}

}
