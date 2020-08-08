package topic9.assignment6_3.trucksBehaviours;

import topic9.assignment6_3.interfaces.AccelerateInterface;

public class DefaultAccelerating implements AccelerateInterface {
    @Override
    public void accelerate() {
        System.out.println("\nDefault accelerating");
    }
}
