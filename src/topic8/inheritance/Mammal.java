package topic8.inheritance;

public abstract class Mammal extends Animal{

    private boolean isSwimming;
    private  String canSwim;

    public Mammal(int age, String name, boolean isSwimming) {
        super(age,name);
        if(isSwimming){this.canSwim = "Yes";}
        else {this.canSwim = "No";}
    }

    @Override
    public String toString() {
        final String species = "Mammal";
        return super.toString()+ "\nSpecies: "+ species + "\nCan I swim:  "+ canSwim;
    }

    @Override
    public String getVoice() {
        //super.getVoice();
        System.out.print(" Saying");
        return "";

    }


}
