package abstractEx2;

public class AnimalTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
//		
//		dog.sound();
		Cat cat = new Cat();
//		
//		
//		cat.sound();
		
		animalSound(dog);	
		animalSound(cat);	
		
		
	}
	
	static void animalSound(Animal animal) {
		animal.sound();
	}
	
	
}	

