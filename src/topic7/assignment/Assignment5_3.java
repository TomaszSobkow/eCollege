package topic7.assignment;

import java.io.PrintStream;

public class Assignment5_3{
	
	public static void findMax(int... numbers){
			
		int maxNumber = 0;
		if(numbers.length == 0){
			System.out.println("Please enter any number ");
		}else{
			for(int i = 0; i < numbers.length; i++){
				if(numbers[i] > maxNumber) maxNumber = numbers[i];
			}
		}
		System.out.println("Given numbers: ");
			for(Integer n: numbers){
			System.out.print(n+" ");
		}
		System.err.println("\nThe max number is "+ maxNumber);
	}
	
	public static void main(String[] args){
		findMax(12,34,45,5,675,6734,54,55,7667,4,5,232,33,544,65,56768,65,645,234,344,6567);
	}
	
	
	
	
}