package topic8.inheritance;

public abstract class Bird extends Animal{


   private boolean isFlying;
   private String flyable = "No";


    public Bird(int age, String name, boolean isFlying ) {
        super(age,name);
        if(isFlying){flyable = "Yes";}
    }

        @Override
        public String toString(){
            String species = "Bird";
            return super.toString()+" \nSpecies: "+ species +"\nDoes can fly? "+this.flyable;
        }

        @Override
        public String getVoice () {
            System.out.print("Singing,");
            return "";
        }

    }

