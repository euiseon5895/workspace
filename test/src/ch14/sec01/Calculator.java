package ch14.sec01;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory1(int memory) {
		// TODO Auto-generated method stub
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println(Thread.currentThread().getName()+": "+this.memory);
		}
	}
	public synchronized void setMemory2(int memory) {
		// TODO Auto-generated method stub
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println(Thread.currentThread().getName()+": "+this.memory);
		}
	}
	
}
