package classProblem.moneyP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Bank bank = new Bank();
		
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			
			
			int selectNo = scanner.nextInt();

			// 입력한 값에 따라 처리
			if(selectNo==5) {
				System.out.println("프로그램 종료");
				break;
			}
			if(selectNo==1) {
				
				System.out.println("---------------");
				System.out.println("계좌생성");
				System.out.println("---------------");
				
				System.out.print("계좌번호: ");
				int num = scanner.nextInt();
				scanner.nextLine();
			
				System.out.print("계좌주: ");
				String name = scanner.nextLine();
				
				System.out.print("초기입금액: ");
				int coin = scanner.nextInt();
				
				bank.createAccount(num,name,coin);
				
			}
			if(selectNo==2) {
				bank.accountList();
			}
			
			
		}
	}
}