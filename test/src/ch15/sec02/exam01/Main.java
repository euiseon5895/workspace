package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n","AttayList 걸린 시간",endTime-startTime);
		
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n","LsinkList 걸린 시간",endTime-startTime);
		
	}
}
