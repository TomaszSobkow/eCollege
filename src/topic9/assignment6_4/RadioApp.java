package topic9.assignment6_4;

public class RadioApp {

     protected Tunable tunable;

    protected void setTuning(){tunable.adjustTuning();}

    public static void main(String[] args) {
        Radio radio = new Radio();
        WalkieTalkie walkieTalkie =new WalkieTalkie();
        walkieTalkie.adjustTuning();
        radio.adjustTuning();
    }
}
