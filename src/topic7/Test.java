package topic7;

import topic7.lambda.PrintName;

public class Test {

    public static void main(String[] args) {
    //Sum sum = (a, b, c) -> ((a * Math.random()) / b * c);
        Sum nams = (a -> a.concat("Tomek"));



        System.out.println(nams.printName("Aga "));
       // System.out.println(sum.oneSum(4,3f,123L));
 
    }


}


