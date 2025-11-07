package ch09;

public class CarExample {
	public static void main(String[] args) {
		
		Car car = new Car();
		car.run1();
		car.run2();
		car.run3(new Tire(){
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 3 가 굴러");
			}
		});
	}
}
