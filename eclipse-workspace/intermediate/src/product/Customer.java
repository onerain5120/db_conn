package product;

public class Customer {

	// 필
	private int customerID;
	private String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	
	
	// 생
	public Customer() {
		this.customerGrade="SILVER";
		this.bonusRatio=0.01;
		System.out.println("Customer() 생성자 호출");
	}
	
	
	
	// 메
	public void setcustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public int getcustomerID() {
		return customerID;
	}
	
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setcustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	public String getcustomerGrade() {
		return customerGrade;
	}
	
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	
	String showCustomerInfo() {
		return customerName + " 님의 등급은 " + this.customerGrade + "이며, " + "보너스 포인트는 " + bonusPoint + "입니다.";
	}

}
