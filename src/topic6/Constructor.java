package topic6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;


public class Constructor{
	public static void main(String[] args){
	LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22);
	Period p = Period.of(1, 2, 3);
	d = d.minus(p);
	DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
	System.out.println(d.format(f));
	new Constructor().time();
	}
	
	void array(){
		List<String> list = Arrays.asList("Tom", "Aga", "Jan");
		System.out.println(list.size());
		list.set(0,"Wal");
		System.out.println(list.size());
	}
	
	void time(){
		LocalTime time = LocalTime.of(9, 00);
		LocalDate date = LocalDate.of(2020, 3, 1);
		LocalDateTime startCourse = LocalDateTime.of(date, time);
		LocalDateTime endCourse = startCourse.plusDays(10).plusHours(8);
		System.out.println("Date: "+ startCourse.toString().replace("T", "-"));
		System.out.println("Couse duration"+ ((startCourse.getHour() - endCourse.getHour()) * (startCourse.until(endCourse, DAYS))) /8);
	}

}

class TimeAgain{
	
}
