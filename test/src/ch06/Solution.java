package ch06;

class Solution{
	public int solution(int m ,int[] ledger) {
		int account =0;
		m*=-1;
		int len = ledger.length;
	
		for(int i=0;i<len;i++) {
		
			int temp = account+ledger[i];
			if(m<=temp) {
				account = temp;
			}
			
		}
		System.out.println(account);
		return account;
	}
}
