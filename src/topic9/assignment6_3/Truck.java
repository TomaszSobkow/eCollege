package topic9.assignment6_3;

import topic9.assignment6_3.interfaces.AccelerateInterface;
import topic9.assignment6_3.interfaces.BrakeInterface;

public abstract class Truck {


    protected AccelerateInterface accelerateInterface;
    protected BrakeInterface brakeInterface;
    protected String manufacturer, model, price , engineSize;

    public Truck(String manufacturer, String model, String price, String engineSize) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.engineSize = engineSize;
    }

    public void accelerate(){accelerateInterface.accelerate();}
    public void brake(){brakeInterface.brake();}
    public void radioTiunningIn(){
        System.out.println("Radio tuned in...\'Winding your way down on Baker Street...\'");
    }

    public void setUpAccelerate(AccelerateInterface ai){ this.accelerateInterface = ai;}
    public void setUpBrake(BrakeInterface bi){this.brakeInterface = bi;}


    @Override
    public String toString() {
        return "\nManufacturer: " +getManufacturer()+ "\nModel:       " +getModel()+  "\nPrice:       "+getPrice()+
                "\nEngine Size: " +getEngineSize();
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    public String getEngineSize() {
        return engineSize;
    }
    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }
}
