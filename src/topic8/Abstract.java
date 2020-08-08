public abstract class Abstract{

private int id;

public int getId(){return id;}

protected abstract double getPrice();
public abstract void display();

public static void main(String[] args){
	
	new Socks().display();
	
	int i = 0;
	while(i < 2000){
		System.out.println((int)(Math.random() * Math.cos(2.5656)));
		i = (int)(Math.random() * 10000);
	}
	
	
}

}

class Socks extends Abstract{

private double price;

protected double getPrice(){return price;}

public void display(){
	System.out.println("ID from Abstract class is: "+ getId());
	System.out.println("Price : " + getPrice());
}	
	
}