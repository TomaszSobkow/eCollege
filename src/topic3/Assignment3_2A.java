package topic3;

import javax.swing.*;

public class Assignment3_2A {

    public static void main(String[] args) {

        String tem =  JOptionPane.showInputDialog(null,"Please enter temperature ");

        float temp = Float.parseFloat(tem);

        if (temp >=16)
            System.out.println("Summer");
        else if(temp >=11 && temp <= 15)
            System.out.println("Spring");
        else if (temp >= 7 && temp <= 10 )
            System.out.println("Autumn");
        else if (temp <7)
            System.out.println("Winter");


    }
}
