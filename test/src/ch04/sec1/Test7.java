package ch04.sec1;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bank=0;
		while(true) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고| 4. 종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			String num = sc.nextLine();
			switch(num) {
				case "1":
					System.out.print("예금액>");
					int input = Integer.parseInt(sc.nextLine());
					bank +=input;
					break;
				case "2":
					System.out.print("출금액>");
					int out = Integer.parseInt(sc.nextLine());
					bank-=out;
					break;
				case "3":
					System.out.printf("잔고>%d\n",bank);
					break;
			}
			if("4".equals(num)) {
				System.out.println("프로그램 종료");
				break;
			}
		}
}
}
