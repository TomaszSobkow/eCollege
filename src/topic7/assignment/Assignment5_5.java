package topic7.assignment;

import java.util.List;
import java.util.ArrayList;


public class Assignment5_5 {

private static List<CD> cdInArray = new ArrayList<>();

static{
	cdInArray.add(new CD("Bon Jovi", "Slippery When Wet", "Mercury Records", "80s"));
	cdInArray.add(new CD("Alanis Morissette", "Jagged Little Pill", "Maverick Records","90s"));
	cdInArray.add(new CD("Level 42", "The Pursuit of Accident", "Polydor", "80s"));
	cdInArray.add(new CD("Level 42", "Running in the Familly", "Polydor", "70s"));
}

	private static void print(List<CD> catalogue, CheckAttribute checkCD){
		for(CD c : cdInArray){
			if(checkCD.test(c)){
				System.out.println(c+"\n");
			}
		}
	}

	private static void printArtist(List<CD> artists, CheckArtist artist){
	for(CD a : cdInArray){
		if(artist.isBonJovi(a)){
			System.out.println(a+"\n");

		}
	}
	}

	public static void main(String[] args){
		//print(cdInArray, cd->cd.is80sCD());
		printArtist(cdInArray,artist->artist.isBonjovi());




}

}