package topic9.bird;

public class Bird {
    public  String getName() {
        return "Unknown Bird";
    }
    public void displayInformation() {
        System.out.println("The bird "+ getClass().getSimpleName()+" name is: "+getName());
    }
}
