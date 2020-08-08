package topic9.assignment6_9;

public class BrakingAcceleratingUnknownCar implements UnknownCar {

    @Override
     public void brake(){ System.out.println("Braking as unknown car");}

     @Override
     public void accelerate(){System.out.println("Accelerate as unknown car"); }

     @Override
     public void refueling(){ System.out.println("Refueling as unknown car"); }
}
