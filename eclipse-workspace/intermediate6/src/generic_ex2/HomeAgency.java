package generic_ex2;

public class HomeAgency implements Rentable<Home> {

	@Override
	public Home rent() {
		
//		Home home = new Home();
//		return home;
		
		return new Home();
		
	}
	
	
}
