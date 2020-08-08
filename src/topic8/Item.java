package topic8;

public class Item{
	
	private String item;
	private  double price;
	private int quantity;
	private static int noItems;
	
	public Item(String item, int quantity, double price){
		this.item = item;
		this.quantity = quantity;
		this.price = price;
		noItems++;
		}
		
	public Item(){
		noItems++;
	};
	
		
		
	@Override
	public String toString(){
		return "Item: "+ item +"\nQuantity: "+ quantity +"\nPrice: "+ price +"\n";
		
		}
	
	public static int getNoItems(){return noItems;}
	public double getPrice(){return price ;}
}