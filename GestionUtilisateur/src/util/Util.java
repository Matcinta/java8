package util;


import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;


import bo.User;
import bo.UserJava8;


public abstract class Util {

	public static void mockList(List<User> users) {
		
		Calendar calendar1 = new GregorianCalendar(2013,1,28);
		Calendar calendar2 = new GregorianCalendar(2015,3,15);
		Calendar calendar3 = new GregorianCalendar(1999,6,01);
		Calendar calendar4 = new GregorianCalendar(1994,11,11);
		Calendar calendar5 = new GregorianCalendar(2019,6,19);
		Calendar calendar6 = new GregorianCalendar(2005,4,4);
		
		users.add(new User("ZUrAND", "Bobby", calendar1));
		users.add(new User("Durand", "Claude", calendar2));
		users.add(new User("Morin", "Thomas", calendar3));
		users.add(new User("Guerin", "Francois", calendar4));
		users.add(new User("Zitoub", "Yacine", calendar5));
		users.add(new User("Arsandi", "Vitaaa", calendar6));
		
		
	}
	
	
public static void mockList8(List<UserJava8> usersJava8) {
			
		LocalDate currentDate = LocalDate.now();
		LocalDate date1 = currentDate.withDayOfMonth(28).withYear(2013).withMonth(1);
		LocalDate date2 = currentDate.withDayOfMonth(15).withYear(2015).withMonth(3);
		LocalDate date3 = currentDate.withDayOfMonth(01).withYear(1999).withMonth(6);
		LocalDate date4 = currentDate.withDayOfMonth(11).withYear(1994).withMonth(11);
		LocalDate date5 = currentDate.withDayOfMonth(19).withYear(2019).withMonth(6);
		LocalDate date6 = currentDate.withDayOfMonth(4).withYear(2005).withMonth(4);
		
	
		usersJava8.add(new UserJava8("ZUrAND", "Bobby", date1));
		usersJava8.add(new UserJava8("Durand", "Claude", date2));
		usersJava8.add(new UserJava8("Morin", "Thomas", date3));
		usersJava8.add(new UserJava8("Guerin", "Francois", date4));
		usersJava8.add(new UserJava8("Zitoub", "Yacine", date5));
		usersJava8.add(new UserJava8("Arsandi", "Vitaaa", date6));
		
		
	}
	
}
