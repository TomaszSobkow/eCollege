package topic9.assignment6_6.interfaceses;

public interface RecargeInterface {
   default void recharge(boolean status){
           if(status == true) System.out.println( "Is currently recharging..");
           System.out.println("Is currently NOT !  recharging..");
       }
   }

