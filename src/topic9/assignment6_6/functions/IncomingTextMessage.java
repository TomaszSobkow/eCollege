package topic9.assignment6_6.functions;

import topic9.assignment6_6.interfaceses.IncomingTextInterface;

public class IncomingTextMessage implements IncomingTextInterface {
    @Override
    public void receiveText(String message, String incomingPhoneNo) {
        System.out.println("Incoming text: "+message+ " received from phone no: "+incomingPhoneNo+
                " on a "+ getClass().getSimpleName()+" phone");
    }
}
