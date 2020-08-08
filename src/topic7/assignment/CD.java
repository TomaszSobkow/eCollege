package topic7.assignment;

public class CD{
private  String artist, title, label, decadeOfRelease;
private static int noOfCD; 


public CD(String artist, String title, String label, String decadeOfRelease) {
	this.artist = artist;
	this.title = title;
	this.label = label;
	this.decadeOfRelease = decadeOfRelease;
	noOfCD++;
	}

	public boolean isBonjovi(){
		if(this.artist.equals("Bon Jovi")) return true;
		else {return false;}
	}

	public boolean is80sCD(){
		if(this.decadeOfRelease.equals("80s")) return true;
		else {return false;}
	}
	
	public String toString(){
		System.out.println("Artist :"+ artist+ "\nTitle :" +title+
							"\nLabel :" +label+"\nDecade :"+decadeOfRelease);

		return "";
	}
	

}
