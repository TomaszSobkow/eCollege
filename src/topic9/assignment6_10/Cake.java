package topic9.assignment6_10;

public class Cake {
    private String name, toppings;
    private float noOfCalories;


    public Cake(String name, String toppings, float noOfCalories) {
        this.name = name;
        this.toppings = toppings;
        this.noOfCalories = noOfCalories;

    }

    public boolean checkCalories(){
        boolean isHealthy = false;
        if(this.getNoOfCalories() <= 215){
            isHealthy = true;
        }
        return isHealthy;
    }


    @Override
    public String toString() {
        return  "Name:         " + name +
                "\nToppings:     " + toppings  +
                "\nNoOfCalories: " + noOfCalories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public float getNoOfCalories() {
        return noOfCalories;
    }

    public void setNoOfCalories(float noOfCalories) {
        this.noOfCalories = noOfCalories;
    }
}
