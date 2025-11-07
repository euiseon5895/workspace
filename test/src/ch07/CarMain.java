package ch07;

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.tire = new Tire();  // 타이어 객체 주입 inject
		car.run();
		
		car.tire = new HankookTire();
		car.run();
		
		car.tire = new KumhoTire();
		car.run();
		
		

	}
}
