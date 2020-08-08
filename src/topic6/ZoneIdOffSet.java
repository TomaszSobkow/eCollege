import java.time.*;
import static java.time.temporal.ChronoUnit.*;
import javax.swing.JOptionPane;


public class ZoneIdOffSet{

	public static void main(String[] args){
		
		
		ZoneId SFO = ZoneId.of("America/Los_Angeles");
		ZoneId BOS = ZoneId.of("America/New_York");
		ZoneId BLR = ZoneId.of("Asia/Calcutta");
		
		LocalDateTime departure = LocalDateTime.of(2020, 3, 20, 17,30);
		ZonedDateTime departureSFO = ZonedDateTime.of(departure, SFO); 
		System.out.printf("%-30s %-20s", "Flight no 23 departs SFO at:", departureSFO.toString().replace("T", "  "));
		
		ZonedDateTime departAtBOS = departureSFO.toOffsetDateTime().atZoneSameInstant(BOS);
		System.out.printf("%-30s %-20s", "\nDeparture at Boston :", departAtBOS.toString().replace("T", "  "));
		
		LocalDate today = LocalDate.now();
		Instant now = Instant.now();
		
		try{
		Thread.sleep(0,1);	
		}catch ( InterruptedException e){
			
		}
		
		Instant later = Instant.now();
		System.out.printf("%-10s %-20s", "\nIs now before later: ", now.isBefore(later));
		System.out.printf("%-10s %-20s", "\nNow: ", now.toString().replace("T", "  ")+"\n Later: "+later.toString().replace("T", "  "));
		
		LocalDate todayNow = LocalDate.now();
		LocalDate tomoorow = LocalDate.of(2020, 3, 20);
		long days= DAYS.between(todayNow, tomoorow);
		
		JOptionPane.showMessageDialog(null,"Diference taday and tomoroow - " +days );

		// ZoneId Ireland = ZoneId.systemDefault();
		// LocalDate date = LocalDate.now();//of(2020, 03, 01); 
		// LocalTime time = LocalTime.now();//sof(12, 10);
		// LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		// ZonedDateTime courseStart = ZonedDateTime.of(date, time, Ireland);
		// ZonedDateTime hereNow = ZonedDateTime.now(Ireland).truncatedTo(MINUTES);
		
		// ZonedDateTime newCoursDate = courseStart.plusDays(2).minusMinutes(30);
		
		// System.out.printf("%-20s %-20s", "Time Here Now:", hereNow.toString().replace("T","  ").replace("Z", "   "));
		// System.out.printf("\n%-20s %-20s", "Course start:", courseStart.toString().replace("T", "  ").replace("Z", "   "));
		// System.out.printf("\n%-20s %-20s", "New Course start:", newCoursDate.toString().replace("T", "  ").replace("Z", "   "));
		// System.out.println()
		
	}

}