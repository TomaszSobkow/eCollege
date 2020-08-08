package topic9.assignment6_9;

public class Twizy extends Car {
    public Twizy(String manufacturer, String model, String registration, int year) {
        super(manufacturer, model, registration, year);
        electricCar = new BrakingAccelerateTwizy();
    }

    @Override
    public String toString() {
        super.toString();
        super.electricCarAccelerate();
        super.turnOnRadio();
        super.electricCarBraking();
        super.electricCarRefueling();
         return "";
    }
}
