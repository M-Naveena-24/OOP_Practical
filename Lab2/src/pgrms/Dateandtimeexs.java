package pgrms;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Dateandtimeexs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date: " + currentDate);
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time: " + currentTime);
		Date DateCurrent = new Date();
		System.out.println("Current Date & Time: " + DateCurrent);
		System.out.println("Date as String: " + DateCurrent.toString());
	}
}


 
