package topic9.assignment6_1.fruits;

import topic9.assignment6_1.interfaces.PeelingMethods;

public abstract class Fruits {

    PeelingMethods peeling;
    private String name, color, origin;

    public String howToPeel(){ return peeling.peeling();}

    public Fruits(String name, String color) {
        this.color = color;
        this.name = name;
    }

    public Fruits(){}

    @Override
    public String toString(){
        return "\nName:    "+ getName()+ "\nColor:   "+getColor();
    }


    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }





}
