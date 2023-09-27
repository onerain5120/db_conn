package travel;

public class Person {
	 
	String name;
	int money;
	CoffeeShop coffeeShop = new CoffeeShop();
	String menu;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void  buy(String menu) {
		this.menu=menu;
		coffeeShop.sell(menu);
		System.out.println("11");
	}
	
}
