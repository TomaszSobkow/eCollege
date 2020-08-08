package topic8.inheritanc2;

public class Mouse extends Rodent {
    protected static int tailLength = 8;
    public void getRodentDetaile(){
        System.out.println("Child mouse tail "+tailLength+" Parent Tail "+super.tailLength);
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Rodent rodent = new Rodent();

        mouse.getRodentDetaile();
        rodent.getRodentDetaile();

    }

}
