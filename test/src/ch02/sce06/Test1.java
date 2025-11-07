package ch02.sce06;

public class Test1 {
	public static void main(String[] args) {
		
		String n = "홍길동";
		String n2 = n+"님";
		
		System.out.println(n2);
		
		String n3 = "3"+1;
		System.out.println(n3);
		String n4 = "3"+String.valueOf(1);
		System.out.println(n4);
		
		//문자+숫자 = 숫자가 문자로 형변환 ->응용
		int age = 3;
		String age2 = age+""; //String.valueOf(age)랑 같이 문자로 변환됨
		//공백문자를 더함
		
		String age3 = age+(3+"");
		System.out.println(age3);
		
		String str = "10";
		byte value = Byte.parseByte(str);
		int age4 = Integer.parseInt(age2)+10;
		System.out.println(age4);
		
		
	}
	
}
