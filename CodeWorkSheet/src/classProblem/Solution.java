package classProblem;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void main(String[] args) {

		int n = 6;
		int[] amounts = { 30000, 70000, 10000
				};

		int[] answer = solution(n, amounts);
		for (int i : answer) {
			System.out.println(i);
		}

	}

	public static int[] solution(int n, int[] amount) {
		int [] answer = new int[n];
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<amount.length;i++) {
			list.add(amount[i]);
		}
		
		
		// 경매 n번 시작
		for(int i=0;i<n;i++) {
		
			//내림차순 정렬
			list.sort((a1,a2)->{
				return a2-a1;	
			});
		
			int first = list.get(0);
			int second = list.get(1);
			int price  = 0
					;
			
			if(first>second) {
				price = second + 10000;
			}else if(first==second) {
				price = first;
			}
			
			
			
			list.set(0,first - price);
			
			
			answer[i] = price;
			
			
			
			
		}
	
		
		
		return answer;
	}
}
