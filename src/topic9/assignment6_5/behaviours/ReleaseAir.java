package topic9.assignment6_5.behaviours;

import topic9.assignment6_5.interfaces.ReleaseTheAir;

public class ReleaseAir implements ReleaseTheAir {
    @Override
    public void releaseAir(float i) {
        while ( i >= 0){
            System.out.println(i+ "% pressure remaining");
            i -= 10;
        }

    }
}
