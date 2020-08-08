package topic9.assignment6_1.fruits;
import topic9.assignment6_1.behaviors.PeelingMethodsSlowly;


public class Banana extends Fruits {
    String origin;

    public Banana(String color, String name, String origin) {
        super(color, name);
        this.origin = origin;
        peeling = new PeelingMethodsSlowly();



    }

    public Banana(){
        peeling = new PeelingMethodsSlowly();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString(){
        return super.toString()+"\nOrigin:  "+ getOrigin();
    }

}
