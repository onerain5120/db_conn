package travel;

public class BacksCoffee extends CoffeeShop {
	BacksCoffee backs =new	BacksCoffee();
	
	public BacksCoffee() {

	}
	public void sell(String menu) {
		super.sell(menu);
		if(menu.equals("backsTee")) {
			price= 4500;
			income +=price;
			System.out.println(backs.income);
			
		}
	}

}
