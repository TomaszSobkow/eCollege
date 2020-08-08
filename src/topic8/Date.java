package topic8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.*;
import java.time.chrono.*;

public class Date{
	
	private static String startDate = "2007-12-03";
	
	public static void main(String[] args){



		int[][] multiArra = {{12,12,12,12},{34,34,34,34},{22,22,22,22}};

		for(int a =0; a <multiArra.length; a++){
			for(int b : multiArra[a]){
				System.out.println(b+", ");
			}
			System.out.println("");
		}

		LocalDate myDate = LocalDate.now();
		myDate.format(DateTimeFormatter.ISO_LOCAL_DATE);

		LocalDateTime item = LocalDateTime.now();
		System.err.println("Local date Time now is: "+ item);

		JapaneseDate jDate = JapaneseDate.from(myDate);
		jDate.format(DateTimeFormatter.ISO_LOCAL_DATE);

		System.out.println("Today's date: "+ myDate+"\nLocal Time: "+ LocalTime.now()+"\nDate in Japan: "+ jDate);

		myDate = myDate.minusYears(1).minusMonths(3);
		System.out.println("Minus date: "+ myDate.withMonth(12));
		System.out.println("\nParse Date: "+ myDate.parse(startDate));
		System.out.println("Is "+ myDate+" after than: "+ startDate+": "+myDate.isAfter(LocalDate.now().parse(startDate)));

	}
}
