package cafe_v1;

public class BeanCafe {
	
	// 필
	int money;
	int amePrice;
	int lattePrice;
	String name;
	
	
	// 생
	public BeanCafe() {
		amePrice = 3000;
		lattePrice = 3500;
		name = "콩 다방";
	}
	
	
	// 메
	void ame() {
		money += 4000;
		System.out.println(name + "의 수익은 " + money + "원 입니다.");
	}
	
	void latte() {
		money += 4500;
		System.out.println(name + "의 수익은 " + money + "원 입니다.");
	}
	
	
}





