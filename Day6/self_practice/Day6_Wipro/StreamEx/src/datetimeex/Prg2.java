package datetimeex;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Prg2 {

	public static void main(String[] args) {
		//2. Creating Specific Dates and Times

		LocalDate specificDate = LocalDate.of(2025, Month.JULY, 24);
		LocalTime specificTime = LocalTime.of(14, 30);
		LocalDateTime specificDateTime = LocalDateTime.of(2025, 7, 24, 14, 30);

		System.out.println("Specific Date: " + specificDate);
		System.out.println("Specific Time: " + specificTime);
		System.out.println("Specific DateTime: " + specificDateTime);

	}

}
