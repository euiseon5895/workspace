package ch05.sec01;

import java.util.Arrays;

import ch08.sec02.RemoteControl;

public class ArrayEx {
	public static void main(String[] args) {
		int[] score = {1,2,3};
		
		int[] newScore = new int [3];
		
		System.arraycopy(score, 0, newScore, 0, score.length);
		
		System.out.println(Arrays.toString(newScore));
		
		System.out.println(RemoteControl.PI);
	}
	
	
	
	
}
