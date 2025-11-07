package ch07.sec10;

public class Mainq {
	public static void main(String[] args) {
		SmartPhone s = new SmartPhone("길덩");
		s.turnOn();
		
		
		System.out.println(s instanceof Phone);
	}
}
