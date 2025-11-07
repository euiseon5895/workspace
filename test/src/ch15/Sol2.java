package ch15;

import java.util.Arrays;

public class Sol2 {
	public int[] solution(int n, int[] amount) {
		

		for (int i = 0; i < n; i++) {

			int max = 0;
			int index1 = 0, index2 = 0;
			// 가장 큰 위치 찾기
			for (int k = 0; k < amount.length; k++) {
				if (max < amount[k]) {
					max = amount[k];
					index1 = k;
				}
			}

			// 두번째로 큰 위치 찾기
			max = 0;
			for (int k = 0; k < amount.length; k++) {
				if (max < amount[k] && k != index1) {
					max = amount[k];
					index2 = k;
				}
			}
			// 1큰이랑 2큰이 비교
			if (amount[index1] > amount[index2]) {
				amount[index1] -= (amount[index2] + 10000);
			} else if (amount[index1] == amount[index2]) {
				if (index1 < index2) {
					amount[index1] = 0;
				} else {
					amount[index2] = 0;
				}
			}
		}

		return amount;
	}
}
