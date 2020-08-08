package topic9.assignment6_3.trucks;

import topic9.assignment6_3.Truck;
import topic9.assignment6_3.trucksBehaviours.DefaultAccelerating;
import topic9.assignment6_3.trucksBehaviours.DefaultBraking;

public class Volvo extends Truck {
    public Volvo(String manufacturer, String model, String price, String engineSize) {
        super(manufacturer, model, price, engineSize);
        accelerateInterface = new DefaultAccelerating();
        brakeInterface = new DefaultBraking();
    }
}
