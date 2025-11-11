package classProblem.moneyP;


public class Account {
	// 계좌번호, 계좌주, 잔액 필드 생성
	// getter / setter 메서드 생성
	int num;
	String name;
	int coin;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCoin() {
		return coin;
	}
	public void setCoin(int coin) {
		this.coin = coin;
	}
	@Override
	public String toString() {
		return num+"\t"+name+"\t"+coin;
	}
	
	
}
