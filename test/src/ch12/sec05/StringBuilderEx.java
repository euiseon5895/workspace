package ch12.sec05;

import java.util.ArrayList;
import java.util.List;

public class StringBuilderEx {
	public static void main(String[] args) {
		
	
		
		long start1 = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<1000000;i++) {
			sb.append(i);
		}
		long end1 = System.currentTimeMillis();
		System.out.println("소요시간: "+(end1-start1));
		
		
		int a =10;
		List list = new ArrayList();
		list.add(a); // int 가 (박싱)integer 객채로변한 그리고 object 타입으로 자동형변환 되서 들어가게됨
		
		
	}
}
