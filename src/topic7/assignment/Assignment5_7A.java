package topic7.assignment;

public class Assignment5_7A {
int xx = 3;

	public static void main(String[] args){
		Assignment5_7A obj = new Assignment5_7A();
		int x = 7;
		obj.changeIt(x);
		System.out.println(x);

		Assignment5_7A obj1 = new Assignment5_7A();
		Assignment5_7A obj2 = new Assignment5_7A();

		obj1.xx = 3;
		obj2.xx = 9;
		obj1 = obj2;

		obj1.changeIt(obj2);
		System.out.println(obj1.xx);
		System.out.println(obj2.xx);

	}

	public int changeIt(int param){
		param++;
		return param;
	}

	public void changeIt(Assignment5_7A obj){
	obj.xx = 900;}

	}