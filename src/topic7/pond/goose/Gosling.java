package topic7.pond.goose;

import topic7.pond.shore.Bird;

public class Gosling extends Bird {
	
	public void swim(){
		protectedFloatInWater();
		System.out.println(protectedTextBirdClass);
	}
	
	public static void main(String[] args){
		new Gosling().swim();
	}
	
}
