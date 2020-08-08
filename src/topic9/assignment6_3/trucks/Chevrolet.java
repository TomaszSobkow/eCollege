package topic9.assignment6_3.trucks;

import topic9.assignment6_3.Truck;
import topic9.assignment6_3.trucksBehaviours.AcceleratingChevroletCamaro;
import topic9.assignment6_3.trucksBehaviours.BrakingChevroletCamaro;

import javax.sound.midi.Track;

public class Chevrolet extends Truck {
    public Chevrolet(String manufacturer, String model, String price, String engineSize) {
        super(manufacturer, model, price, engineSize);
        accelerateInterface = new AcceleratingChevroletCamaro();
        brakeInterface = new BrakingChevroletCamaro();
    }
}
