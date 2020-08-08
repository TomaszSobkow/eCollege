package topic9.assignment6_3.trucksBehaviours;

import topic9.assignment6_3.interfaces.AccelerateInterface;

public class AcceleratingToyotaTundra implements AccelerateInterface {
    @Override
    public void accelerate() {
        System.out.println("\nAccelerating in a Tundra...");
    }
}
