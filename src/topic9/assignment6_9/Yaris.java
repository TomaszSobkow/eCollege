package topic9.assignment6_9;

public class Yaris extends Car{

    public Yaris(String manufacturer, String model, String registration, int year) {
        super(manufacturer, model, registration, year);
        motorCar = new BrakingAccelerateYaris();
    }

    @Override
    public String toString() {
        super.toString();
        motorCarAccelerate();
        super.turnOnRadio();
        motorCarBraking();
        motorCarRefueling();
        return "\n";
    }
}
