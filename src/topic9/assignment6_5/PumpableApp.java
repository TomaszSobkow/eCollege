package topic9.assignment6_5;

import topic9.assignment6_5.objects.Dinghy;
import topic9.assignment6_5.objects.Mattress;

public class PumpableApp {

    public static void main(String[] args) {
        Mattress mattress =  new Mattress();
        mattress.pumpUpMattress();
        mattress.releaseAirMattress();

        Dinghy dinghy = new Dinghy();
        dinghy.pumpUpDinghy();
        dinghy.releaseAirDinghy();
    }
}
