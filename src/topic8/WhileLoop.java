import java.util.Random;
import java.util.Arrays;

public class WhileLoop{
	
	
	public static void main(String[] args){
		
		Random random = new Random();
		
		int a = 0;
		double[] array = new double[12];
		
			while(a < 12){
				System.out.println("Value of a: "+ a);
				array[a] = Math.random(); //random.nextInt();
				a++;
				}
				
		Arrays.sort(array);
		for(Object c : array){
			System.out.println("In Array: "+ c);
		}
		
		
		
	}
	
}