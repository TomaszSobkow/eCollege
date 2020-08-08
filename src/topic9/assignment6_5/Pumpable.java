package topic9.assignment6_5;

import topic9.assignment6_5.interfaces.PumpInAir;
import topic9.assignment6_5.interfaces.ReleaseTheAir;

public abstract class Pumpable {
    protected PumpInAir pumpInAir;
    protected ReleaseTheAir releaseTheAir;

    public  String className(){return getClass().getSimpleName();};





}
