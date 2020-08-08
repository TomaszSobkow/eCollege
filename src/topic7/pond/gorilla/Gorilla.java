public class Gorilla{

public static int countGorilla;
public static void addGorilla(){ countGorilla++; }
public void babyGorilla(){ countGorilla++; }
public void announceBabies(){
	addGorilla();
	babyGorilla();
}


}