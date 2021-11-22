package ch4_datesAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Eclipse {
	public static void main(String[] args) {
		LocalDate nowDate = LocalDate.now();
		LocalTime nowTime = LocalTime.now();
		
		LocalDateTime nowDateTime = LocalDateTime.of(nowDate, nowTime);
		System.out.println("It's currently " + nowDateTime + " where I am ");
		
		// eclipse begin
		LocalTime begins = LocalTime.of(12, 17, 32);
		
		// totality
		LocalTime totality = LocalTime.of(13, 35, 56);
		System.out.println("Eclipse begins at " + begins + " and totality is at " + totality);
		
		long betweenMins = ChronoUnit.MINUTES.between(begins, totality);
		System.out.println("Minutes between begin and totality " + betweenMins);
	}
}