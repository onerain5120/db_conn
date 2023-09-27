package product;

public class VIPCustomer extends Customer {

	// 필
//	private int customerID;
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;
	
	private int agentID;  // VIP 고객 담당 상담원 아이디
	double saleRatio;

	
	// 생
	public VIPCustomer() {
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
//		System.out.println("Customer() 생성자 호출");
	}
	
	
	
	// 메
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		
		return price - (int) (price * saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
	
//	public String showCustomerInfo() {
//		return customerName + " 님의 등급은" + this.customerGrade + "이며, " + "보너스 포인트는 " + bonusPoint + "입니다.";
//	}
	
}
