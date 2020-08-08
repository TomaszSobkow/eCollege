package topic7.assignment;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Cassette{
	
	private String title, artist;
	private boolean readOnly = false;
	
	private static int noOfCreated; 
	
	public Cassette(String title, String artist, boolean readOnly){
		this.title = title;
		this.artist = artist;
		this.readOnly = readOnly;
		noOfCreated++;
	}
	
	@Override
	public String toString(){
		System.out.println("Title:" + getTitle()+"\nArtist: "+ getArtist()+"\nRead ONLY: " +getIsReadeble());
		return "";
	}
	
	public String getArtist(){ return artist;}
	public String getTitle() {
		if(this.title.isEmpty()){
			this.title = " .... Not Assignet";
		}
		return title;
	}

		public boolean getIsReadeble(){return readOnly;}
	
	public void setArtist(String artist){
		if(this.artist.isEmpty()){this.artist = "not assignet";}
			else{this.artist = artist;}
	}
	
	public void setTitle(String title){
		if(this.title.isEmpty()){this.title = "not assignet";}
			else{this.title = title;}
	}

	public boolean isBonJovi(){
		if(this.getIsReadeble()){
			return true;
		}else {return false;}
	}
}

class Assignment5_6{
	private static ArrayList<Cassette> collection = new ArrayList<Cassette>();

	public static void main(String[] args){

			collection.add(new Cassette("Wired for Sound", "Cliff Richard", true));
			collection.add(new Cassette("Results", "Lisa Minnelli", true));
			collection.add(new Cassette("Actuality", "Pet Shop Boys", false));


		displayCatalogue(collection,pred->pred.getIsReadeble());

	}

	public static void displayCatalogue(java.util.List<Cassette> collection, Predicate<Cassette> predicate){
		for(Cassette casett : collection){
			if(predicate.test(casett)){
				System.out.println(casett + "\n");
			}else{
				System.out.println(casett + "\n");
			}
		}
	};
}