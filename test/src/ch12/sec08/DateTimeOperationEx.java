package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeOperationEx {
	public static void main(String[] args) {
		LocalDateTime now= LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd. a HH:mm:ss");
		System.out.println("현재 시간: "+ now.format(dtf));
		
		LocalDateTime startDateTime = LocalDateTime.of(2025,11,4,0,0,0);
		System.out.println(startDateTime.format(dtf));
		
		LocalDateTime endDateTime = LocalDateTime.of(2026,4,24,0,0,0);
		System.out.println(endDateTime.format(dtf));
		
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		System.out.println(remainMonth);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		System.out.println(remainDay);
		
		
		
		
	}
}
