import java.util.Arrays;
public class Assignment4_1{
	
	String message = "Duke's big day out!";
	String message2 = "One, two, buckle my shoe";
	
	
	
	public static void main(String[] args){
	
		Assignment4_1.assignment4_5A();
		
		
		//Assignment4_1.assignment4_3C(args);
	}
	
	public static void assignment4_5A(){
		int[][] sales = new int[3][4];
		sales[0][0] = 12000;
		sales[0][1] = 13000;
		sales[0][2] = 14000;
		sales[0][3] = 15000;
		
		sales[1][0] = 13000;
		sales[1][1] = 14000;
		sales[1][2] = 15000;
		sales[1][3] = 16000;
		
		sales[2][0] = 10000;
		sales[2][1] = 12000;
		sales[2][2] = 15000;
		sales[2][3] = 13000;
		
		for(int i = 0; i < sales.length; i++){
			System.out.println("Year " +(i+1));
				for(int b = 0; b < sales[i].length; b++){
					if(b < sales[i].length-1)
						System.out.print(sales[i][b]+" ");
					else
						System.out.println(sales[i][b]);
					
				}
			
			}
		
		
	}
	
	public static void assignment4_4B(){
		int[] numbers = {34, 67, 23, 180};
		
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] == 23){
				System.out.println("No. " +numbers[i]+ " is found at index position: "+i);
			}
		}
	}
	
	public static void assignment4_4A(){
		byte[] numbers = {127, 100, 45, 23, 60};
		Arrays.sort(numbers);
		for(byte b : numbers)
			System.out.print(b+" ");
	}
	
	
	public static void assignment4_3C(String[] a){
		System.out.println("No. of enteries "+ a.length);
	}
	
	
	
	public  void assignment4_3B(){
		Friend sandy = new Friend("Sandy", "Smith", "0864545321", "sandysmith@livemail.com");
		Friend ben   = new Friend("Ben", "Jones", "0864152412", "jonesben@livemail.com");
		
		Friend[] friends = {sandy, ben};
		System.out.println("My friends are -;");
		for(Friend f: friends){
			System.out.println(f);
		}
	}
	
	
	
class Friend{
	
	private String firstName, lastName, phoneNo, emailAddress;
	
	public Friend(String firstName, String lastName, String phoneNo, String emailAddress){
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.emailAddress = emailAddress;
	}
	
	public String toString(){
		return String.format("%-15s %-2s %-15s %-15s %-2s %-15s  %-15s %-2s %-15s %-15s %-2s %-20s", "\nFirst Name    ",":", firstName, "\nLast Name ",":", lastName,
						  "\nPhone No ",":", phoneNo, "\nEmail Address ",":", emailAddress);
	}
}
	
	public static void assignment4_3A(){
		String[] names = {"Sandy", "Mary", "Jim"};
		for(String n: names)
			System.out.println(n);
	}
	
	
	public static void assignment4_2D(){
		
		String b = "double trouble ";
		System.out.println("Lenght "+ b.length()+ "\nAfter trim lenght "+ b.trim().length());
	    b = (b.replaceAll("trouble", "bubble"));
		System.out.println("The index position of string, \"bubble\", in the newly created string is: "+b.indexOf("bubble"));
	}
	
	public static void assignment4_2C(){
		
		String story = "Duke's great adventure"+'1';
		String messagOne = "Java Duke";
		String messageTwo = "java Duke";	
		System.out.println("Does "+ messagOne +" and "+ messageTwo+ " contains the some characters? "+ messagOne.equalsIgnoreCase(messageTwo));
	}
	
	
	public static void assignment4_2B(){
		Assignment4_1 string = new Assignment4_1();
		System.out.println(" Buckle is found at index position: "+ string.message2.lastIndexOf("buckle"));
		System.out.println(" String ends with shoe? "+ string.message2.endsWith("shoe"));
		System.out.println(" Character at index position 2 is : " + string.message2.charAt(2));
	}
	
	
	
	public static void assignment4_2A(){
		
		System.out.println("Is the strong \"big\" in message string? Ans:  "+new Assignment4_1().message.contains("big"));
		Assignment4_1 string = new Assignment4_1();
		String extract = "Extract the string big, from the string " + string.message;
		System.out.println(extract + "  Ans: "+string.message.substring(string.message.indexOf("b"), string.message.indexOf("g")+1));
		String replace = "Replace the string big, with the string magical. Ans: " + string.message.replaceAll("big", "magical");
		System.out.println(replace);
	}
	
	
	public static void assignment4_1C(){
		String story = "Duke's great adventure"+1;
		String poem = new String("Duke's great adventure");
		System.out.println(story == poem);  // false 
	}
	
	public static void assignment4_1B(){
		
		byte a = 12;
		byte z =23;
		z+=20;
		System.out.println(z);
		
		String b = " Favorite number";
		b+=z;
		b+=1;
		System.out.println(b);
	}
	
	
	public static void assignment4_1A(){
		System.out.println("My favorite number " + 75 + 7 + 12);
	}
}