package basic2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateAndTimeEx1 {
	public static void main(String[] args) {
		
		// LocalDate : 날짜 정보만을 나타내는 클래스
		// LocalTime : 시간 정보만을 나타내는 클래스
		// LocalDateTime : 날짜와 시간 정보만을 나타내는 클래스
		
		
		System.out.println(LocalDateTime.now());
		
		
		// 요일
		
		LocalDate currentDate = LocalDate.now();
		
		System.out.println(currentDate);
		
		
		System.out.println(currentDate.getDayOfWeek());
		
		
//		DayOfWeek week = currentDate.getDayOfWeek();
//		
//		System.out.println(week);
//		
//		
//		// 참조형(배열, 열거, 클래스, 인터페이스) 선언과 초기화(값이 정해지지 않을 경우 null로 초기화)
//		week today;
//		
//		
//		today = null;
//		
//		
//		System.out.println(today == Week.MONDAY);
//		
//		
//		
//		
//		System.out.println(Week.MONDAY);
		
	}
}
