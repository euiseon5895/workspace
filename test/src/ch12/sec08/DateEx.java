package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateEx {
	public static void main(String[] args) {
		Date now = new Date();
		
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		
		
	}
}
