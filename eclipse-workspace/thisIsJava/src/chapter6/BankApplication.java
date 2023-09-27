package chapter6;

import java.util.Scanner;

public class BankApplication {
	
	
	public static void main(String[] args) {
		
		Accountt acc [] = new Accountt [100];
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------------------------");
			System.out.println("선택");
			int menu = sc.nextInt();
			if(menu == 1) {
				// 계좌 생성하는 코드
				
				System.out.println("---------------------------------------------------------------");
				System.out.println("계좌생성");
				System.out.println("---------------------------------------------------------------");
					
//				BankApplicationService.createAccount();
				
				System.out.println("계좌번호 : ");
				String accNumber = sc.next();
				
				System.out.println("계좌주 : ");
				String accOwner = sc.next();
				
				System.out.println("초기입금액 : ");
				int balance = sc.nextInt();
				 
				Accountt newAcc = new Accountt(accNumber, accOwner, balance);
				 
				acc[0].setAccNumber(accNumber);
				acc[0].setAccOwner(accOwner);
				acc[0].setBalance(balance);
				 
				 
				// 첫번째 계좌가 null인지 여부를 확인한 후에 null일 경우에만 입력이 되게 하고 
				// 100개의 계좌에서 첫번째 계좌에 계좌 넣은 후에
				for ( int i = 0 ; i < acc.length ; i++ ) {
//					acc[i].setAccNumber(accNumber);
//					acc[i].setAccOwner(accOwner);
//					acc[i].setBalance(balance);
					 
					if(acc[i] == null) {
						acc[i] = newAcc;
						System.out.println("결과 : 계좌가 생성되었습니다.");
						break;
					}
					 
					 
					acc[i] = newAcc;
					System.out.println("결과 : 계좌가 생성되었습니다.");
				}
				 
				 
			} else if(menu == 2) {
				 System.out.println("계좌목록");
			} else if(menu == 3) {
				 System.out.println("예금");
			} else if(menu == 4) {
				 System.out.println("출금");
			} else if(menu == 5) {
				flag = false;
			} else {
				System.out.println("1,2,3,4,5 만 넣으세요");
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
