package topic9.assignment6_6.devices;

import topic9.assignment6_6.Phone;
import topic9.assignment6_6.functions.Recharge;
import topic9.assignment6_6.interfaceses.RecargeInterface;

public class G200 extends Phone implements RecargeInterface {

    public G200(String name, int noOfDisplayPixels, float width, float height, float weight, boolean isPowerOn, boolean isPowerOff) {
        super(name, noOfDisplayPixels, width, height, weight, isPowerOn, isPowerOff);
        recargeInterface = new Recharge();
    }

    @Override
    public void recharge(boolean status) {
        if (status == true) System.out.println(getClass().getSimpleName() + "Is currently recharging..");
        System.out.println(getClass().getSimpleName() + "Is currently NOT !  recharging..");
    }
}
