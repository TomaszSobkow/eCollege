package topic7.assignment;


import javax.swing.*;

public class Assignment5_10{


static{
	Bannana foffs = new Bannana("Fofs", 1.40);
	Bannana toffs = new Bannana("Toffs", 2.00);
	Bannana Mushies = new Bannana("Mushies", 1.2);
	System.out.println(Bannana.getNoBanannasCreated()+" Bannanas have been created.");
}

{

		
}

public static void main(String[] args){
	JOptionPane.showMessageDialog(null,Bannana.getNoBanannasCreated()+ " Bannanas have been created."+
									"The average price of bannana is: "+ Bannana.getSum() / Bannana.getNoBanannasCreated(),
								"Banna", JOptionPane.PLAIN_MESSAGE );

	System.out.printf("%s %.2f ","The average price of bannana is: ", Bannana.getSum() / Bannana.getNoBanannasCreated());
	
	
	
}


}