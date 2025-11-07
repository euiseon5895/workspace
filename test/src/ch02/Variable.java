package ch02;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
	
		age = 10;
		// 처음 대입 -> 초기화	
		// age = 3.14; 다른 타입은 대입 불가능~~
		// 파이썬은 됩니다~ 좃구리네 자바 but 안되는게 좋은거야~ 어느정도의 제약은 좋아

	
		int grade = 4; // 변수 선언과 동시에 대입까지, 변수이름는 의미가 있어야됩니다~

		// 카멜표기법 낙타표기법
		int studentAge;
		// 스네이크표기법 뱀표기법
		int student_age;
		
		
		byte a = 10;
		byte b = 20;
		//byte c = age; 타입이 다르니까 안됨
		//byte c = a+b; 연산을 하면 int로 변경됨~ 
		
		float h = 3.14f;
		float h2 = 3.14f;
		float h3 = h + h2;
		
		
		double i = 3.14;
		
		boolean d= true;
		System.out.println(d);
		
		
		double k = 3.14;
		int v = (int)k;	//억지로 담어ㅓㅓㅓㅓㅓㅓㅓㅓㅓㅓㅓㅓ 형변환
		System.out.println(v);
		
		//출력 3 ......소수점 이하가 유실됩니다 억지로 했으니까~
		
		
		
		//문자열
		String n = "A";
		String n2 = ""; //빈 문자열
		String n3 = " ";// 공백문자열
		String n4 = null;//값 자체가 없음       
		
		int n5 = 10;
		int n6 = 10;
		System.out.println(n5==n6);
		
		
		
		String n7 = new String("홍길동");
		String n8 = new String("홍길동");
		System.out.println("참조자료형 비교");
		System.out.println(n7==n8); //참조자료형은 주소를 비교하기때문에 false입니다
		System.out.println(n7.equals(n8)); //이건 문자를 비교하는거야
		
	}
}
