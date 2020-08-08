package topic9.assignment6_6.functions;
import topic9.assignment6_6.interfaceses.MakeCallInterface;

public class MakeCall implements MakeCallInterface {
    @Override
    public void makeCall(String noToDial) {
        System.out.println("Dialling number " +noToDial+ " on a "+getClass().getSimpleName()+ " phone.");
    }
}
