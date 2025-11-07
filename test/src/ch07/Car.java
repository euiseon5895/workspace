package ch07;

public class Car {
	public Tire tire;     //객체가 없음 -> tire 타입의 객체가 주입됩니다 나중에 이마와 나이
	
	public void run() {
		tire.roll();
	}
}
