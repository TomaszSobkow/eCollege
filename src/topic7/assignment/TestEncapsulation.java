package topic7.assignment;

import java.util.List;

public class TestEncapsulation{
	
	public static void main(String[] args){
		Assignment5_8 obj = new Assignment5_8();
		
		List<Integer> numbers = obj.getNumbers();
		
		System.out.println("We are working with the clone of array list, not the oryginal Array object");
		obj.printArray(numbers);
		
		System.out.println("We are working with modifield local copy of array");
		obj.printArray(numbers);
		
		System.out.println("We are working again with new copy of array");
			for(Integer i : obj.getNumbers()){
				System.out.println(i);
			}
		
	}
	

	
	
	
}