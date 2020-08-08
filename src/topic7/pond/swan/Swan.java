package topic7.pond.swan;

import topic7.pond.shore.Bird;

public class Swan extends Bird {

	static int noOfSwans;
	public Swan(){
		noOfSwans++;
	}
	
	public void swim(){
		protectedFloatInWater();
		System.out.println(protectedTextBirdClass);

	}
	
	public void helpOtherSwanSwim(){
		Swan other = new Swan();
		other.protectedFloatInWater();
		System.out.println(protectedTextBirdClass);
		
		
	}


	
}
