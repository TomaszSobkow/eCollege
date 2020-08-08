package topic2.Assignemnt1_3;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortStringArray {

    void sortArray() {
        List<String> names = new ArrayList<>();
        names.add("Jasio");
        names.add("Krzys");
        names.add("Ola");
        names.add("Alla");

        Collections.sort(names);
        for(String name:names){
            System.out.print(name+" ");
        }

    }



}
