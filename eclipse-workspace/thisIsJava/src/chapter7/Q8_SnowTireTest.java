package chapter7;

public class Q8_SnowTireTest {

	public static void main(String[] args) {
		Q8_SnowTire snowTire = new Q8_SnowTire();
		Q8_Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
		
	}
}
