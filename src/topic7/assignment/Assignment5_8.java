package topic7.assignment;

import java.util.ArrayList;
import java.util.List;

public final class Assignment5_8{

	private ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	public Assignment5_8(){
		for(int i = 100; i <= 400; i += 100){
			numbers.add(i);
			}
	}
	
	public ArrayList<Integer> getNumbers(){
		return (ArrayList<Integer>)numbers.clone();
	}

	public void printArray(List<Integer> numbers){
		for(Integer i : numbers)
			System.out.println(i);
		numbers.remove(numbers.size()-1);
	}
}

