public class Convertions{
	
	public static double toCelsius(double temp){
		return (temp - 32.0) * (5.0 / 9.0);		
	}
	
	public static double toFahrenheit(double temp){
		return temp * (9.0 / 5.0) + 32.0;
	}
	
	public static void main(String[] args){
		
		
		
		
		
		// System.out.printf("%-25s %-1s %.2f", "Temp 23 C in Celcious is ", ":", Convertions.toFahrenheit(23));
		// System.out.println();
		// System.out.printf("%-25s %-1s %.2f ", "Temp 23 in Fahrenheit is ",":", Convertions.toCelsius(0));
	}
}