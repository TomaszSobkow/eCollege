package topic8;

import java.util.ArrayList;

public class ShopinCart extends Item{
	private String type ;
	 String string = "Private string in shopinkcart";
	

	Item[] items = {new Item ("Thisert", 10, 23.45),
					new Item ("Wristband", 22, 45.67),
					new Item ("Pants", 12, 21.89),
					new Item ("Gacie", 122, 2.89)
	};
	
	public ShopinCart(String item, int quantity, double price, String type){
		super(item, quantity, price);
		this.type = type;
	}
	
	public ShopinCart(){};
	
	
	
	
	public static void main(String[] args){
		
		Inheritance inheritance = new Inheritance();
		
			
			
			Item inherit1 = new ShopinCart("inherit", 33, 34.56,"inheritance");
			ShopinCart cart = new ShopinCart("Tom", 33, 62.56, "Buty");
			System.out.println(((ShopinCart)inherit1).string);
			System.out.println(cart.getPrice());
			
			inheritance.printSomething(cart);
					
			
			System.out.println(cart);
			//cart.displayTotaly();
			//innerLoop();

	}
	
	@Override
	public String toString(){
		return "In ShopinCart class toString mehode overloaded/: " + type;
	}
	
	public static void arrayList(){
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("Tom");
		
		arrayList.add(String.valueOf(Math.random()));
		System.out.println(arrayList);
	}
	
	public static void innerLoop(){
		int cycles =1;
		for(int i = 0; i < 4; i++){
			System.out.print("-");
			for(int b = 0; b < 4; b++){
				System.out.print("+");
				for(int c = 0; c< 4; c++){
					System.out.print("$");
				}
				
				
			}
			System.out.println("\n----------------");
		}
	}
	
	public void displayTotaly(){
		double sum = 0;
		System.out.println("No of product in cart "+ Item.getNoItems()+"\n");
		for(int index = 0; index < items.length; index++){
			System.out.println(items[index]);
			sum += items[index].getPrice();
		}
		System.out.println("Total sum in store: "+ sum);
	};


}