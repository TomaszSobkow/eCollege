package topic10.quiz4_question3;

import topic10.Assignment7_1;
import topic10.quiz5.Question7;

public class Question3 {
	
	public static void main(String[] args){
		if(args.length == 1 | args[0].equals("test")){
			System.out.println("test case");
		}
		else{
			System.out.println("production "+ args[0]);
		}

	}
}