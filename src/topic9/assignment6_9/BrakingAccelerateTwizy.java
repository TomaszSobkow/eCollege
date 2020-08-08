package topic9.assignment6_9;

public class BrakingAccelerateTwizy implements ElectricCar{
    @Override
    public void brake() {
        System.out.println("Electric car braking in electric!! technology");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric car accelerating in electric!! technology");
    }

    @Override
    public void refueling() {
        System.out.println("Charging in electric car");
    }
}
