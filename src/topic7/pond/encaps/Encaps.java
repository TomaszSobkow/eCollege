package topic7.pond.encaps;

import topic7.pond.shore.Bird;
import topic7.pond.swan.Swan;

public class Encaps extends Bird{

	private void swan(){
		System.out.println(protectedTextBirdClass);
		protectedFloatInWater();
	}
	
	public static void main(String[] args) {
		Encaps enacps = new Encaps();
		enacps.swan();
		Swan newSwan = new Swan();
		newSwan.swim();
		System.out.println(Bird.noOfBirds);
	}
	
}