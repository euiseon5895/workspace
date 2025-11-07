package ch03;

public class Operator {

	public static void main(String[] args) {
		int x =1;
		++x; // 전위 연산
		
		System.out.println(x);
		
		int y = 1;
		y++;
		System.out.println(y);
		
		int z = y++;
		System.out.println(z);
		System.out.println(y);
		
		int a =90;
		int b=80;
		int c = 80;
		int re = a+b+c;				// 정수와 정수의 연산결과는 정수입니다 나누기를 해도 정수로 나옴;;				
		double avg = (double)re/3;  // 둘중 하나는 실수여야 실수형으로 연산됩니다 
		System.out.println(avg);
		
		
		
		System.out.println(true^false);
		
		
		System.out.println(a==80&&"홍길".equals(c));
		
		
		
		
	}

}
