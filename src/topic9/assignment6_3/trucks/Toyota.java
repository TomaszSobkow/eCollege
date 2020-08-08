package topic9.assignment6_3.trucks;

import topic9.assignment6_3.Truck;
import topic9.assignment6_3.trucksBehaviours.AcceleratingToyotaTundra;
import topic9.assignment6_3.trucksBehaviours.BrakingToyotaTundra;

public class Toyota extends Truck {
    public Toyota(String manufacturer, String model, String price, String engineSize) {
        super(manufacturer, model, price, engineSize);
        accelerateInterface = new AcceleratingToyotaTundra();
        brakeInterface = new BrakingToyotaTundra();
    }
}
