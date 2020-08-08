package topic9.assignment6_4;

public class WalkieTalkie extends RadioApp implements Tunable{

    public WalkieTalkie(){
        //tunable = new WalkieTalkie();
    }

    @Override
    public void adjustTuning() {
        System.out.println("Adjusting tuning on a Walkie Talkie");
    }
}
