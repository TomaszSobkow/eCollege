import java.time.*;
public class Item{
	
	
	
	public static void main(String[] args){
		System.out.println("Days in "+ LocalDate.now().getMonth() +" is "+new Item().daysInMonth(7));
		
		
	}
	
	public static int daysInMonth(int month){
		int isLeapYear = (LocalDate.now().isLeapYear())? 1:0;
		return (month == 2) ? (28 + isLeapYear) : 31-(((month -1) %7) %2); 
		
	}
	
	
}