package topic6;//package topic6;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class StartTime {
	public static void main(String[] args){
		
		LocalDate startDate = LocalDate.of(2020, Month.MARCH, 10);
		LocalDate endDate = startDate.plusMonths(6);
		LocalTime localTime = LocalTime.of(15, 56);
		LocalDateTime dateTime = LocalDateTime.of(startDate, localTime);
		Period period = Period.ofMonths(5);
		perform(startDate, endDate);
		perform(startDate, endDate, period);
		
		String date = "2021 12 10";
		System.out.println("Date from string " + LocalDate.parse(date.replaceAll(" ","-"))+ "\nToEpochDay -"+ startDate.toEpochDay()/ 365);
		DateTimeFormatter patternForString = DateTimeFormatter.ofPattern("yyyy MM dd");
		LocalDate dateFromStringParse = LocalDate.parse(date, patternForString);
		System.out.println("Date after pattern " + dateFromStringParse);
		
		boolean leapYear = startDate.isLeapYear();
		if(leapYear){
			System.out.println("The year "+ startDate.getYear()+ " is a lepaYear");
		}else{
			System.out.println("The year "+ startDate.getYear()+ " is NOT !! lepaYear");
		}
		System.out.println("\nYear: "+startDate.getYear() +"\nMonth: "+ startDate.getMonth()+"\nDay : "+startDate.getDayOfWeek()+
		"\nDay of year "+ startDate.getDayOfYear());
		
		System.out.println("Formated date "+ startDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println("Formated time "+ localTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println("Formated Date  & Time "+ dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
		
		DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT); 
		DateTimeFormatter mediumFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter shortTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		System.out.println("Formated SHORT "+ shortFormat.format(dateTime));
		System.out.println("Formated MEDIUM "+ mediumFormat.format(dateTime));
		System.out.println("Formated MEDIUM "+ shortTime.format(localTime));
		
		DateTimeFormatter patern = DateTimeFormatter.ofPattern("dd MMMM yyyy  hh:mm");
		System.out.println("Pattern --> " + dateTime.format(patern));
		
		
		
		
	}
	
	private static void perform(LocalDate startDate, LocalDate endDate){
		int i = 1;
		LocalDate upTo = startDate;
		while(upTo.isBefore(endDate)){
			System.out.println(i+ " I'II send you" + upTo);
			upTo = upTo.plusMonths(1);
			i++;
		}
	}
	
	private static void perform(LocalDate startDate, LocalDate endDate, Period period){
		int i = 1;
		LocalDate upTo = startDate;
		while(upTo.isBefore(endDate)){
			System.out.println(i+ " I'II send you" + upTo);
			upTo = upTo.plus(period);
			i++;
		}
	}
}