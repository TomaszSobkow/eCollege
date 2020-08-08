package topic9.assignment6_2;



import topic9.assignment6_2.interfaces.Cooking;

public abstract class Vegetable {

    public String name, family;
    protected Cooking cooking;

    public void howToCook(){ cooking.cooking(); }
    public abstract void addAddactives();


    public Vegetable(String name, String family) {
        this.name = name;
        this.family = family;
    }


    @Override
    public String toString(){
        return "\nName:    "+ getName()+ "\nFamily:  "+ getFamily();
    }


    public Cooking getCooking() {
        return cooking;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }
}
