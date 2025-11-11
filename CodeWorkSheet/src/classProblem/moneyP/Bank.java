package classProblem.moneyP;

import java.util.List;
import java.util.ArrayList;

public class Bank {
	private List<Account> accountList = new ArrayList<Account>();
	
	// 계좌생성
	public void createAccount(int num,String name,int coin) {
		Account a = new Account();
		
		a.setNum(num);
		a.setName(name);
		a.setCoin(coin);
		accountList.add(a);
	}
	
	// 계좌목록출력
	public void accountList() {
		for (Account account : accountList) {
			System.out.println(account.toString());
		}
	}
	
	// 예금하기
	public void deposit() {
		
	}
	
	// 출금하기
	public void withdraw() {
		
	}
	
	// 매개변수(계좌번호)와 동일한 Account 객체 찾기
	private Account findAccount(String ano) {
		for (Account account : accountList) {
			if(account.name.equals(ano)) {
				return account;
			}
		}
		Account ac = new Account();
		ac.setName("깡통");
		return ac;
	}
}