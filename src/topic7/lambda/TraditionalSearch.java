
package topic7.lambda;

import java.util.List;
import java.util.ArrayList;

	public class TraditionalSearch{
	
		public static void main(String[] args){

			List<Lambda> animals = new ArrayList<>();
				animals.add(new Lambda("fish", false, true ));
				animals.add(new Lambda("kangaroo", true, false));
				animals.add(new Lambda("rabbit", true, false));
				animals.add(new Lambda("turtle", false, true));
			
			List<String> names = new ArrayList<>();
			names.add("Tomaszek");
			names.add("Grzegoz");
			names.add("Krzysztof");
			
			System.out.println(names);
			names.removeIf( (String s) -> s.contains("Grzegoz"));
			System.out.println(names);
			//namesOnly(animals, a -> a.getName());
			printOnlyName(animals);

			//print(animals, (Lambda a) ->  { return a.getCanSwim(); } );
		} 
		
		private static void namesOnly(List<Lambda> names, PrintName n){
			names = new ArrayList<>();
			System.out.println("Only  names ");
			int noOfNames = 0;
			for(Lambda lambda : names){
				System.out.println( ++noOfNames+ ": "+ lambda.getName());
			}
			System.out.println("\nEnd first loop\n");

			noOfNames = 0;
			for(Lambda lambda : names){
				if(n.printName(lambda).equals("rabbit")){
					lambda.setSpacies(lambda.getName().toUpperCase());
					}
					System.out.println( ++noOfNames+ ": "+ lambda.getName());

			}
			
		}

		 private static void printOnlyName(List<Lambda> a){
			 System.out.println("All anmals objects");
			 int noOfAnimals = 0;
			 for(Lambda lambda: a){
				 System.out.println(++noOfAnimals+ ": "+ lambda.getName());
			 }
		 }
		
		
		private static void print(List<Lambda> animals, ChechTrait checker){
			for(Lambda lambda : animals){
				if(checker.testCanHop(lambda))
					System.out.println(lambda);
			}
			System.out.println("-");
		}
	}