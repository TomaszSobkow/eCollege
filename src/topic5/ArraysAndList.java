package topic5;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class ArraysAndList{
	
	ArraysAndList(){
		noObjectes++;
	}
	
	static void printArray(Object[] o){
		System.out.println();
		for(Object a : o)
		System.out.println(a);
	}
	
	static int noObjectes = 0;
	
	
	
	public static void main(String[] args){
		
		ArraysAndList a1 = new ArraysAndList();
		ArraysAndList a2 = a1;
		ArraysAndList a3 = a2;
		ArraysAndList a4 = a3;
		Object o = a2;
		ArraysAndList a5 = a1;;
		
		Object[] objectInArray = {a1,a2,a3,a4,a5,o};
			printArray(objectInArray);
			
		System.out.println("No Objects created."+ noObjectes);
		

		int size = 20;
		char letter = 'a';
		
		String[] names = new String[size];
		for(int i = 0; i < names.length; i++){
			if(i ==0)
			names[i] = "Tom";
			else{
				names[i] = names[i-1]+letter;
				letter++;
			}
		}
		printArray(names);
		
		List list = Arrays.asList(names);

		
		Object[] object = list.toArray();
		
		System.out.println(object.length);
		printArray(object);
		
	}
	
	
}

