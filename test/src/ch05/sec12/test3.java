package ch05.sec12;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] scores = null ;
		

		while(true) {
			
			System.out.println("--------------------");
			System.out.println("1. 학생수 2. 점수입력 3. 점수리스트 4. 분석 5. 종료");
			System.out.println("--------------------");
			
			System.out.print("선택>");
			String num = sc.nextLine();
			
			if("1".equals(num)) {
				System.out.print("학생수>");
				int count = Integer.parseInt(sc.nextLine());
				scores = new int[count];
			}
			else if("2".equals(num)) {
				if(scores==null) {
					System.out.println("학생수 입력하세요");
					continue;
				}
				for(int i=0;i<scores.length;i++) {
					System.out.printf("scores[%d]>",i);
					int score = Integer.parseInt(sc.nextLine());
					scores[i] = score;
				}
				
			}
			else if("3".equals(num)) {
				for(int i=0;i<scores.length;i++) {
					System.out.printf("scores[%d]> %d",i,scores[i]);
					System.out.println();
				}
				
			}
			else if("4".equals(num)) {
				int sum=0;
				for (int i = 0; i < scores.length; i++) {
					sum+=scores[i];
				}
				double avg = (double)sum/scores.length;
				System.out.printf("평균점수: %f\n",avg);
			}
			else if("5".equals(num)) {
				break;
			}
			
		}
				
	}
}
