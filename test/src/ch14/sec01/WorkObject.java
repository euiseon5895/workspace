package ch14.sec01;

public class WorkObject {
	public synchronized void methodA() {
		// TODO Auto-generated method stub
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+": methodA 작업 실행");
		notify();
		try {
			wait();
		}catch(InterruptedException e) {}
	
	}
	public synchronized void methodB() {
		// TODO Auto-generated method stub
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+": methodB 작업 실행");
		notify();
		try {
			wait();
		}catch(InterruptedException e) {}
	
	}
}
