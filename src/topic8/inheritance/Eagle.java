package topic8.inheritance;

public class Eagle extends Bird{
    private float wingsLong;


    public Eagle(int age, String name, boolean isFlying, float wingsLong) {
        super(age, name, isFlying);
        this.wingsLong = wingsLong;
    }

    public Eagle(int age, float wingsLong) {
        this(age, "",true, wingsLong);
    }

    public Eagle(){
        this(0,"",true,0);
    }

    @Override
    public String toString() {
        System.out.println(super.toString() + "\nWings: " +this.wingsLong);
        return "";
    }

    @Override
    public String getVoice() {
        super.getVoice();
        System.out.println(" I'm an Eagle...");
        return "";
    }
}
