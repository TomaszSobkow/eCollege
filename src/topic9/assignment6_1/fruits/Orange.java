package topic9.assignment6_1.fruits;

import topic9.assignment6_1.behaviors.PeelingMethodsSlowly;

public class Orange extends Fruits {

    private String origin;

    public Orange(String name, String color, String origin) {
        super(name, color);
        this.origin = origin;
        peeling = new PeelingMethodsSlowly();
    }

    public Orange(){
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
        return super.toString()+"\nOrigin:  "+getOrigin();
    }

}
