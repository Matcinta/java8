package factory;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import bo.ClientJ7;
import bo.ClientJ8;

public abstract class ClientFactory {
	private static Calendar cal;
	
	static {
		cal = new GregorianCalendar();
	}
	
	public static ClientJ7 createClientJ7(String name, String firstName, int year, int month, int day) {
		cal.set(year, month, day);
		Date date = cal.getTime();
		return new ClientJ7(name, firstName, date);
	}

	public static ClientJ8 createClientJ8(String name, String firstName, int year, int month, int day) {
		return new ClientJ8(name, firstName, LocalDate.of(year, month, day));
	}
}
