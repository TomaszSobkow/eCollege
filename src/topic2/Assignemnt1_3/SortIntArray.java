package topic2.Assignemnt1_3;


import java.util.Arrays;

public class SortIntArray {

    void sortIntArray(){
        int[] numbers = {334,544,5,678,7363};
        Arrays.sort(numbers);
        for(int number : numbers){
        System.out.print(number+" ");
        }
    }


    public static void main(String[] args) {
        new SortStringArray().sortArray();
        System.out.println("");
        new SortIntArray().sortIntArray();
    }

}
