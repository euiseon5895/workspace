package ch12.sec12;

import java.util.ArrayList;
import java.util.List;

import ch12.sec03.Member;

public class GenericEx {
	public static void main(String[] args) {
//		List list = new ArrayList();
//		list.add(1);
//		list.add("A");
//		list.add(new Member());
//		
//		for (Object object : list) {
//			System.out.println(object);
//		}
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		List<Member> list =  new ArrayList<>();
		list.add(new Member());
		System.out.println(list.get(0).getName());
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(3);
		System.out.println(list2.get(0).longValue());
		
	}

}
