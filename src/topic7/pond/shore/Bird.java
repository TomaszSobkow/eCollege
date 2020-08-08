package topic7.pond.shore;

public class Bird {
	
 protected  String protectedTextBirdClass = "Protected String  in Bird Class";
 String defaultString = "Default string in class Bird";
 public  String publicString = "Public String from Bird Class";

  protected static int noOfBirds;
 public Bird(){
  noOfBirds++;
 };

 protected void protectedFloatInWater(){
  System.out.println(protectedTextBirdClass);
 }
    
}
