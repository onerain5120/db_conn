package product;

public class VVIPCustomer extends Customer {

	
	// @Override annotation
	// annotation 은 일종의 주석으로 여기서는
	// @Override annotation 이 자동으로 붙음
	// 재정의를 하라라는 가이드 역할을 하면서 컴파일러(이클립스)에게 알려주는 역할!!!
	
	
	public VVIPCustomer() {
		
	}
	
	
	@Override
	public int calcPrice(int price) {
		
		System.out.println("hi");
		
		return 0;
	}


}
