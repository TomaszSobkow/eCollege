package topic10;

import java.util.Enumeration;

public class Assignment7_1 {

    static  int[] numbers = {32, 12, 10, 16, 30, 32, 20};

    {
        System.out.println("ininit block");
        //System.out.println("devided by 0" + 12 / 0);
    }
    public static void main(String[] args) {
        System.out.println(new Assignment7_1().numbers[3]+ "in static main menu");
        new Assignment7_1();
//        try {
//            //uncheck exception
//            System.out.println("number at index 7 is "+ numbers[7]);
//        }catch (IndexOutOfBoundsException i){
//            System.err.println(i.toString().substring(i.toString().indexOf(':')+1));
//        }
//    }
}
}
