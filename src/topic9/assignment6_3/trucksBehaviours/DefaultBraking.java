package topic9.assignment6_3.trucksBehaviours;

import topic9.assignment6_3.interfaces.BrakeInterface;

public class DefaultBraking implements BrakeInterface {
    @Override
    public void brake() {
        System.out.println("Default braking");
    }
}
