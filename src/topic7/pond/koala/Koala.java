//package topic7.pond.koala;

import java.util.ArrayList;


public class Koala{

	public  final int noinitialized;
	{
		noinitialized = 12;
	}

	private static final  ArrayList<Integer> finalArray = new ArrayList<>();
	
	private void addToFinalArra(int a){
		for(int b = 0; b < a; b++ )
		finalArray.add(b);
	}
	
	

	private static int noKoala = 1;
	public Koala(){
		noKoala++;
	}
	
	public void kolala(){
		System.out.println("In method kolala instance method");
		//koala2();
	}
	
	public void nextKolala(){
		kolala();
		System.out.println("In method nextKoala instance method");
	}
	
	public static void koala2(){
		System.out.println("In Method koala2 instanceof method");
		
	}
	
	private void checkInitialize(){
		if(noinitialized < 22){
			System.out.println("Not initialized but 0");
		}
	}
	
	
	
	public static void main(String[] args){
		
		
		//new Koala().checkInitialize();

		// Koala koala1 = new Koala();
		// koala1.addToFinalArra(20);
		
		// for(Integer i : finalArray ){
			// System.out.print(i+" ");
		// }
		
		// for(Integer i : finalArray ){
			// System.out.println(i);
		// }
		
		// finalArray.set(4, 222);
		
		// for(Integer i : finalArray ){
			// System.out.print(i+" ");
		// }

    }
}