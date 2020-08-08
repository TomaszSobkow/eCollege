package topic5;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;

public class FormatOutput {

   static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {

    String[] names = {"Tomek","Agnieszka","John"};
    Integer[] age = {12,34,56};
        int i =0;
        System.out.printf("\tCustomers in database \t%1$te %1$tB %1$tY "+"("+"%1$TT"+")", new Date());
        System.out.println("\n");
    for (String n: names){
        System.out.printf("%-10s",n);
        for( ;i<age.length;){
            System.out.println(": "+age[i++]);
            break;
        }

    }

        //System.out.printf("%tT",new Date());
     }



    }

