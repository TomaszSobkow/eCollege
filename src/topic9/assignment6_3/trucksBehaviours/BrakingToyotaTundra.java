package topic9.assignment6_3.trucksBehaviours;

import topic9.assignment6_3.interfaces.BrakeInterface;

public class BrakingToyotaTundra implements BrakeInterface {
    @Override
    public void brake() {
        System.out.println("Applying the brakes in a Tundra");
    }
}
