package ch08.sec02;

public class RemoteControlMain {
	public static void main(String[] args) {
		RemoteControl rc ;
		
		rc = new TelevisonImpl();
		
		rc.turnOn();
	}
}
