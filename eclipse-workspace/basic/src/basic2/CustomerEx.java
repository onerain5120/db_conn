package basic2;

public class CustomerEx {
	
	public static void main(String[] args) {
		
		// 이름 name, 주소 address, 나이 age, 성별 sung
		
		Customer cust1 = new Customer();
		
//		System.out.println(cust1);
		
		cust1.name = "홍일동";
		cust1.address = "성남";
		cust1.age = 33;
		cust1.sung = '남';
		
		System.out.println(cust1.name + cust1.address + cust1.age + cust1.sung);
		
		 System.out.println("--------------------------------------------------");
		
		Customer cust2 = new Customer();
		
//		System.out.println(cust2);
		
		cust2.name = "홍이동";
		cust2.address = "서울";
		cust2.age = 23;
		cust2.sung = '여';
		
		System.out.println(cust2.name + cust2.address + cust2.age + cust2.sung);
		
		
	}
}
	
	