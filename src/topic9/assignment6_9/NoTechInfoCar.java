package topic9.assignment6_9;

public class NoTechInfoCar extends Car {

    public NoTechInfoCar(){
        unknownCar = new BrakingAcceleratingUnknownCar();
    }

    @Override
    public String toString() {
        super.toString();
        unknownCar.accelerate();
        this.turnOnRadio();
        unknownCar.brake();
        unknownCar.refueling();
        return "\n";
    }

    @Override
    public void turnOnRadio() {
        System.out.println("Unknown radio status");
    }
}
