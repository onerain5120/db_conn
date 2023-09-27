package product;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		
		
//		System.out.println(cust1.customerGrade);
//		System.out.println(cust1.bonusRatio);
//		
//		int price = cust1.calcPrice(1000);
//		System.out.println("cal1 고객이 " + price + "원 짜리 물건을 샀다.");
		
		cust1.setcustomerID(10010);
		cust1.setCustomerName("홍길동");
		
		String info = cust1.showCustomerInfo();
		int id = cust1.getcustomerID();
		System.out.println(id);
		System.out.println(info);

		System.out.println("-------------------------");
		
		System.out.println(cust1.calcPrice(1000) + "원 짜리 물건을 삼");
		String info2 = cust1.showCustomerInfo();
		System.out.println(info2);
		
		System.out.println("-------------------------");
		
		System.out.println(cust1.calcPrice(2000) + "원 짜리 물건을 삼");
		String info3 = cust1.showCustomerInfo();
		System.out.println(info3);
		
		
		System.out.println("==========================");
		
		Customer cust2 = new Customer();
		
		cust2.setCustomerName("이순신");
		
		System.out.println(cust2.calcPrice(1000000) + "원 짜리 물건을 삼");
		String info4 = cust2.showCustomerInfo();
		System.out.println(info4);
		
		System.out.println("-------------------------");
		
		System.out.println(cust2.calcPrice(5000000) + "원 짜리 물건을 삼");
		String info5 = cust2.showCustomerInfo();
		System.out.println(info5);
		
		
	
	}
	
}
