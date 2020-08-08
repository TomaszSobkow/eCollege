package topic8.inheritance;

import java.awt.Color;


public class Parrot extends Bird{
    private Color wingColor;
    private Color bodyColor;

    public Parrot(int age, String name, boolean isFlying, Color wingColor, Color bodyColor) {
        super(age, name, isFlying);
        this.wingColor = wingColor;
        this.bodyColor = bodyColor;
    }

    public Parrot(int age) {
        this(age,"",true, null,null);
    }

    public Parrot(){ this(0);    }



    @Override
        public String toString() {
        System.out.print(super.toString()+ "\nWings Color: " + wingColor + "\nBody color: " + bodyColor +
                "\nGet Voice: ");
        return  this.getVoice();
        }

    @Override
        public String getVoice() {
            super.getVoice();
            System.out.print(" I'm an Parrot");
            return "";
        }

    public Color getWingColor() {
        return wingColor;
    }

    public void setWingColor(Color wingColor) {
        this.wingColor = wingColor;
    }

    public Color getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(Color bodyColor) {
        this.bodyColor = bodyColor;
    }


}
