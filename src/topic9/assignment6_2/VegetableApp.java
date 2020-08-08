package topic9.assignment6_2;

import java.util.ArrayList;
import java.util.List;

public class VegetableApp  {

    static List<Vegetable> vectableAarray = new ArrayList();
    public static void main(String[] args) {

        Carrot carrot = new Carrot("Carrot","Apiaceae");
        Pea pea = new Pea("Pea","Legumes");
        Corn corn = new Corn("Corn","Gramineae");
        vectableAarray.add(carrot);
        vectableAarray.add(pea);
        vectableAarray.add(corn);

        for(Vegetable v : vectableAarray){
            System.out.println(v);
            v.howToCook();
            v.addAddactives();


        }


    }

}
