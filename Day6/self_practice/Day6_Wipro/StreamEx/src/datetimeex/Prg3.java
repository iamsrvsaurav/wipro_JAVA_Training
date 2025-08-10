package datetimeex;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Prg3 {

	public static void main(String[] args) {
		//3. Formatting and Parsing Dates
		
		LocalDateTime dateTime = LocalDateTime.now();


		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

		String formatted = dateTime.format(formatter);
		System.out.println("Formatted DateTime: " + formatted);

		LocalDateTime parsedDate = LocalDateTime.parse("24-07-2025 14:30", formatter);
		System.out.println("Parsed DateTime: " + parsedDate);


	}

}
