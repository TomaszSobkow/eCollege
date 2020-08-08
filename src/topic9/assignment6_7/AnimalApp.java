package topic9.assignment6_7;

import javax.swing.*;
import java.util.ArrayList;

public class AnimalApp {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Penguin("Pengy",-2,false));
        animals.add(new Penguin("Flapper",3, true));
        animals.add(new Elephant("Nelly",4,true));
        animals.add(new Elephant("Tiny",6,false));

        ArrayList<String>hungryAnimalArray = new ArrayList<>();
        int hungryAnimal = 0;
        String hungryNames = "";
        for(Animal a : animals){
         if(a.isHungry()){ AnimalKeeper.feedAnimal(a);
                hungryAnimal++;
         hungryNames += hungryNames.concat(a.getName())+", ";}

         else {
               AnimalKeeper.trickAnimal(a);}
        }
        JOptionPane.showMessageDialog(null,"No of hungry animals "+hungryAnimal+"\nNames: " +
                hungryNames.substring(0,hungryNames.lastIndexOf(',')));


    }
}
