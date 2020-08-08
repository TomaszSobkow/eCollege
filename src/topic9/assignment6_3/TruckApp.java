package topic9.assignment6_3;

import topic9.assignment6_3.trucks.Chevrolet;
import topic9.assignment6_3.trucks.Toyota;
import topic9.assignment6_3.trucks.Volvo;
import topic9.assignment6_3.trucksBehaviours.AcceleratingToyotaTundra;
import topic9.assignment6_3.trucksBehaviours.BrakingToyotaTundra;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TruckApp {


    public static void main(String[] args) {
        List<Truck> trucks = new ArrayList<>();

        Toyota tundra = new Toyota("Toyota","Tundra","20000.0","2.6");
        Chevrolet camaro = new Chevrolet ("Chevrolet","Camaro","22000.0","2.8");
        Volvo F75 = new Volvo("Volvo","F75","45000.9","5.0");
        trucks.add(tundra);
        trucks.add(camaro);
        trucks.add(F75);

        for(Truck tr: trucks){
            System.out.println(tr);
            tr.accelerate();
            tr.radioTiunningIn();
            tr.brake();
        }
         System.out.println("\n*******************************New settings for accelerate and brake !!!");
         for (Truck tr : trucks){
            tr.setUpAccelerate(new AcceleratingToyotaTundra());
            tr.setUpBrake(new BrakingToyotaTundra());
             System.out.println(tr);
             tr.accelerate();
             tr.radioTiunningIn();
             tr.brake();
        }
    }
}
