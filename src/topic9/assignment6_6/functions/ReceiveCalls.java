package topic9.assignment6_6.functions;

import topic9.assignment6_6.interfaceses.ReceiveCallInterface;

public class ReceiveCalls implements ReceiveCallInterface {


    @Override
    public void receiveCall(String incomingPhoneNo) {
        System.out.println("Incoming call from " +incomingPhoneNo+ " on a "+ getClass().getSimpleName()+" phone."+
                "\n Terminating a phone call on a "+getClass().getSimpleName()+ " phone.");
    }
}
