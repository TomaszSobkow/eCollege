package topic9.assignment6_5.behaviours;

import topic9.assignment6_5.interfaces.PumpInAir;

public class PumpUP implements PumpInAir {
    @Override
    public void pumpInAir() {
        float i =10;
        while ( i <=100){
            System.out.println(i+ "% inflated.");
            i += 10;
        }
    }
}
