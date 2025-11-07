package ch15.sec03;

public class Ex {
	public static void main(String[] args) {
		Person person = new Person();
		person.ordering(String::compareToIgnoreCase);
	}
}
