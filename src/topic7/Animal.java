package topic7;

public class Animal{
	
	static int noObjects = 1;

	public Animal(){
		System.out.println(Animal.noObjects++ +" Animal empty CONSTRUCTOR");
		
	}
	
	
	public Animal(String name){
		System.out.println(Animal.noObjects++ +" Animal argument CONSTRUCTOR " + name);
		
	}

	public static void main(String[] args){
		Horse h = new Horse("Horse in main".toUpperCase());
		Horse g = new Horse();
		System.out.println(Animal.noObjects);
	}

}

 class Horse extends Animal {
	
	public Horse(){
		System.out.println(Animal.noObjects++ +" Horse empty constructor");
	}

	
	public Horse(String name){
		this();
		System.out.println(Animal.noObjects++ +" Horse one paramiter constructor " + name);
		
	}
	
	

}