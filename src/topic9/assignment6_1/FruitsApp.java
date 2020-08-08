package topic9.assignment6_1;
import topic9.assignment6_1.fruits.Banana;
import topic9.assignment6_1.fruits.Fruits;
import topic9.assignment6_1.fruits.Orange;

import java.util.ArrayList;
import java.util.List;

public class FruitsApp {

    static List<Fruits> fruitsList = new ArrayList();

    public static void main(String[] args) {

        Orange orange = new Orange("Orange","Orange","Spain");
        Banana banana = new Banana("Banana", "Yellow","Costa Rica");

        fruitsList.add(banana);
        fruitsList.add(orange);
        for(Fruits f : fruitsList){
            System.out.println(f + "\n" + f.howToPeel());
        }

//        Orange orange = new Orange();
//        orange.setName("Orange");
//        orange.setColor("Orange");
//        orange.setOrigin("Spain");
//        fruitsList.add(orange);
//
//
//        Banana banana = new Banana();
//        banana.setName("Banana");
//        banana.setColor("Yellow");
//        banana.setOrigin("Costa Rica");
//        fruitsList.add(banana);




    }
}
