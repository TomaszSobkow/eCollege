package topic9.assignment6_5.objects;

import topic9.assignment6_5.Pumpable;
import topic9.assignment6_5.behaviours.PumpUP;
import topic9.assignment6_5.behaviours.ReleaseAir;

public class Dinghy extends Pumpable {

    @Override
    public String className(){return super.className();}

    public Dinghy(){
        pumpInAir = new PumpUP();
        releaseTheAir = new ReleaseAir();
    }

    public void pumpUpDinghy(){
        System.out.println("\nInflate the "+ className()+":");
        new PumpUP().pumpInAir();
        System.out.println("The inflation process of "+className() +" has been completed");
    }

    public void releaseAirDinghy(){
        System.out.println("\nDeflate the "+ className()+":");
        System.out.println("\nRemove the wooden seat and floor."+"\nDeflate bow camber."+"\nAttach foot pumps to each of the valves"+"\n");
        new ReleaseAir().releaseAir(90);
        System.out.println("The deflation process of "+className()+" has been completed.");


    }





}
