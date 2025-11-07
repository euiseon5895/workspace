package ch05.sec01;

import java.util.Arrays;

public class Type {
	public static void main(String[] args) {

		
		String fileName = "내사진.jpg";
		String ext = fileName.substring(fileName.lastIndexOf(".jpg"));
		
		String fileName2=System.nanoTime()+ext;
		System.out.println(fileName2);
		
		int[] arr2 = {1,2,3,4,5};
		int[] arr3 = {1,2,3,4,5};
		
		System.out.println(arr2.equals(arr3));
	}
}
