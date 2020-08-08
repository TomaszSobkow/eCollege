package topic9.assignment6_9;

public abstract class Car {
    MotorCar motorCar;
    ElectricCar electricCar;
    UnknownCar unknownCar;

    public void motorCarAccelerate(){motorCar.accelerate();}
    public void motorCarBraking(){motorCar.brake();}
    public void motorCarRefueling(){motorCar.refueling();}

    public void electricCarAccelerate(){electricCar.accelerate();}
    public void electricCarBraking(){electricCar.brake();}
    public void electricCarRefueling(){electricCar.refueling();}

    private String manufacturer, model, registration;
    private int year;

    public Car(String manufacturer, String model, String registration, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.registration = registration;
        this.year = year;
    }
        public Car(){
        this("unknown","unknown","unknown",0000);

        }


    @Override
    public String toString() {
        System.out.println("Manufacturer: " + manufacturer +
                "\nModel:        " + model  +
                "\nRegistration: " + registration +
                "\nYear:         " + year);
        return  "";
    }

    public void turnOnRadio(){
        System.out.println("Radio turned on and tuned in.");
    }
}
