package topic9.assignment6_3.trucksBehaviours;

import topic9.assignment6_3.interfaces.AccelerateInterface;

public class AcceleratingChevroletCamaro implements AccelerateInterface {
    @Override
    public void accelerate() {
        System.out.println("\nSpeeding up in a Camaro...");
    }
}
