package topic9.assignment6_10;

import topic2.Assignment1_5.packageA.ClassA;

import java.util.ArrayList;
import java.util.function.Predicate;

public class CakeApp {

    public static void main(String[] args) {
        ArrayList<Cake> cakes = new ArrayList<>();
        ArrayList<String> healthyCages = new ArrayList<>();

        Cake cake = new Cake("LemonDrizzle","Lemon incing sugar",200f);
        Cake cake1 = new Cake("Fairy Cake","Chocolate icing sugar",400f);
        Cake cake2 = new Cake("Battenburg","Chocolate icing sugar", 800f);
        Cake cake3 = new Cake("Strawberry Sponge","Strawberry incin sugar",215);

        cakes.add(cake); cakes.add(cake1); cakes.add(cake2); cakes.add(cake3);

             for(Cake ca : cakes){
                 displayCalories(ca, c-> c.checkCalories());
             }


//        String healthy = "";
//        for(Cake c : cakes){
//            if(c.getNoOfCalories() < 415){
//               healthyCages.add(c.getName());
//            }
//        }
//        System.out.println( "Healthy cages ar:");
//        int index = 1;
//        for(String s : healthyCages) {
//            System.out.println(index+".  "+s );
//            index++;
//        }
//
       }

    public static void displayCalories(Cake cake, Predicate<Cake> predicate){
        if(predicate.test(cake)){
            System.out.println("\nHealthy cage las than 215 calories"+ "\n" +cake);

        }

    }
}
