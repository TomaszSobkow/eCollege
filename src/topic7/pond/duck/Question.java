package topic7.pond.duck;

public class Question{
	
	private String privateClassString = new DuckTeacher().duckTeacherName;

	public static void main(String[] args){
	
	int noPoints = 0;
	int noPointsIn = 100;
	
	if(noPoints < noPointsIn){
		noPoints = noPoints++;
		noPointsIn = --noPointsIn;
		
		System.out.println("No of Points 1?: " +noPoints+"\nNo points in 99?: "+ noPointsIn );
	}
	
	}
}
