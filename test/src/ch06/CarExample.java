package ch06;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1.toString());
		
		
		Car car2 = new Car("자가용");
		System.out.println(car2.toString());
		
		Car car3 = new Car("용","빨강");
		System.out.println(car3.toString());
		
		Car car4 = new Car("택시","검정",100);
		System.out.println(car4.toString());
		sss(10);
		double pi = Math.PI;
		System.out.println(pi);
		
		Ce s= new Ce();
		System.out.println(s.age);
		Ce a = new Ce();
		s.age = 10;
		System.out.println(a==s);
		
		
		Ce.height = 100;
		System.out.println(a.height);
		System.out.println(Ce.height);
	}
	
	static double sss(int s) {
		return 0;
	}
}
class Ce {
	int age=0;
	static int height=0;
}
