package ch17.sec01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransformationExample {
	public static void main(String[] args) {
		/*
		 * 코딩동댕 변환
		 * 배열<->리스트
		 * 
		 */
		int[] array1 = {1,2,3};
		
		List<Integer> list1 = new ArrayList<>();
		
		for (int i = 0; i < array1.length; i++) {
			list1.add(array1[i]);
		}
		System.out.println(list1);
		
		List<Integer> list2 = Arrays.asList( //list로 변환
				Arrays.stream(array1).boxed().toArray(Integer[]::new));  
		System.out.println(list2);
		
		
		//리스트를 기본배열형으로 변환
		
		int[] arr = list1.stream().mapToInt(i->i).toArray();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
