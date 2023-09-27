package product;

public class CustomerTest2 {

	public static void main(String[] args) {
		
		
		
		// 현실에서 부모 없는 자식이 있을 수 없듯이
		// 자바에서도 자식 객체를 생성하면 부모 객체가 먼저 생성된
		// 다음에 자식 객체가 생성된다.
		
		// 아래의 코드에서 자식 VVIPCustomer() 객체만 생성되는 것처럼
		// 보이지만, 사실 부모인 Customer 객체가 먼저 생성되고
		// 그 다음에 자식 VVIPCustomer 객체가 생성된 것이다.
		
		VVIPCustomer vipCust1 = new VVIPCustomer();
		
		
		int price = vipCust1.calcPrice(1000);
		System.out.println(price);
		
		
		
		
	}
}
