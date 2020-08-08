package topic5;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MoreTests {


static int c = 12;


    public static void main(String[] args) {

        String[] names = {"Tom", "Aga", "Wojtek"};
        Integer[] numbers = {1, 4, 6, 9, 12, 345, 67};

        List nameList = Arrays.asList(names);
        System.out.println("nameList "+nameList);

        List numbersList = Arrays.asList(numbers);
        System.out.println("numbersList "+ numbers);

        Object[] numbersPrimytive = numbersList.toArray();



        }


    }


