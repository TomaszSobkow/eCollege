package topic9.assignment6_3.trucksBehaviours;

import topic9.assignment6_3.interfaces.BrakeInterface;

public class BrakingChevroletCamaro implements BrakeInterface {
    @Override
    public void brake() {
        System.out.println("Hitting the brakes in a Camaro...");
    }
}
