package topic7.constructors;


public class Animal extends Fox{

	String color;
	
	
	public static void main(String[] args){

		StringBuilder sbOne = new StringBuilder();
		StringBuilder sbTwo = new StringBuilder();
		StringBuilder sbThree = sbOne.append("Hello World");

		System.out.println(sbOne == sbTwo);
		System.out.println(sbOne == sbThree);
//
//		Fox fox = new Fox();
//		fox.tailLength= 30;
//		 Chicken chicken = new Chicken();
//		 int herere = fox.tailLength =23;
//
//		System.out.println("fox: "+ fox.tailLength);
//		System.out.println("fox: "+ chicken.noEggs);
	}
}

