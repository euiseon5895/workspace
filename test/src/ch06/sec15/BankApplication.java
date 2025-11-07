package ch06.sec15;

import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {
		Account[] arr = new Account[100];
		int cnt=0;
		Scanner sc = new Scanner(System.in);
		while(true) {
		
			System.out.println("------------------------------------");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println("------------------------------------");
			
			System.out.print("선택>");
			int temp = Integer.parseInt(sc.nextLine());
			
			if(temp==5) {
				System.out.println("프로그램 종료");
				break;
			}
			if(temp==1) {
				System.out.print("계좌번호: ");
				String numtemp = sc.nextLine();
				System.out.print("계좌주: ");
				String nametemp = sc.nextLine();
				System.out.print("초기입금액: ");
				int moneytemp = Integer.parseInt(sc.nextLine());
				Account acnt = new Account(numtemp,nametemp,moneytemp);
				System.out.println("계좌가 생성되었습니다");
				
				arr[cnt++] = acnt;
				System.out.println(cnt);
			}
			
			if(temp==2) {
				for(int i=0;i<cnt;i++) {
					System.out.println(arr[i].toString());
				}
			}
			if(temp==3) {
				System.out.println("-----------");
				System.out.println("예금");
				System.out.println("-----------");
				int c=0;
				System.out.print("계좌번호");
				String name = sc.nextLine();
				for(int i=0;i<cnt;i++) {
					if(name.equals(arr[i].getName())) {
						c = i;
					}
				}
				System.out.print("예금액: ");
				int mon = Integer.parseInt(sc.nextLine());
				mon+=arr[c].getMoney();
				arr[c].setMoney(mon);
			}
			if(temp==4) {
				System.out.println("-----------");
				System.out.println("출금");
				System.out.println("-----------");
				int c=0;
				System.out.print("계좌번호:");
				String name = sc.nextLine();
				for(int i=0;i<cnt;i++) {
					if(name.equals(arr[i].getName())) {
						c = i;
					}
				}
				System.out.print("출금액: ");
				int mon = Integer.parseInt(sc.nextLine());
				if(mon<arr[c].getMoney()) {
					int mm = arr[c].getMoney();
					mm-=mon;
					arr[c].setMoney(mm);
					System.out.println("출금을 성공함");
				}else {
					System.out.println("출금 실패...");
				}
				
			}
		}
	}
	      
}
