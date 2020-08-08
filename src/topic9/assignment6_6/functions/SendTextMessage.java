package topic9.assignment6_6.functions;

import topic9.assignment6_6.interfaceses.SendingTxtInterface;

public class SendTextMessage implements SendingTxtInterface {
    @Override
    public void sendText(String messageToSend, String noToText) {
        System.out.println("Sending text: "+messageToSend+ " to phone no: "+noToText+ " on a "+getClass().getSimpleName()+
                " phone.");
    }
}
