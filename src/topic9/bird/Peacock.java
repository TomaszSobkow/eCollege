package topic9.bird;

public class Peacock extends Bird {

    public String getName() {
        return "Peacock";
    }

    public static void main(String[] args) {
        Bird unknown = new Peacock();
       unknown.displayInformation();


     Peacock peacock1 = (Peacock) unknown;
       peacock1.displayInformation();
        }

    public void displayInformation() {
        System.out.println("The bird "+ getClass().getSimpleName()+" name is: "+getName());
    }
}

