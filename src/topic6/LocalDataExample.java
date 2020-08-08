package Topic6;

import java.time.LocalDate;
import static java.lang.System.out;

public class LocalDataExample{
	
	public static void main (String[] args){
		Object o = new String("Hello ");
		o =  ((String) o).concat(" World");
		System.out.println(o);
	
//		LocalDate bDate, nextTues;
//
//		bDate = LocalDate.of(1995,5,23);
//
//
//		out.println("\nIs date"+ bDate+" older than: "+ LocalDate.now() +
//				    " - "+ bDate.isBefore(LocalDate.now()) + "\nIs it "+bDate+" a leap date: "+bDate.isLeapYear()+
//					"\n"+ bDate+" is a "+ bDate.getDayOfWeek()+"\nbut tady is "+ LocalDate.now().getDayOfWeek()+
//					"\nA the date a month from now "+ LocalDate.now().plusMonths(2).getDayOfWeek());
	}
}