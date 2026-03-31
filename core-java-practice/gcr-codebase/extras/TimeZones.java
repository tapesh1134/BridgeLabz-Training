import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZones {

	public static void main(String[] args) {
		ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
		ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

		System.out.printf("Current Time in GMT : %s", gmtTime.format(formatter));
		System.out.printf("Current Time in IST : %s", istTime.format(formatter));
		System.out.printf("Current Time in PST : %s", pstTime.format(formatter));
	}
}
