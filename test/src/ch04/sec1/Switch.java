package ch04.sec1;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean  run = true;
		int speed = 0;
		
		while(run) {
			
			System.out.println("--------------------------");
			System.out.println("1. 증속| 2. 감속| 3. 중지");
			System.out.println("--------------------------");
			System.out.print("선택: ");
			
			String strNum = sc.nextLine();
			
			if("1".equals(strNum)) {
				speed++;
				System.out.println("현재 속도 = "+speed);
			}else if("2".equals(strNum)) {
				speed--;
				System.out.println("현재 속도 = "+speed);
			}else if("3".equals(strNum)){
				run = false;
			}
		}
		
		
	}

}
