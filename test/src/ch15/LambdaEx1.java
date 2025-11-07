package ch15;

public class LambdaEx1 {
	public static void main(String[] args) {
		student st = new student();
		st.action((x,y)->{
			double result = x+y;
			return result;
		});
		
		st.action((x,y)->(x+y));
		
		st.action((x,y)->sum(x,y));
		
	}

	public static double sum(double x, double y) {
		// TODO Auto-generated method stub
		return (x+y);
	}
}
