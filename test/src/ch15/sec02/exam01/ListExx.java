package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExx {
	public static void main(String[] args) {
		List<Integer> aList = new ArrayList<Integer>();
		List<Integer> llist = new LinkedList<Integer>();
		
		for(int i=0;i<10000;i++) {
			aList.add(i);
			llist.add(i);
		}
		long start = System.nanoTime();
		for(int i=0;i<aList.size();i++) {
			aList.get(i);
		}
		long end = System.nanoTime();
		System.out.println(end-start);
		
		start = System.nanoTime();
		for(int i=0;i<aList.size();i++) {
			llist.get(i);
		}
		end = System.nanoTime();
		System.out.println(end-start);
		
	}
}
