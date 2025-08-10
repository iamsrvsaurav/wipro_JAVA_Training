package datetimeex;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Prg1 {

	public static void main(String[] args) {
		//1. Current Date and Time

		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();

		System.out.println("Current Date: " + date);
		System.out.println("Current Time: " + time);
		System.out.println("Current DateTime: " + dateTime);


	}

}
