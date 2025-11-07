package ch11;

public class ExceptionEx {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("시작");
		int a = 10;
		int b = 0;
		int c = 0;
		int[] arr = { 1, 2, 3 };
		String name = null;

		try {
			Class.forName("java.lang.String1");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception

		} finally {

		}
		test();
		System.out.println("끝");
	}

	public static void test() {
		
		try {
			throw new SomeException("어떤 예외 발생");
		}catch (SomeException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}

class SomeException extends Exception {
	public SomeException() {

	}

	public SomeException(String msg) {
		super(msg);
	}
}
