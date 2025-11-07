package ch08.sec02;

public class SmartTVImpl implements RemoteControl, Searchable {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("티비켬");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("티비끔");
	}
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url+"검색");
	}

	
}
