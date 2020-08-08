package topic9.assignment6_5.objects;

import topic9.assignment6_5.Pumpable;
import topic9.assignment6_5.behaviours.PumpUP;
import topic9.assignment6_5.behaviours.ReleaseAir;

public class Mattress extends Pumpable {

    @Override
    public String className(){
         return getClass().getSimpleName();}

    public Mattress(){
        pumpInAir = new PumpUP();
        releaseTheAir = new ReleaseAir();
    }

    public void pumpUpMattress(){
        System.out.println("Inflate the air "+ className()+":");
        new PumpUP().pumpInAir();
        System.out.println("The inflation process of "+className() +" has been completed");
    }

    public void releaseAirMattress(){
        System.out.println("\nDeflate the air "+ className()+":");
        new ReleaseAir().releaseAir(100);
        System.out.println("The deflation process of "+className()+" has been completed.");


    }
}

