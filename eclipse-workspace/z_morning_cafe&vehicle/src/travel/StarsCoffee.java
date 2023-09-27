package travel;

public class StarsCoffee extends CoffeeShop {

	@Override
	public void sell(String menu) {
		if(menu.equals("starsTee")) {
			price = 5500;
			income+=price;		
		}
	}
	

}