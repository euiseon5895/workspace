package ch06;

public class Car {
	String company = "람보르지니";
	String model;
	String color;
	int maxSpeed;
	
	
	
	{
		System.out.println("은스턴스 블록이 실행됨");
		
		model="";
		
		System.out.println("인스턴스 블록이 종료됨");
	}
	//static 블록
	static {
		System.out.println("스태틱 블록이 실행됨");
		
		
		
		System.out.println("스태틱 블록이 종료됨");
	}
	
	
	
	
	
	
	Car(){
		System.out.println("생성자 실행");
	}
	
	Car(String model){
		this(model,"은색",250);
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}

	Car( String model, String color, int maxSpeed) {
		
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
	
}
