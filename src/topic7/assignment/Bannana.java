package topic7.assignment;

public class Bannana{

private static String manufacturer;
private static double price, sum;
private static int noBanabasCreated;


public Bannana(String manufacturer, double price){
	if(price >0){
			this.price = price;
		}else{
			System.out.println("The  bannana price has to be bigger than 0 please");
		}
	this.manufacturer = manufacturer;
	noBanabasCreated++;
	this.sum += price;
}


	public  void setManufacturer(String manufacturer){
		this.manufacturer = manufacturer;
	}	

	public void setPrice(double price){
		if(price >0){
			this.price = price;
		}else{
			System.out.println("The  bannana price has to be bigger than 0 please");
		}
	}
	
	public static String getManufacturer(){return manufacturer;}
	public static double getPrice(){return price;}
	public static double getSum(){return sum;}
	public static int getNoBanannasCreated(){return noBanabasCreated;}
}