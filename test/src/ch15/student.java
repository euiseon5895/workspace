package ch15;

public class student {
	public void action(Calcuable calcuable) {
		double result = calcuable.calc(10, 4);
		System.out.println("결과:"+ result);
	}
}
