package classProblem;

import java.util.ArrayList;
import java.util.List;

public class AccountProblem {
	public static void main(String[] args) {
		String[] accounts = { "4514--234495-1", "305-44-291501", "1-2-34-495-8623", "492134545151", "623-421523-67341",
				"-5439-59639921", "6235-7X3+47-7456", "98-76-543-210", "512-73-634901", "000-999999-22555",
				"064-82-792561" };

		List<String> list = new ArrayList<>();

		for (int i = 0; i < accounts.length; i++) {
			String temp = accounts[i];
			int flag = 0;

			// -,숫자 제외 이상한거 있는지
			for (int j = 0; j < temp.length(); j++) {
				if (temp.charAt(j) >= '0' && temp.charAt(j) <= '9') {

				} else if (temp.charAt(j) == '-') {

				} else {
					flag = 1;
				}

			}

			// 11~14 사이인지
			int numCnt = 0;

			for (int j = 0; j < temp.length(); j++) {
				if (temp.charAt(j) >= '0' && temp.charAt(j) <= '9') {
					numCnt++;
				}
			}
			
			if(numCnt<11||numCnt>14) {
				flag=1;
				
			}
			

			// 처음과 끝 - 인지
			if (temp.charAt(0) == '-' || temp.charAt(temp.length() - 1) == '-') {
				flag = 1;
			}
			// 연속으로 - 나오는지
			for (int j = 0; j < temp.length() - 1; j++) {
				if (temp.charAt(j) == '-' && temp.charAt(j + 1) == '-') {
					flag = 1;
				}
			}
			// -4개 이상인지
			int cnt = 0;
			for (int j = 0; j < temp.length(); j++) {
				if (temp.charAt(j
						) == '-') {
					cnt++;
				}
			}
			if (cnt > 3) {
				flag = 1;
			}
			//
			if (flag == 0) {
				list.add(temp);
			}
		}
		
		//같은 은행 분류
		
		
		
		
		
		

		

	}
}
