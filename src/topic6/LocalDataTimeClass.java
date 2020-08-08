package topic6;

import java.time.*;
import static java.time.Month.*;
import static java.time.temporal.ChronoUnit.*;

	public class LocalDataTimeClass{
		
		static LocalDateTime meeting, flight, courseStart, courseEnd;
		static LocalTime lunchTime;
		
		public static void main(String[] args){
		
			lunchTime = LocalTime.now();
			int dot = lunchTime.toString().indexOf(".");
			System.out.printf("%-18s %-2s %-20s","\nLunch time is",":",lunchTime.toString().substring(0, dot));
			
			meeting = LocalDateTime.of(2020, JANUARY, 21, 14,35);
			int sep = meeting.toString().indexOf("T");
			
			System.out.printf("%-18s %-2s %-20s" ,"\nMeeting time is",":", meeting.toString().substring(0, sep));
			
			LocalDate flightDay = LocalDate.of(2020, 02, 20);
			LocalTime flightTime = LocalTime.of(17,35);
			
			System.out.printf("%-20s %-20s", "\nFlight Date:", flightDay.toString());
			System.out.printf("%-20s %-20s", "\nFlight Time:", flightTime.toString());
			
			flight = LocalDateTime.of(flightDay,flightTime);
			int fDtoString = flight.toString().indexOf("T");
			System.out.printf("%-20s %-20s","\nFlight:",flight.toString().substring(0, fDtoString));
			
			courseStart = LocalDateTime.of(2020, 3, 10, 9,00);
			courseEnd = courseStart.plusDays(10).plusHours(8);
			System.out.printf("%-20s %-20s","\nCourse START:", courseStart.toString().replace("T","  "));
			System.out.printf("%-20s %-20s","\nCourse END:", courseEnd.toString().replace("T", "  "));
			
			double coursDuration = (courseEnd.getHour() - courseStart.getHour()) * 
									(courseStart.until(courseEnd, DAYS)+1);
									
			System.out.println("\nCourse duration: "+ coursDuration+" hours");
			
			
	
			
			
		
		
		
		
		
		
		
		}
	}

	