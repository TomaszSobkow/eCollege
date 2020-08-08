package topic7.lambda;

public class Lambda{
	
	private String spacies;
	private boolean canHop;
	private boolean canSwim;
	
	public Lambda(String spaciesName, boolean hopper, boolean swimmer){
		spacies = spaciesName;
		canHop = hopper;
		canSwim = swimmer;
	}
	
	public String toString(){ return spacies; }
	
	public void setSpacies(String spacies){
		this.spacies = spacies;
	};
	
	public  String getName(){return spacies;}
	public boolean getCanHop(){ return canHop; }
	public boolean getCanSwim(){ return canSwim;}
	
	
	
}