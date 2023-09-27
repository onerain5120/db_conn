package inheritance;

import java.util.Random;
import java.util.Scanner;

public class Americano extends Coffee{

	// 필
	public String iceHot;
	
	
	// 생
	public Americano(String type) {
		Random rd = new Random();
		this.number = rd.nextInt(1, 100);
		this.type = type;
	}
	
	// 메
	public void order(String order) {
		Scanner sc = new Scanner(System.in);
		System.out.print("hot / ice 중 하나 입력 : ");
		this.iceHot = sc.next();
		
		System.out.println(this.number + "번 고객님");
		System.out.print("주문하신 " + "(" + iceHot + ")" + order + " 나왔습니다.");
//		System.out.println(order + " 나왔습니다.");
	}
}
