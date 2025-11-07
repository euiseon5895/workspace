package ch04.sec1;

import java.util.Iterator;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = (int)(Math.random()*20)+81;
		String grade;
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			}else {
				grade = "A";
			}
		}else {
			if(score>=85) {
				grade = "B+";
			}else {
				grade = "B";
			}
		}
		System.out.println("점수: "+score+"\n학점: "+grade);
	}

}
