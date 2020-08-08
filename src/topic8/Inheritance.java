package topic8;

public class Inheritance extends Item{
	
	public void printSomething(){
		System.out.println("In class Inheritance: -->"+ getPrice());
	}
	
	public void printSomething(ShopinCart shop){
		System.out.println("In class Inheritance: -->"+shop.getPrice());
	}
	
	
}