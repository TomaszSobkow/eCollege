package topic9.assignment6_6;

import topic9.assignment6_6.interfaceses.HangUp;
import topic9.assignment6_6.interfaceses.RecargeInterface;
import topic9.assignment6_6.interfaceses.Streamable;

public class Phone {

    protected HangUp handUp;
    protected Streamable streamable;
    protected RecargeInterface recargeInterface;

    public void rechargeBattery(){recargeInterface.recharge(isRecharging());}

    private String name;
    private int noOfDisplayPixels;
    private float width, height, weight;
    private boolean isPowerOn, recharge;

    public Phone(String name, int noOfDisplayPixels, float width, float height, float weight, boolean isPowerOn, boolean recharge) {
        this.name = name;
        this.noOfDisplayPixels = noOfDisplayPixels;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.isPowerOn = isPowerOn;
        this.recharge = recharge;
    }

    @Override
    public String toString() {
        return "****************** Test phone Functionality *********************\nName:              " + name  +
                "\nNo Of Display Pixels: " + noOfDisplayPixels +
                "\nwidth:             " + width +
                "\nheight:            " + height +
                "\nweight:            " + weight +
                "\nisPowerOn:         " + isPowerOn +
                "\nRecharging:        " + recharge+ "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfDisplayPixels() {
        return noOfDisplayPixels;
    }

    public void setNoOfDisplayPixels(int noOfDisplayPixels) {
        this.noOfDisplayPixels = noOfDisplayPixels;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public boolean isRecharging() {
        return recharge;
    }

    public void setRecharge(boolean powerOff) {
        recharge = powerOff;
    }
}
