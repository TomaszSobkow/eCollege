package topic7.assignment;

public class Assignment5_7B{
	
	static int x =3;
	
	public static void main(String[] args){
		Assignment5_7B obj = new Assignment5_7B();
		obj.x = 100;
		
		Assignment5_7B obj2 = new Assignment5_7B();
		obj2.x = 200;
		
		x = 1000;
		obj.changeIt(x);
		
		x = 2000;
		obj2.changeIt(x);
		
		obj.changeIt(obj);
		
		System.out.println(Assignment5_7B.x);
		System.out.println(obj.x);
		System.out.println(obj2.x);
		
		
		
	}
	
	public void changeIt(int param){
		x = param;
	}
	
	public void changeIt(Assignment5_7B obj){
		obj.x = 900;
	}
	
}