package travel;

public class CoffeeShop {
	
	
	int income =0;
	int price;
	double per;
	int count=0;
public CoffeeShop() {
}
	
public void sell(String menu){
	if(menu.equals("americano")) {
		price = 3500;
		income+=price;
		count++;
		System.out.println(income);
	}
	else if(menu.equals("latte")) {
		income =4000;
		income+=price;
		count++;
	}
	
	}
public void checkCustomer() {
	System.out.println(count);
	
} 
}
