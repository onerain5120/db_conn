package chapter6;

public class Account {

	// 필
	private int balance;
	final int min_balance = 0;
	final int max_balance = 1000000;
	
	
	// 생
	public Account() {
	
	}

	
	// 메
	
	public void setBalance(int balance) {
		if(min_balance <= balance && balance <= max_balance) {
			this.balance = balance;
		} 
	}
	
	public int getBalance() {
		return balance;
	}

	
	// 실행
	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		
		
	}
}
