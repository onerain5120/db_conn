package cafe_v2;

public class StarCafe {

	// 필
	int money;
	int amePrice;
	int lattePrice;
	String name;
	
	
	// 생
	public StarCafe() {
		amePrice = 4000;
		lattePrice = 4500;
		name = "별 다방";
	}
	
	
	// 메
	
	void profit(String price) {
		if (price == "ame") {
			money += amePrice;
		} else {
			money += lattePrice;
		}
		System.out.println(name + "의 수익은 " + money + "원 입니다.");
	}
	
	
}
