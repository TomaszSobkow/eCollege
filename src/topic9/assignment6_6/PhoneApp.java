package topic9.assignment6_6;

import topic9.assignment6_6.devices.G200;
import topic9.assignment6_6.devices.LandLine2000;

import java.util.ArrayList;
import java.util.List;

public class PhoneApp {

    public static void main(String[] args) {
        LandLine2000 landLine2000 = new LandLine2000("LandLine2000",400,5.6f,8.5f,
                80.5f,true,false);

        G200 g200 = new G200("G200",510,4.5f, 8.6f,80.5f, true,
                false);

        List<Phone> phones = new ArrayList<>();
        phones.add(landLine2000);
        phones.add(g200);




//        for(Phone ph : phones){
//            System.out.println(ph);
//        }
    }
}
