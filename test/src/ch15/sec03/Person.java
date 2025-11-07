package ch15.sec03;

public class Person {
	public void ordering(Comparable comparable) {
		// TODO Auto-generated method stub
		String a="다케이치";
		String b="요네즈켄시";
		
		int result = comparable.compare(a, b);
		
		if(result<0) {
			System.out.println(a+"는"+b+"보다 앞");
		}
		else if(result==0) {
			System.out.println(a+"는"+b+"과 같음");
		}
		else {
			System.out.println(a+"는"+b+"보다 뒤");
		}

	}
}
