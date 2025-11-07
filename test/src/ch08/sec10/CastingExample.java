package ch08.sec10;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Bus();
		
		v.run();
		
		Bus bus = (Bus) v;
		bus.run();
		bus.checkFare();
	}

}
