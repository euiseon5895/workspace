package ch07;

public class Main {
	public static void main(String[] args) {
		Child c = new Child();
		Parent p = c;
		Parent p2 = new Parent();
		
		
		p.method1();
		p2.method1();
		
		
		p.method2();
		p2.method2();
		
		
		
		
		
	}
}
