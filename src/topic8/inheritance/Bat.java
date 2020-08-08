package topic8.inheritance;

public class Bat extends Mammal{

    private String origin;

    public Bat(int age, String name, boolean isSwimming, String origin) {
        super(age, name, isSwimming);
        if(origin.isEmpty()){this.origin = "unknown";}
        else {this.origin = origin;}
    }

    public Bat(){
        this(0, "", false,"");
    }


    @Override
    public String toString() {
        System.out.println(super.toString()+"\nOrigin: "+ origin);
        return "";
    }

    @Override
    public String getVoice() {
        super.getVoice();
        System.out.print(" I'm an Bat");
        return "";
    }
}
