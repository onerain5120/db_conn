package polymorphism3;

public class AnimalTest {
	
	
	
	public static void main(String[] args) {
		
		Move move = new Move();
		Animal animal = new Animal();
		Human human = new Human();
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		
		move.moveAnimal(animal);
		move.moveAnimal(human);
		move.moveAnimal(tiger);
		move.moveAnimal(eagle);
		
		
		
	}
}
