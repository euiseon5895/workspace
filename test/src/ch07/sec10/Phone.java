package ch07.sec10;

public abstract class Phone {
	String owner;
	
	Phone(String owner){
		this.owner = owner;
	}
	public abstract void call() ;
	
	
	void turnOn() {
		System.out.println("폰 전원 킴");
	}
	void turnOff() {
		System.out.println("폰 전원끔");
	}
}
