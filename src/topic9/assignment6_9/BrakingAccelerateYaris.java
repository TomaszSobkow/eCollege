package topic9.assignment6_9;

public class BrakingAccelerateYaris implements MotorCar {

    @Override
    public void brake() {
        System.out.println( "I'm motor car and I can braking like Yaris Car");
    }

    @Override
    public void accelerate() {
        System.out.println("I'm motor car and I'm accelerating like Yaris Car");
    }

    @Override
    public void refueling() {
        System.out.println("Refueling in Yaris car");
    }
}
