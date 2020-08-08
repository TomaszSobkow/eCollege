package topic3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignemt3_6 {
    public static void main(String[] args) {
        String description = "The following people have booked their place on the trip: ";
        List<String> myList = new ArrayList<>();
        myList.add("Fred Smith");
        myList.add("Helena Davis");
        myList.add("Brian Burrows");
        myList.add("Jane Beagles");
        for (String l: myList){
            System.out.println(l);
        }

    }
}
